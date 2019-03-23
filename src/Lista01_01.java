import java.util.Scanner;

public class Lista01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double velocidade;
        double velocidadeKm;

        System.out.print("Digite sua velocidade em m/s: ");
        velocidade = sc.nextDouble();

        velocidadeKm = velocidade*3.6;

        System.out.print("Sua Velocidade em Km/h: " + velocidadeKm);
    }
}
