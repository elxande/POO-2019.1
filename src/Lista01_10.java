import java.util.Scanner;

public class Lista01_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float n1;
        int qtdDivisoes = 0;

        System.out.print("Digite um número: ");
        n1 = sc.nextInt();

        while (n1>1){
            n1 = n1/2;
            qtdDivisoes++;
        }
        System.out.println("Resultado da última divisão: "+ n1 +
                            "\nQuantidades de divisões: " + qtdDivisoes);

    }
}
