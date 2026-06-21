public class Formatodesaida {
    public static void main(String[] args) {

    //printf() - is a method used to format output

    //% [flags], [width],[.precision],[specifier-character] ---!!!! importante, esse é o formato sempre!!!!


    String name = "Superman";
    char firstLetter = 'S';
    int age = 30;
    double height = 1.80;
    boolean isEmployed = true;



    System.out.printf("Hello %s\n", name);
    System.out.printf("Your name starts with %c\n", firstLetter);
    System.out.printf("You are %d years old\n", age);
    System.out.printf("You are %.1f m tall\n", height);
    System.out.printf("You are employed: %b\n", isEmployed);


 System.out.printf("%s is %d years old" , name, age );

}
}