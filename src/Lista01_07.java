import java.util.Scanner;

public class Lista01_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.print("Digite sua nota: ");
        nota = sc.nextDouble();

        if (nota >= 0 && nota < 50.0){
            System.out.print("Desempenho Insuficiente!");
        }else if(nota >= 50 && nota < 65.0){
            System.out.print("Desempenho Regular!");
        }else if(nota >= 65 && nota < 85){
            System.out.print("Desempenho Bom!");
        }else if(nota >= 85 && nota <= 100){
            System.out.print("Desempenho Ótimo!");
        }else{
            System.out.print("Nota Inválida!");
        }
    }
}
