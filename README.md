# Banco Simples em Java utilizando Conceitos de Programação Orientada a Objetos

## Descrição
Este é um projeto didático que implementa um banco simples em Java, seguindo os princípios da Programação Orientada a Objetos (POO). O sistema é composto por classes que representam contas de clientes, operações bancárias básicas e um mecanismo para gerenciar o saldo dos clientes.

## Funcionalidades
1. **Conta Bancária:** A classe `Conta` é uma classe abstrata que representa uma conta bancária e inclui métodos para depósito, saque e consulta de saldo. Ela não pode ser instanciada diretamente como uma conta, mas serve como classe base para as contas específicas.

2. **Cliente:** A classe `Titular` é responsável por criar objetos que representam os clientes do banco, armazenando informações como nome, CPF e número da conta.

3. **Banco:** A classe `Banco` é o sistema principal do banco, permitindo a criação de novas contas para clientes, o acesso às informações das contas e a realização de operações bancárias.

## Como Usar
1. Clone o repositório para o seu ambiente local.
```bash
git clone https://github.com/diogosflorencio/my-own-bank.git
```

2. Abra o projeto em sua IDE Java preferida.

3. Compile o projeto e verifique se não há erros.

4. Execute a classe principal `Testador.java` para iniciar o sistema do banco.

5. No menu (ainda não criado), você poderá escolher opções para criar novas contas, realizar operações bancárias ou consultar informações de contas.

## Exemplo de Uso
```java
public class Testador {

	public static void main(String[] args) {
		
		Titular tt1 = new Titular("Diogo", "123-321");
		
		Conta cc1 = new ContaCorrente(123, tt1);
		Conta cc2 = new ContaCorrente(123, tt1);
		
		System.out.println(Conta.ContadorDeContas);
	}
}
```

## Contribuição
Contribuições são bem-vindas! Caso deseje contribuir com melhorias, correções ou novas funcionalidades, basta seguir o fluxo padrão de Pull Requests do GitHub.

## Licença
Não há licenças específicas, sinta-se livre para usá-lo conforme suas necessidades.
