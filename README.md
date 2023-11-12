# Sistema Bancário Simples

## Descrição
Este projeto implementa um sistema bancário simples em Java. Ele consiste em classes que representam um titular de conta (`Titular`), um serviço bancário (`BancoService`), e um menu de interação via console (`BancoMenu`).

## Tecnologias Utilizadas
- **Java**: Linguagem de programação principal.
- **JUnit**: Framework de testes.
- **Scanner**: Utilizado para capturar a entrada do usuário no console.

## Estrutura do Projeto

### Módulo `model`
Contém a classe `Titular`, que representa as informações de um titular de conta.

### Módulo `service`
Contém a classe `BancoService`, que fornece métodos para realizar operações bancárias, como saque, depósito e consulta de saldo.

### Módulo `menu`
Contém a classe `BancoMenu`, que implementa um menu simples para interação do usuário com o sistema bancário.

## Como Executar o Projeto

1. Clone o repositório.
2. Abra o terminal na pasta do projeto.
3. Execute o comando `./gradlew run` para compilar e executar a aplicação.

## Funcionalidades do Sistema

1. **Saque**: Permite ao titular realizar saques, verificando se há saldo disponível.

2. **Depósito**: Permite ao titular realizar depósitos.

3. **Consulta de Saldo**: Exibe o saldo atual da conta.

4. **Encerramento do Programa**: Permite ao titular sair do programa.

## Instruções de Uso
- Ao iniciar o programa, o usuário é solicitado a fornecer informações sobre o titular da conta (nome, agência, conta e saldo inicial).
- O programa exibe um menu com opções numeradas para o usuário escolher a operação desejada.
- Após cada operação, o programa exibe o resultado da operação e o saldo atualizado.
- O programa continua em execução até que o usuário escolha a opção para encerrá-lo.

## Observações
- Não há persistência de dados. Todas as informações são mantidas em memória durante a execução do programa.
- Este é um sistema de exemplo para fins educacionais, e não representa um sistema bancário real.
