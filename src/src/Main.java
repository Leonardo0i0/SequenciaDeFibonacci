import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        boolean opcao = false;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Informe um numero inteiro para verificar se faz parte da sequencia de Fibonacci");
            numero = teclado.nextInt();

            String resultado = calculo.verificaFibonacci(numero);
            System.out.println(resultado);
        }while(!opcao);

    }
}