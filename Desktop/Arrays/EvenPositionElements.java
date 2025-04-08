import java.util.Scanner;

public class EvenPositionElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for size first
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements at even positions (index 0, 2, 4...):");
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                System.out.println("Element at index " + i + " is " + arr[i]);
            }
        }

        sc.close();
    }
}
