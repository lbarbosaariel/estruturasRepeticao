import java.util.Scanner;

public class exercicio1repeticao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println(" Digite um numero inteiro:");
        numero = entrada.nextInt();

        for ( int i= 0; i <= 10; i++)
        {
            int resultado = i*numero;
            System.out.println( numero+ "X"+ i+ "=" + resultado);
        }



    }
}
