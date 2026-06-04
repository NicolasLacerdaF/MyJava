import java.util.Scanner;

public class ExtraClassMath {
    public static void main(String[] args) {

//hipotenusa c = Math.sqrt(a)

        Scanner scanner = new Scanner(System.in);


        double a;
        double b;
        double c;

        System.out.println("Adicone o tamanho do lado A:");
        a = scanner.nextDouble();

        System.out.println("Adicone o tamanho do lado B:");
        b = scanner.nextDouble();
        
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); //c = raiz quadrada de (a elevado a 2 + b elevado a 2)

        System.out.println("A hipotenusa (lado c é):" + c);
    
        scanner.close();
    }
}