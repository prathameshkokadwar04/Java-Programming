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
import java.util.*;
public class javabasics{
    public static void main(String args[]){
        for(int line = 1 ;line < 5 ; line++){
            for(int star = 1 ; star<=4-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}