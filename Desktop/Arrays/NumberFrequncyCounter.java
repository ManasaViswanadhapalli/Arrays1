import java.util.Scanner;

public class NumberFrequncyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for size first
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[size];

        System.out.println("Count frequency of each number:");
        for (int i = 0; i < size; i++) {
            if (visited[i]) continue;

            int Count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    Count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occurs " + Count + " times");
        }

        sc.close();
    }
}
