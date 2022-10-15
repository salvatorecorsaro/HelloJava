import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainDayTwo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to day two!");


//        conditions

        var statusCode = 1;

        boolean cond2 = statusCode < 10 && statusCode > 5;
        if (statusCode == 10) {
            System.out.println("ESTOY_AQUI");
//            System.out.println("Status code > of 10");
        } else if (cond2) {

            System.out.println("case -> statusCode < 10 && statusCode> 5");
        } else {
            System.out.println("default case");
        }


        String statusString = "two";
        if (statusString.equals("one")){
            System.out.println("strings are queals");
        }



//        switch (true) {
////            case (statusString.equals("one") || statusString )  -> System.out.println("one");
////            case "two" -> System.out.println("two");
//            default -> System.out.println("default");
//        }

//        iterations


        for (int i = 20; i >= 0; i--) {
            System.out.println("tic toc " + i);
            var r = new Random();


//            Thread.sleep(r.nextInt(300, 1500));
        }
        System.out.println("BANG");

        int j = 1;
        do {
            System.out.println("tic toc " + j);
            j++;
        } while(j < 10);

//        collections

        var name1 = "Xavi";
        var name2 = "MAria";
        var name3 = "Domenek";

        var students = new ArrayList<String>();
        students.add(name1);
        students.add(name2);
        students.add(name3);

        System.out.println(students.get(1));

        for( int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }

        for (String student : students){
            System.out.println(student.toUpperCase());
        }


        var menu = new ArrayList<String>(
                List.of("pizza", "beyond burger", "paella", "calcots")
        );

        var menuToPrint = capitalizeMenu(menu);
        printAMenu(menuToPrint);




//        methods
//        git
    }

    public static ArrayList<String> capitalizeMenu(List<String> menu){
        var menuCapitalized = new ArrayList<String>();
        for (String dish : menu){
            menuCapitalized.add(dish.toUpperCase());
        }

        return menuCapitalized;
    }

    private static void printAMenu(ArrayList<String> menu) {
        for (String dish : menu){
            System.out.println(dish);
        }
    }

//    private static void printMenu() {
//        var menu = new ArrayList<String>(
//                List.of("pizza", "Beyond Burger", "Paella", "Calcots")
//        );
//
//        for (String dish : menu){
//            System.out.println(dish);
//        }
//    }
}
