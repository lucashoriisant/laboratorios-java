import java.util.Locale;
import java.util.Scanner;

    public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero = 0;
        String agencia;
        String nomeCliente;
        double saldo = 0;

        //TODO: Conhecer e importar a classe Scanner

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Exibir as mensagens para o nosso usuário  //TODO: Obter por meio do scanner os valores digitados no terminal

            System.out.println("Por favor, digite o seu nome!");
            nomeCliente = scanner.next();

            System.out.println("Por favor, digite o numero da sua conta!");
            numero = scanner.nextInt();

            System.out.println("Por favor, digite o numero da Agencia!");
            agencia = scanner.next();

        //TODO: Exibir a mensagem da conta criada
            System.out.println("Ola " + nomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + " , conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque");
    
    }

}
