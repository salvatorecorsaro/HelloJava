import java.util.Random;

public class ExerciseDayOne {

    public static void main(String[] args) {


//        Exercise 1 = Write a program that first write a welcome message using
//    a "full name" attribute. Then write a message announcing the reserved number. the reserved number
//        is a random integer + 11. Then it prints a goodbye message with the name in upper
//    case and all the spaces converted to ' _' .
        salutation("Carlos Demi");
        salutation("Felix REfer");


    }

    public static void salutation(String fullName){
        int reservedNumber = new Random().nextInt() +11;
        System.out.println("Welcome" + fullName);
        System.out.println("Your reserved num is: " + reservedNumber);
        System.out.println("Goodbye " + fullName
                .toUpperCase()
                .replaceAll(" ", "_"));
    }
}
