import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class HeapMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter integers (enter any non-integer value to end input): ");
        while (scanner.hasNextInt()) {
            arr.add(scanner.nextInt());
        }

        int N = arr.size();
        int star = (N / 2) - 1;

        for (int i = star; i >= 0; i--) {
            heapify(arr, N, i);
        }

        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    static void heapify(List<Integer> arr, int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr.get(l) > arr.get(largest)) {
            largest = l;
        }

        if (r < N && arr.get(r) > arr.get(largest)) {
            largest = r;
        }

        if (largest != i) {
            int swap = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, swap);
            heapify(arr, N, largest);
        }
    }
}

