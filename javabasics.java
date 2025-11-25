//  ------ first program ------

// public class javabasics{
//         public static void main(String[] args){
//             System.out.print("hello");
//     }
// }        
// import java.util.*;                              
// public class javabasics{
//     public static void main(String args[]){
//         int a = 10;
//         int b = 5;
//         System.out.print(a + b);
//     }
// // }




// ----------------REVERSED STAR PATTERN -----------
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         for(int line = 1 ;line < 5 ; line++){
//             for(int star = 1 ; star<=4-line+1; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




import java.util.*;
public class javabasics{
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