import java.util.Scanner;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class SamsaStudents {

    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentsQueue = new LinkedList<>();
        Queue<Integer> samsaQueue = new LinkedList<>();
        for (int i = 0; i < sandwiches.length; i++) {
            studentsQueue.add(students[i]);
            samsaQueue.add(sandwiches[i]);
        }
        do {
            if (!studentsQueue.isEmpty()) {
                if (Objects.equals(studentsQueue.peek(), samsaQueue.peek())) {
                    studentsQueue.poll();
                    samsaQueue.poll();
                } else {
                    if (!studentsQueue.contains(samsaQueue.peek())) {
                        break;
                    }
                    studentsQueue.add(studentsQueue.poll());
                }
            }
        } while (!studentsQueue.isEmpty());
        return studentsQueue.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] students = new int[n];
        System.out.println("Enter the preference of each student (0 for krugly samsa, 1 for kwadratnyi samsa): ");
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }
        System.out.print("Enter the number of samsa: ");
        int m = sc.nextInt();
        int[] samsa = new int[m];
        System.out.println("Enter the type of each samsa (0 or 1): ");
        for (int i = 0; i < m; i++) {
            samsa[i] = sc.nextInt();
        }

        SamsaStudents samsaStudents = new SamsaStudents();
        System.out.println("Number of students who will not get a samsa: " + samsaStudents.countStudents(students, samsa));
    }
}
