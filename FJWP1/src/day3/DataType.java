package day3;
import java.util.Scanner;
class DataType {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a int value: ");
       int a=sc.nextInt();
       System.out.print("Enter a byte value: ");
       byte b=sc.nextByte();
       System.out.print("Enter a short value: ");
       short c=sc.nextShort();
       System.out.print("Enter a long value: ");
       long d=sc.nextLong();
       System.out.print("Enter a float value: ");
       float e=sc.nextFloat();
       System.out.print("Enter a double value: ");
       double f=sc.nextDouble();
       System.out.print("Enter a char value: ");
       char g = sc.next().charAt(0);
       System.out.print("Enter a boolean value: ");
       boolean h=sc.nextBoolean();
       System.out.println("int value: " + a);
        System.out.println("byte value: " + b);
        System.out.println("short value: " + c);
        System.out.println("long value: " + d);
        System.out.println("float value: " + e);
        System.out.println("double value: " + f);
        System.out.println("char value: " + g);
        System.out.println("boolean value: " + h);
}
}