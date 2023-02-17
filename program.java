import java.util.Scanner;
import java.time.LocalDateTime;

public class program {
    public static void main(String[] args) {
        System.out.println("bye world");
        Scanner iScanner = new Scanner(System.in);
        System.out.println();

        String name = iScanner.nextLine();
        System.out.printf("Привет, %s ", name);
        iScanner.close();
        System.out.println();

        int[] arr1 = new int[10];
        int[] arr2 = new int[] {1, 2, 3, 4, 5};
        System.out.printf("Вывод на консоль по аргументу, %d, %d", arr1[3], arr2[0]);
        System.out.println();

        System.out.println(LocalDateTime.now());
    }
}
