import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        

  Scanner escaneia = new Scanner(System.in);

  System.out.println("Por favor, digite o número da Agência !");
int numero = escaneia.nextInt();

  System.out.println("Por favor, digite o nome da Agência !");
  String agencia = escaneia.next();

  System.out.println("Por favor, digite o seu nome !");
  String nomeCliente = escaneia.next();

  System.out.println("Por favor, digite o saldo da Agência !");
  double saldo = escaneia.nextDouble();

  System.out.println(   "Olá "+nomeCliente+
   ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+  
  ", conta "+numero+" e seu saldo ("+saldo+") já está disponível para saque");

    }
    
}