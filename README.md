## TaskManager

App Android em Java com duas partes:

**Calculadora de soma (tela atual)**
- Dois campos para digitar números decimais
- Botão **Somar**, que exibe o resultado na tela
- Botão **Limpar**, que zera os campos e o resultado
- Aviso (Toast) quando algum campo está vazio

**Camada de dados para tarefas (em desenvolvimento)**
- Classe `Task` (id, título e descrição)
- `DatabaseHelper` com SQLite, com operações de inserir, listar, atualizar e excluir tarefas
- Ainda não conectada à interface

### Tecnologias
- Java 11
- Android SDK (minSdk 23)
- AndroidX AppCompat e ConstraintLayout
- SQLite

### Como rodar
1. Clone o repositório
2. Abra a pasta `TaskManager` no Android Studio
3. Aguarde a sincronização do Gradle
4. Execute em um emulador ou celular com Android 6.0 ou superior

### Próximos passos
- Criar a tela de lista de tarefas e ligar ao `DatabaseHelper`
