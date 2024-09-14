import java.util.ArrayList;

public class calculo {
    public static ArrayList<Integer> calculaFibonacci(int limite){
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        while (fibonacci.get(fibonacci.size() - 1) < limite) {
            int proximo = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            fibonacci.add(proximo);
        }

        return fibonacci;
    }
    public static String verificaFibonacci(int numero) {
        ArrayList<Integer> sequencia = calculaFibonacci(numero);

        if (sequencia.contains(numero)) {
            return "O número " + numero + " pertence à sequência de Fibonacci.";
        } else {
            return "O número " + numero + " NÃO pertence à sequência de Fibonacci.";
        }
    }
}
