import java.util.Scanner;

public class ExtraClassMathcopy  {
    public static void main(String[] args) {
    
//circunferencia = 2 * Math.PI * raio
//area = Math.PI * Math.pow(raio, 2)
//volume = (4/3) * Math.PI * Math.pow(raio, 3)

        Scanner scanner = new Scanner(System.in);

        double raio;
        double circunferencia;
        double volume;
        double area;


        System.out.println("Adicone o tamanho do raio:");
        raio = scanner.nextDouble();

        circunferencia = 2 * Math.PI * raio;
        area = Math.PI * Math.pow(raio ,2);
        volume = (4/3) * Math.PI * Math.pow(raio, 3);

        System.out.printf("A circunferencia é %.1fcm\n", circunferencia);

        System.out.printf("A area é %.1fcm²\n", area);

        System.out.printf("O volume é %.1fcm³\n",volume);

        scanner.close();
    }
}