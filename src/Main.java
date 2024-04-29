import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int guardaNumero;

        System.out.println("Deseja criar uma lista de quantos numeros?");
        int n = leitor.nextInt();

        System.out.println("A opção escolhida foi de " + n + " numeros, digite seus numeros para a lista");
        int[] listaDeNumeros = new int[n];

        for (int i = 0; i < n; i++) {
            guardaNumero = leitor.nextInt();
            listaDeNumeros[i] = guardaNumero;
        }

        System.out.println("Invertendo sua lista...");

        for (int i = 0; i < listaDeNumeros.length / 2; i++) {
            guardaNumero = listaDeNumeros[i];
            listaDeNumeros[i] = listaDeNumeros[listaDeNumeros.length - 1 - i];
            listaDeNumeros[listaDeNumeros.length - 1 - i] = guardaNumero;
        }

        //mostralista
        for (int listaDeNumero : listaDeNumeros) {
            System.out.println(listaDeNumero);
        }
    }
}
