public class Formatodesaida2 {
    public static void main(String[] args) {



        // printf()  =  is a method used to format output
        // printf()  =  é um método para formatação de saída


        // %[flags][width][.precision][specifier=character] ---!!!! importante, esse é o formato sempre!!!!

             double preço1 = 9.99;
             double preço2 = 100.05;             
             double preço3 = -54.01;


        System.out.printf("%+.2f \n", preço1); //.1 significa que após a virgula vou querer apenas 1 digito
        System.out.printf("%+.1f \n", preço2); // arredonda 
        System.out.printf("%+.2f \n", preço3); // omite uma informação crucial

    }
}
// Algumas flags que vocês pode usar 

/*   * GUIA COMPLETO DAS FLAGS DO printf() EM JAVA
 * 
 * Estrutura: %[flags][width][.precision]specifier
 * 
 * FLAGS DISPONÍVEIS:
 * -   = Alinhamento à esquerda
 * 0   = Preenchimento com zeros
 * +   = Mostrar sinal para números positivos
 * ' ' = Espaço para números positivos
 * #   = Formato alternativo
 * ,   = Separador de milhares
 * (   = Números negativos entre parênteses
 */