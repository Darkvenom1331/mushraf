public class PrimitiveDataType
{
 public static void main(String[] args)
{
 int MYMAXNUM  = Integer.MAX_VALUE;
 int MYMINNUM = Integer.MIN_VALUE;
 System.out.println("my max value in integer=" + MYMAXNUM);
 System.out.println("my min value in integer=" + MYMINNUM);
 
 System.out.println("busted max=" + (MYMAXNUM+1));
 System.out.println("busted min=" + (MYMINNUM-1));
 
 byte mymin  = Byte.MAX_VALUE;
 byte mymax = Byte.MIN_VALUE;
 System.out.println("my max value in byte=" + mymax);
 System.out.println("my min value in byte=" + mymin);
 System.out.println("busted max=" + (mymin+1));
 System.out.println("busted min=" + (mymax-1));
 
 short Max = Short.MAX_VALUE;
 short Min = Short.MIN_VALUE;
 System.out.println("my max value in short=" + Max);
 System.out.println("my min value in short=" + Min);
 System.out.println("busted max=" + (Max+1));
 System.out.println("busted min=" + (Min-1));

 long maximum = Long.MAX_VALUE;
 long minimum = Long.MIN_VALUE;
 System.out.println("my max value in long=" + maximum);
 System.out.println("my min value in long=" + minimum);
 System.out.println("busted max=" + (maximum+1));
 System.out.println("busted min=" + (minimum-1));

 float value1  = Float.MAX_VALUE;
 float value= Float.MIN_VALUE;
 System.out.println("my max value in float=" + value1);
 System.out.println("my min value in float=" + value);

 double value2 = Double.MAX_VALUE;
 double value3 = Double.MIN_VALUE;
 System.out.println("my max value in double=" + value2);
 System.out.println("my min value in double=" + value3);
 
 int total = (MYMAXNUM/2);
 System.out.println("integer:"+total);
 byte total1 = (byte)(mymin/3);
 System.out.println("byte="+ total1);
 short total4 =(short)(Max/2);
 System.out.println("short="+ total4);
 long total5 = (long)(minimum / 2);
 System.out.println("long="+ total5);
 short total2 =(short)(total1);
 System.out.println("short="+ total2);
 long total3 = (long)(total2);
 System.out.println("long="+ total3); 
 
 byte total6 = (byte)(Max/2);
 System.out.println("integer:"+total6);
 
}}