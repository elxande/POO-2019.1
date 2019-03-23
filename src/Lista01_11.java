import java.util.Scanner;

public class Lista01_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float soma = 0;
        int qtdPedidos, qtdProdutos = 0;
        int codigo;
        int qtd = 0;


        System.out.print("Digite a quantidade de pedidos: ");
        qtdPedidos = sc.nextInt();

        while (qtdPedidos > qtdProdutos){
            System.out.print("Digite o código do produto: ");
            codigo = sc.nextInt();
            System.out.print("Digite a quantidade: ");
            qtd = sc.nextInt();
            qtdProdutos += qtd;
            if (codigo == 10){
                soma += qtd*1.50;
            }else if(codigo == 11){
                soma += qtd*1.80;
            }else if(codigo == 12){
                soma += qtd*1.90;
            }else if(codigo == 20){
                soma += qtd*10.0;
            }else if(codigo == 30){
                soma += qtd*8.0;
            }else if(codigo == 50){
                soma += qtd*2.50;
            }

        }
        if(soma > 50) {
            soma = soma -(soma*0.05f);
            System.out.println("Valor Total: " + soma);
        }else{
            System.out.println("Valor Total: " + soma);
        }

    }
}
