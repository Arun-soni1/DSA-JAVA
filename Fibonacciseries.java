
// The Fibonacci numbers are the numbers in the following integer sequence.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
//  In mathematical terms, the sequence Fn of Fibonacci numbers is 
//  defined by the recurrence relation 
//                          Fn = Fn-1 + Fn-2
import java.util.*;
public class Fibonacciseries{
    public static void main(String[] args){
        int term, a = 0, b = 1, c;
        System.out.println("Enter Term");
        Scanner sc = new Scanner(System.in);
        term = sc.nextInt();
        for (int i = 0; i < term; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}