import java.util.Scanner;

public class Lista01_09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        int qtdPares = 0, qtdImpares = 0;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        for(int i=n1; i<=n2; i++) {
            if (i%2 == 0){
                qtdPares++;
            }else{
                qtdImpares++;
            }
        }

        System.out.println("Quantidade de números PAR: " + qtdPares + "\nQuantidade de números IMPAR: " + qtdImpares +
                            "\nSoma dos Números: " + (n1+n2));

    }
}
