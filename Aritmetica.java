public class Aritmetica {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Soma
        int sum = a + b;
        System.out.println("Soma: " + sum);

        // Subtração
        int difference = a - b;
        System.out.println("Subtração: " + difference);

        // Multiplicação
        int product = a * b;
        System.out.println("Multiplicação: " + product);

        // Divisão
        int quotient = a / b;
        System.out.println("Divisão: " + quotient);

        // Resto (módulo)
        int remainder = a % b;
        System.out.println("Resto: " + remainder);


        // Operadores de incremento e decremento
        a++; // Incrementa a em 1
        a++; // Incrementa a em 1 novamente
        System.out.println("Incremento: " + a); 

        b--; // Decrementa b em 1
        System.out.println("Decremento: " + b);
    }

}
