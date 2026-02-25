# BuscaCEP - Kotlin Android

Aplicação Android desenvolvida em Kotlin para buscar informações de CEP.

## Pré-requisitos

Antes de começar, certifique-se de ter instalado:

- **Android Studio** (versão recente)
- **JDK 11 ou superior**
- **Git**
- **Gradle** (incluído no Android Studio)

## Clonar o Repositório

```bash
git clone https://github.com/emanueleborges/unicamp-android-kotlin-buscacep.git
cd KotlinAndroid
```

## Compilar a Aplicação

### Usando Android Studio

1. Abra o Android Studio
2. Selecione **File > Open** e navegue até a pasta do projeto
3. Aguarde o Gradle sincronizar o projeto
4. Clique em **Build > Make Project** ou pressione **Ctrl+F9**

### Usando o Terminal

```bash
# Windows
./gradlew build

# macOS/Linux
./gradlew build
```

## Executar a Aplicação

### Usando Android Studio

1. Conecte um dispositivo Android via USB ou use um emulador
2. Clique em **Run > Run 'app'** ou pressione **Shift+F10**
3. Selecione o dispositivo desejado
4. A aplicação será instalada e executada automaticamente

### Usando o Terminal

```bash
# Windows
./gradlew installDebug

# macOS/Linux
./gradlew installDebug
```

## Criar APK

### Debug APK (para testes)

```bash
# Windows
./gradlew assembleDebug

# macOS/Linux
./gradlew assembleDebug
```

O arquivo APK será gerado em: `app/build/outputs/apk/debug/app-debug.apk`

### Release APK (para produção)

```bash
# Windows
./gradlew assembleRelease

# macOS/Linux
./gradlew assembleRelease
```

O arquivo APK será gerado em: `app/build/outputs/apk/release/app-release.apk`

**Nota:** Para criar Release APK, é necessário configurar a assinatura da aplicação. Consulte a [documentação oficial do Android](https://developer.android.com/studio/publish/app-signing) para mais detalhes.

## Estrutura do Projeto

```
KotlinAndroid/
├── app/                    # Módulo principal da aplicação
│   ├── src/
│   │   ├── main/          # Código-fonte principal
│   │   ├── androidTest/   # Testes instrumentados
│   │   └── test/          # Testes unitários
│   └── build.gradle.kts   # Configuração do Gradle
├── gradle/                # Configurações do Gradle
├── build.gradle.kts       # Arquivo de build raiz
├── settings.gradle.kts    # Configurações globais
└── README.md
```

## Dependências Principais

- Kotlin Standard Library
- Android Framework
- Jetpack Compose (se utilizado)
- AndroidX

## Troubleshooting

### Erro ao sincronizar Gradle
- Limpe o cache do Gradle: `./gradlew clean`
- Invalide o cache do Android Studio: **File > Invalidate Caches > Invalidate and Restart**

### Erro ao executar no dispositivo
- Certifique-se de que o modo desenvolvedor está ativado no dispositivo
- Verifique a conexão USB
- Reinstale os drivers ADB se necessário

### Erro ao compilar
- Execute `./gradlew clean build` para limpeza completa
- Verifique se todas as dependências estão atualizadas

## Contribuindo

Para contribuir com o projeto, faça um fork, crie uma branch para sua feature e envie um pull request.

## Licença

Este projeto é fornecido como-é para fins educacionais.

## Contato

Para dúvidas ou sugestões, abra uma issue no repositório do GitHub.
