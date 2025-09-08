import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite Dois numeros:");
        int a = 0;
        int b = 0;
        a = ler.nextInt();
        b = ler.nextInt();
        int soma = a + b;
        System.out.println("SOMA = "+soma);

    }
}
