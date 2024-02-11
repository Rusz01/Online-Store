// Importing scanner class from java utility
import java.util.Scanner;

// Creating a public class
public class onlineStore {

    //Creating a method to inlist product name and their price

    public static void items() {
        System.out.println("~~Choose a product or press 0 to exit~~");
        System.out.println("|      1. T-shirt            £28      |");
        System.out.println("|      2. Shirt              £48      |");
        System.out.println("|      3. Pant               £68      |");
        System.out.println("|      4. Hat                £28      |");
        System.out.println("|      5. Jacket             £218     |");
        System.out.println("|      6. Trouser            £58      |");
        System.out.println("|      7. Hoodie             £78      |");
        System.out.println("|      8. Socks              £18      |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    //Creating a main class
    public static void main(String[] args) {
        int total = 0, p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0, p8 = 0;
        // Creating object of scanner class
        Scanner inputObj = new Scanner(System.in);
        System.out.println("************** Welcome to R.B. Traders **************");
        while (true) {
            items();
            int input = inputObj.nextInt();


            switch (input) {
                case 1:
                    System.out.println("Enter the quantity");
                    p1 = inputObj.nextInt();
                    break;
                case 2:
                    System.out.println("Enter the quantity");
                    p2 = inputObj.nextInt();
                    break;
                case 3:
                    System.out.println("Enter the quantity");
                    p3 = inputObj.nextInt();
                    break;
                case 4:
                    System.out.println("Enter the quantity");
                    p4 = inputObj.nextInt();
                    break;
                case 5:
                    System.out.println("Enter the quantity");
                    p5 = inputObj.nextInt();
                    break;
                case 6:
                    System.out.println("Enter the quantity");
                    p6 = inputObj.nextInt();
                    break;
                case 7:
                    System.out.println("Enter the quantity");
                    p7 = inputObj.nextInt();
                    break;
                case 8:
                    System.out.println("Enter the quantity");
                    p8 = inputObj.nextInt();
                    break;


                default:


                    total = p1 * 28 + p2 * 48 + p3 * 68 + p4 * 28 + p5 * 218 + p6 * 58 + p7 * 78 + p8 * 18;

                    System.out.println("\n\n\n******************** Thank you for shopping ******************** \n");
                    System.out.println("Your purchase includes");
                    System.out.println("Product Name:     Quantity     Price");

                    // creating if statement for purchase
                    if (p1 != 0) {
                        System.out.println("\tT-shirt " + "\t\t" + p1 + "\t\t\t" + "28" + "\n");
                    }
                    if (p2 != 0) {
                        System.out.println("\tShirt " + "\t\t\t" + p2 + "\t\t\t" + "48" + "\n");
                    }
                    if (p3 != 0) {
                        System.out.println("\tPant " + "\t\t\t" + p3 + "\t\t\t" + "68" + "\n");
                    }
                    if (p4 != 0) {
                        System.out.println("\tHat " + "\t\t\t" + p4 + "\t\t\t" + "28" + "\n");
                    }
                    if (p5 != 0) {
                        System.out.println("\tJacket " + "\t\t " + p5 + "\t\t\t" + "218" + "\n");
                    }
                    if (p6 != 0) {
                        System.out.println("\tTrouser " + "\t\t" + p6 + "\t\t\t" + "58" + "\n");
                    }
                    if (p7 != 0) {
                        System.out.println("\tHoodie " + "\t\t " + p7 + "\t\t\t" + "78" + "\n");
                    }
                    if (p8 != 0) {
                        System.out.println("\tSocks " + "\t\t  " + p8 + "\t\t\t" + "18" + "\n");
                    }
                    System.out.println("\tTotal: " + total);
                    break;
            }
        }
    }
}


