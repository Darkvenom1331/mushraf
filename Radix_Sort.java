import java.util.*;
public class Radix_Sort {
static int n;
static int a[]=new int[10];
static void getElement()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements you want to store: ");
n=sc.nextInt();
System.out.println("Enter the elements of the array: ");
for(int i=0; i<n; i++)
{
a[i]=sc.nextInt();
}
System.out.println("Elements of the array are: ");
for (int i=0; i<n; i++)
{
System.out.println("\t"+a[i]);
}
}
static int largest(int a[])
{
int larger=a[0], i;
for (i=1;i<n;i++)
{
if(a[i]>larger)
larger = a[i];
}
return larger;
}
static void radix_sort(int a[])
{
int bucket[][]=new int[10][10];
int bucket_count[]=new int[10];
int i, j, k, remainder, NOP=0, divisor=1, larger, pass;
larger = largest(a);
while(larger>0)
{
NOP++;
larger/=10;
}
for(pass=0;pass<NOP;pass++) // Initialize the buckets
{
for(i=0;i<n;i++)
bucket_count[i]=0;
for(i=0;i<n;i++)
{
remainder = (a[i]/divisor)%10;
bucket[remainder][bucket_count[remainder]] = a[i];
bucket_count[remainder] += 1;
}
// collect the numbers after PASS pass
i=0;
for(k=0;k<n;k++)
{
for(j=0;j<bucket_count[k];j++)
{
a[i] = bucket[k][j];
i++;
}
}
divisor *= 10;
}
}
public static void main(String[] args)
{
int i;
getElement();
radix_sort(a);
System.out.println("\n The sorted array is: \n");
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}