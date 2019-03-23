import java.util.Scanner;

public class Lista01_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome;
        int diarias;
        double valorTotal;

        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite a quantidade de dias: ");
        diarias = sc.nextInt();

        if (diarias > 15){
            valorTotal = (diarias*60) + (diarias*5.50);
            System.out.println("Hospede: " + nome + "\n" + "Valor a pagar: " + valorTotal);
        }else if (diarias == 15){
            valorTotal = (diarias*60) + (diarias*6.0);
            System.out.println("Hospede: " + nome + "\n" + "Valor a pagar: " + valorTotal);
        }else{
            valorTotal = (diarias*60) + (diarias*8.0);
            System.out.println("Hospede: " + nome + "\n" + "Valor a pagar: " + valorTotal);
        }

    }
}
