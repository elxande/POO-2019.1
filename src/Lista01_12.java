import java.util.Scanner;

public class Lista01_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        for(int i=0; i<=10; i++) {
            System.out.println("Quadrado de: " + i + " = " + Math.pow(i,2) + "| Cubo de: "+i+" = " + Math.pow(i,3));
        }
    }
}
