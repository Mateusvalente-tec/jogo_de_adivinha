import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        // Gera o numero alaeatorio de 0 a 100
        int numeroSecreto = random.nextInt(101);

        System.out.println("🎲 Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");
        System.out.println("Você tem até 5 tentativas.");

        //Loop para realizar controle das tentativas
        int tentativa;
        for (tentativa = 1; tentativa <= 5; tentativa++) {
            System.out.print("Tentativa " + tentativa + ": Digite seu palpite: ");
            int palpite = leitura.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabens! Você acertou o número.");
                break; // finaliza o loop
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor que " + palpite + ".");
            } else {
                System.out.println("O número secreto é maior que " + palpite + ".");
            }
        }
        //Se for a ultima tentativa e ainda não acertou.
        if (tentativa > 5) {
            System.out.println("Suas tentativas acabaram. O numero era: " + numeroSecreto);
        }

        leitura.close();
    }

}
