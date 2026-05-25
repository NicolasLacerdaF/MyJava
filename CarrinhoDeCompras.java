
import java.util.Scanner;
public class CarrinhoDeCompras {
    public static void main(String[] args) {

        // Criando um carrinho de compras simples

        Scanner scanner = new Scanner(System.in);

        String item;
        double preco;
        int quantidade;
        double total;
        char moeda = '$';

        System.out.print("Digite o nome do item: ");
        item = scanner.nextLine();
         
        System.out.print("Digite o preço do item?: ");
        preco = scanner.nextDouble();

        System.out.print("Digite a quantidade do item?: ");
        quantidade = scanner.nextInt();

        total = preco * quantidade; 

        System.out.println("O total da compra é: " + moeda + total);
        System.out.println("Obrigado por comprar " + quantidade + " " + item + "(s)" +"!");
        
        scanner.close();
    }
}
