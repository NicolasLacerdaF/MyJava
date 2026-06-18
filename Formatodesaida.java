public class Formatodesaida {
    public static void main(String[] args) {

    //printf() - is a method used to format output

    //% [flags], [width],[.precision],[specifier-character]


    String name = "Spongebob";
    char firstLetter = 'S';
    int age = 30;
    double height = 60.5;
    boolean isEmployed = true;



    System.out.printf("Hello %s\n", name);

    System.out.printf("Your name starts with %c\n", firstLetter);

    System.out.printf("You are %d years old\n", age);

}
}