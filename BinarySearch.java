import java.util.*;
public class BinarySearch
{
 int n;
 int arr[]=new int[10];
void getElement()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements to be Entered ");
n=sc.nextInt();
System.out.println("Enter the elements of the array: ");
for(int i=0; i<n; i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Elements of the array are: ");
for (int i=0; i<n; i++)
{
System.out.println("\t"+arr[i]);
}
}
void binarySearch()
{
 int item,first,last,middle;
 System.out.println("Enter the value for Binary search: ");
 Scanner input = new Scanner(System.in);
 item = input.nextInt();
 first = 0;
 last = n - 1;
 middle = (first + last)/2;
 while( first <= last )
 {
 if ( arr[middle] < item )
 first = middle + 1;
 else if ( arr[middle] == item )
 {
 System.out.println("The number "+item + " found at location " + (middle
+ 1) + ".");
 break;
 }
 else
 {
 last = middle - 1;
 }
 middle = (first + last)/2;
 }
 if ( first >= (last+1))
 System.out.println("The number "+item + " is not found.\n");
 }
 public static void main(String args[])
{
 BinarySearch sh=new BinarySearch();
 sh.getElement();
 sh.binarySearch();
 System.out.println();

}
}