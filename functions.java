// --------------function basic program---------------

// public class functions {
//     public static void printHello(){
//         System.out.print("Helloworld");
//     }
//     public static void main(String[] args) {
//         printHello();
//     }
//}
import java.util.*;
public class functions{
        public static void printSum(int a,int b) {
            int sum = a + b;
            System.out.println("Sum is  " + sum);
        }
        public static void main(String args[]){
            System.out.println("Enter two numbers");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            printSum(a,b);
    }
}