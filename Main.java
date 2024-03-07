import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        System.out.print("Digite Un numero para calcular los numeros primos y la sucesion de fibonaci: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        NumeroPrimo primo = new NumeroPrimo(num);
        primo.IdentificarPrimos();
        primo.mostrarArreglo();

        Fibonacci fibonacci = new Fibonacci(num);
        fibonacci.llenar();
        fibonacci.mostrarArreglo();

    }
}
