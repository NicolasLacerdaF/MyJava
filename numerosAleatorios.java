import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
        // Gerar um número aleatório entre 0 e 1
        double randomNum = Math.random();
        System.out.println("Número aleatório entre 0 e 1: " + randomNum);

        // Gerar um número aleatório entre 0 e 100
        int randomInt = (int)(Math.random() * 101);
        System.out.println("Número aleatório entre 0 e 100: " + randomInt);

        // Gerar um número aleatório entre 50 e 150
        int randomIntRange = (int)(Math.random() * 101) + 50;
        System.out.println("Número aleatório entre 50 e 150: " + randomIntRange);

        Random random = new Random();
        boolean isTrue = random.nextBoolean();

        if (isTrue == true) {
            System.out.println("O valor booleano é verdadeiro.");
        } else {
            System.out.println("O valor booleano é falso.");
        }

    }
}
