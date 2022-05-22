import java.util.*;

public class BubbleSort {
    int n;
    int arr[] = new int[10];

    void getElement()

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store:");
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

    void bubSort() {
        int temp=0;
        for (int i = 0; i < n ; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (arr[j-1] < arr[j]) {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
         }
        System.out.println("bubble Sorted Element are:");
        for (int i = 0; i < n; i++) {
            System.out.println("\t" + arr[i]);
        }
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        sort.getElement();
        sort.bubSort();
    }
}
