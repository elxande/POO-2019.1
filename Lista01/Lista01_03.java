import java.util.Scanner;

public class Lista01_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.print("Digite a nota1: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a nota2: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite a nota3: ");
        nota3 = sc.nextDouble();

        media = ((nota1*2)+(nota2*3)+(nota3*5))/10;

        System.out.print("Média do aluno: " + media);
    }
}
