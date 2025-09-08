import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = 30;
        int b = 0;
        a = ler.nextInt();
        b = ler.nextInt();
        int soma = a + b;
        System.out.println("SOMA = "+soma);
    }
}
