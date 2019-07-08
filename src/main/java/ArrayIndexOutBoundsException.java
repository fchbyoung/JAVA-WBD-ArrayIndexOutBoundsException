import java.util.Scanner;

public class ArrayIndexOutBoundsException {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter the index òf any element: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Value of the index element " + index + " is: " + arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("The index crosses the limit of the array!");
        }
    }
}
