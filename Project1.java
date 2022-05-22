public class Project1
{
public static void main(String[]args)
{
 byte value1 = 10;
 short value2= 20;
 int value3 = 50;
 long value4 =50000+10*(value1+value2+value3);
 System.out.println("result:" + value4);
 short value5 =(short)(500+10*(value1+value2+value3));
 System.out.println("result13:" + value5);
}
}