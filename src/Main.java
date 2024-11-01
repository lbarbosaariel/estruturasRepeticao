import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite um número inteiro maior que zero:");
        int num = entrada.nextInt();

        if ( num > 0){
            System.out.println(" Seguem os números inteiros maiores que zero em ordem decrescente:");
            for ( int i = num; i > 0;i--){
                System.out.println(i);
            }

        }else {
            System.out.println(" Insira um número maior que zero");
        }



    }
}