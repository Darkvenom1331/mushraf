import java.util.*;

public class SelectionSort {
    int n;
    int arr[] = new int[10];

    void getElement()

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements your want to store:");
        n = sc.nextInt();
        System.out.println("Enter the number of elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.println("\t" + arr[i]);
        }
    }

    void selectionSort() {
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println("selection Sorted Element are:");
        for (int i = 0; i < n; i++) {
            System.out.println("\t" + arr[i]);
        }
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        sort.getElement();
        sort.selectionSort();
    }
}
