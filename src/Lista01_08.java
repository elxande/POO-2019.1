import java.util.Scanner;

public class Lista01_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        double soma = 0;
        int maior = 0, menor = 0;

        for(int i=0; i<10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            soma = soma + numeros[i];
            if (i == 0){
                menor = numeros[i];
                maior = numeros[i];
            }else if(numeros[i] < menor){
                menor = numeros[i];
            }else if(numeros[i] > maior){
                maior = numeros[i];
            }
        }

        System.out.println("Média dos Números: " + soma/10 +
                            "\nMaior Número: " + maior +
                            "\nMenor Número: "+menor);

    }
}