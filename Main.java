import java.util.Scanner;


public class Main {

    public static void main(String[] args){



        //Este é meu primeiro programa em java

        //Comentários são com 2 barras normais


        /* Comentário com mais de 1 linha
         é assim que se faz */

        //System.out.println("I Like Pizza\n");
        //System.out.println("It's really good!");
        //System.out.println("Buy me pizza!");

      //apreviação de SYSTEM OUT PRINT É "SOUT"(mágica)


int age = 21;
int year = 2024;
int quantity = 1;
    
double price = 9.99;
double temperatura = 9.99;
double desconto = 9.99;

char grade = 'A';
char symbol = '!';
char currency = '$';


boolean isStudent = false;
boolean forSale = true;
boolean isOnline = false;




    String name = "Nicolas"; //vale a pena lembrar que String é com S maiúsculo, pois é uma classe, e não um tipo primitivo
    String city = "New York"; //vale a pena lembrar que se deve usar aspas duplas para String, e não aspas simples, pois aspas simples são para char
    String email = "nicolas@example.com";
    String car = "Mustang";



    System.out.println("Hello, " + name + "! Welcome to " + city + ". Your email is " + email + " and you drive a " + car + ".");

if (forSale) {
    System.out.println("The " + car + " is for sale.");
} else {
    System.out.println("The " + car + " is not for sale.");
    
}


    }
}