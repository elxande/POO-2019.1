import java.util.Scanner;

public class Lista01_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        System.out.print("Digite a nota1: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a nota2: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite a nota3: ");
        nota3 = sc.nextDouble();
        System.out.print("Digite a nota4: ");
        nota4 = sc.nextDouble();

        media = (nota1+nota2+nota3+nota4)/4;

        if (media >= 7.0){
            System.out.print("Média do aluno: " + media + " - Aprovado!");
        }else if(media >=5){
            System.out.print("Média do aluno: " + media + " - Final!");
        }else{
            System.out.print("Média do aluno: " + media + " - Reprovado!");
        }
    }
}
