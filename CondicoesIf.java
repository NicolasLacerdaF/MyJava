import java.util.Scanner;

public class CondicoesIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("=== Classificador de Faixa Etária ===");
        System.out.println("Digite -10 para encerrar o programa.\n");

        while (true) {
            System.out.print("Digite sua idade: ");

            if (scanner.hasNextInt()) {
                age = scanner.nextInt();

                // Condição de saída (verificada PRIMEIRO para não entrar na validação de idade)
                if (age == -10) {
                    System.out.println("\nPrograma encerrado com sucesso! Até mais.");
                    break;
                }

                // Classificação por faixa etária
                if (age <= 0) {
                    System.out.println("Idade inválida. O valor deve ser maior que 0.\n");
                } else if (age < 3) {
                    System.out.println("Você é um bebê.👶\n");
                } else if (age < 12) {
                    System.out.println("Você é uma criança.🧒\n");
                } else if (age < 14) {
                    System.out.println("Você é um pré-adolescente.👦\n");
                } else if (age < 18) {
                    System.out.println("Você é um adolescente.👦\n");
                } else if (age < 24) {
                    System.out.println("Você é um jovem adulto.👨\n");
                } else if (age < 65) {
                    System.out.println("Você é um adulto.👨\n");
                } else {
                    System.out.println("Você é um idoso.👴\n");
                }
            } else {
                System.out.println("Entrada inválida! Por favor, digite apenas números inteiros.\n");
                scanner.next(); // Consome o token inválido para evitar loop infinito
            }
        }
        scanner.close();
    }   
}
