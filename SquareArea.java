import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a largura (ou 0 para sair): ");
            double width = scanner.nextDouble();

            if (width == 0) {
                System.out.println("Encerrando programa...");
                break; // sai do loop
            }

            System.out.print("Digite a altura: ");
            double height = scanner.nextDouble();

            double area = width * height;
            System.out.println("Área: " + area);
            System.out.println("------------------");
        }

        scanner.close();
    }
}
