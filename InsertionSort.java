import java.util.*;
public class InsertionSort
{
 int n;
 int arr[] = new int[10];

 void getElement() 
{
 Scanner sc =new Scanner(System.in);
 System.out.print("Enter the number of elements you want to store:");
 n=sc.nextInt();
 System.out.println("Enter the elements of array:");
 for (int i = 0; i < n; i++)
{
 arr[i] = sc.nextInt();
}
 System.out.println("Elements of the array are:");
 for (int i = 0; i < n; i++) 
{
 System.out.println("\t" + arr[i]);
}
}
void insertionSort() 
{
 for (int j = 1; j < n; j++) 
{
 int key = arr[j];
 int i = j - 1;
 while ((i > -1) && (arr[i] > key)) 
{
 arr[i + 1] = arr[i];
 i--;
}
 arr[i + 1] = key;
}
 System.out.println("Insetion sorted Elements are:");
 for (int i = 0; i < n; i++) {
 System.out.println("\t" + arr[i]);
 }
}
public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        sort.getElement();
        sort.insertionSort();
    }
}