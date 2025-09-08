import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite Dois numeros:");
        double a = 0;
        double b = 0;
        a = ler.nextDouble();
        b = ler.nextDouble();
        double soma = a + b;
        System.out.println("SOMA = "+soma);
        
    }
}
