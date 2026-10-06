// import java.awt.Point;
// import java.util.Arrays;
// import java.util.Date;

import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // byte age = 10;
        // int newAge = age + 5;
        // System.out.println(newAge);
        // char letter = 'A';
        // System.out.println(letter);
        // String customerName = "Joe";
        // System.out.println(customerName.charAt(0));
        // Date now = new Date();
        // System.out.println(now);
        // Point point1 = new Point(1, 1);
        // Point point2 = point1;
        // point2.x = 2;
        // System.out.println(point1);
        // System.out.println(point2);
        // String message = "Hello World";
        // System.out.println(message);
        // int [] numbers = {5, 2, 4, 1, 3};
        // Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));
        // int [][] numbers = { {1, 2, 3}, {4, 5, 6}};
        // System.out.println(Arrays.deepToString(numbers));
        // constants
        // final float PI = 3.14F;
        // System.out.println(PI);
        //random number
        // int result = (int) (Math.random() * 100);
        // System.out.println(result);
        //curency
        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String result = currency.format(1234567.891);
        // System.out.println(result);
        //percentage
        // String result = NumberFormat.getPercentInstance().format(0.1);
        // System.out.println(result); 
        //input numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age); 
        //input text
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Name ");
        String name = scanner2.next();
        System.out.println("You are " + name);     
    }
}
