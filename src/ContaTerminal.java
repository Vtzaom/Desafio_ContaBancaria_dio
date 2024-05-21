import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite aqui o número de sua conta:");
        int numero = input.nextInt();

        System.out.print("Digite aqui a sua agencia :");
        String agencia = input.next();

        System.out.print("Digite aqui a seu nome :");
        String nome_cliente = input.next(); 

        System.out.print("Digite aqui a seu saldo :");
        float saldo =  input.nextFloat();
        System.out.print(saldo);

        System.out.print("Olá "+nome_cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");


    
    
    }

}