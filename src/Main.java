/* I have neither given nor received any unauthorised aid on this piece of work */
import java.util.Scanner;
public class Main {
    public static int add(int numOne, int numTwo){
        return numOne +numTwo;
    }
    public static String greeting(String name){
        return "Bonjour, "+ name +"!";
    }
    public static int add(int numone, int numtwo, int numThree, int numFour){
        return add(numone,numtwo) + add(numThree, numFour);
    }

    public static String printMe(String toBePrinted){
        return toBePrinted;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number to add together");
        int numOne = scanner.nextInt();
        System.out.println("Please enter the second number to add together");
        int numTwo = scanner.nextInt();
        int resultOne = add(numOne, numTwo);
        System.out.println(resultOne);

        System.out.println("Please enter your name");
        String name = scanner.next();
        String resultTwo = greeting(name);
        System.out.println(resultTwo);

        System.out.println();
        System.out.println("Please enter the first number to add together");
        int numone = scanner.nextInt();
        System.out.println("Please enter the second number to add together");
        int numtwo = scanner.nextInt();
        System.out.println("Please enter the third number to add together");
        int numThree = scanner.nextInt();
        System.out.println("Please enter the fourth number to add together");
        int numFour = scanner.nextInt();
        int resultThree = add(numone, numtwo, numThree, numFour);
        System.out.println(resultThree);

        System.out.println("Please enter a line to print");
        String toBePrinted = scanner.next();
        System.out.println(printMe(toBePrinted));








    }

}
