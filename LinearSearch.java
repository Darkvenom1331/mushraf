import java.util.*;
public class LinearSearch
{
 int n;
 int arr[]=new int[10];
void getElement()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements to be Entered");
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
 void linearSearch()
 {
 int i,elem;
 System.out.println("Enter the value for Linear search:");
 Scanner sc = new Scanner(System.in);
 elem = sc.nextInt();
 for ( i = 0; i < n; i++)
 {
 if (arr[i] == elem)
 {
 System.out.println("The number "+ elem + " is present at location " + (i +
1) + ".");
 break;
 }
 } 
 if (i == n)
 System.out.println("The number "+ elem + " isn't present in array.");
 }
 public static void main(String args[])
{
 LinearSearch sh=new LinearSearch();
 sh.getElement();
 sh.linearSearch();
}
}