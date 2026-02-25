
package com.example.kotlinandroid

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import okhttp3.*
import java.io.IOException

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    var cep by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }
    val client = OkHttpClient()

    fun searchCep() {
        val request = Request.Builder()
            .url("https://brasilapi.com.br/api/cep/v2/$cep")
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.e("HTTP", "Erro na requisição", e)
                result = "Erro na requisição"
            }

            override fun onResponse(call: Call, response: Response) {
                val responseData = response.body?.string()
                result = responseData ?: "Nenhum resultado"
            }
        })
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = cep,
            onValueChange = { cep = it },
            label = { Text("Digite o CEP") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { searchCep() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Consultar CEP")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(result)
    }
}
