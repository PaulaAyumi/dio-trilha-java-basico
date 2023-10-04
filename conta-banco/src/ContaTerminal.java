import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Conhecer e importar a classe Scanner
        Scanner teclado = new Scanner(System.in);

        //Exibir as mensagens para os nossos usuários

        //Obter pelo Scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da sua conta: ");
        int numero = teclado.nextInt();

        System.out.println("Por favor, digite a sua Agência: ");
        String agencia = teclado.next();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = teclado.next();

        System.out.println("Digite o valor que você deseja depositar: ");
        double saldo = teclado.nextDouble();

        //Exibir a mensagem conta criada
        System.out.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque. ", nomeCliente, agencia, numero, saldo);
    }
}
