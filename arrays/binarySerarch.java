import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                found = true;
                System.out.println("Found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }
}
