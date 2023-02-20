import java.util.*;

public class githubassignment {
    public static void main(String[] args) {

        String menu = "********************MAIN MENU*********************" + '\n'
                + "**************************************************" + '\n'
                + "1-Display the Array" + '\n'
                + "**************************************************" + '\n'
                + "2-Find Maximum Value" + '\n'
                + "**************************************************" + '\n'
                + "3-Find Minimum Value" + '\n'
                + "**************************************************" + '\n'
                + "4-Find Difference Between Each Element and Average" + '\n'
                + "**************************************************" + '\n'
                + "5-Find Sum of Elements with Odd-Numbered Indexes" + '\n'
                + "**************************************************" + '\n'
                + "6-Find Sum of Elements with Even-Numbered Indexes" + '\n'
                + "**************************************************" + '\n'
                + "7-Exit" + '\n'
                + "**************************************************";

        Random rand = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter size of the array: ");
        int sizeOfTheArray = scanner.nextInt();
        scanner.nextLine();
        int randomArray[] = new int[sizeOfTheArray];

        for (int i = 0; i < randomArray.length; i++) {

            randomArray[i] = rand.nextInt(101);
        }

        boolean bool = true;

        while (bool) {
            System.out.println(menu);

            // Take input from user to choose operation.
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Please Choose Your Operation: ");
            int operation = scanner2.nextInt();

            if (operation == 1) {
                System.out.println(Arrays.toString(randomArray));
            }
            else if (operation == 2) {
                System.out.println("Maximum element of given array is " + maxElement(randomArray));
            }

            else if (operation == 3) {
                System.out.println("Minimum element of given array is " + minElement(randomArray));
            }

            else if (operation == 4) {
                System.out.println("\n" + Arrays.toString(randomArray));
                githubassignment.calcAvgDiff(randomArray);
            }

            else if (operation == 5) {
                System.out.println(
                        '\n' + "Sum of Elements with Odd-Numbered Indexes: " + sumOddIndex(randomArray) + '\n');
            }

            else if (operation == 6) {
                System.out.println(
                        '\n' + "Sum of Elements with Even-Numbered Indexes: " + sumEvenIndex(randomArray) + '\n');
            }

            else if (operation == 7) {
                bool = false;
            }

        }

    }
