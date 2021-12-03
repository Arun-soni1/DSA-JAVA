import java.util.*;
public class SORTING 
{
    //                        SORTING GIVEN BY USER INPUT
    public static void main(String[] args) 
    {
        // 1  Create one Scanner value sc to read the user input. Also,
        //  create one integer variable tempValue. We will use this
        //  integer variable for swapping two numbers below.
     
        Scanner sc= new Scanner(System.in);
        int tempValue;
        // 2
        // Ask the user to enter the size of the array. Read it and store it in variable size.
        System.out.println("Enter number of array elements : ");
        int size = sc.nextInt();
        // 3
        // Create one integer array numArray. The size of the array is same as the user input size.
        int[] numArray = new int[size];
        // 4
        // Using a for loop, take the values of all the elements of the array.
        //  Read each value and store it in the array.
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element : ");
            numArray[i] = sc.nextInt();
        }
        // 5
        // Print out the entered values to the user. 
        // We are using one for loop here to read and print each element of the array.
        System.out.println("You have entered : ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(numArray[i] + ",");
        }
        System.out.println(numArray[numArray.length - 1]);
        //6
        // This is the main step used for sorting the array.
        //  Here, we are running two for loops. The outer one will run from the first element
        //  to the last element, and the inner one will run from the current element pointed 
        // by the outer loop to the last element i.e., for each element, we are checking all 
        // elements to the right of it.
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
            //7
            // For an element pointed by the outer loop, if any element to the right of it is 
            // smaller than it, swap both elements. Here we are using the tempValue to temporarily
            //  store the value of one number.
            if (numArray[i] > numArray[j]) {
                tempValue = numArray[i];
                numArray[i] = numArray[j];
                numArray[j] = tempValue;
               }
            }
        }
        //8
        // Finally, print out the result to the user.
        System.out.println("Final array after the sorting : ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(numArray[i] + ",");
        }
        System.out.println(numArray[numArray.length - 1]);

    }
}




//                 USING BUFFER READER




// import java.io.*;
// class SORTING
// {
//     public static void main(String args[])throws IOException 
//     {
//         // 1
//         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
//         int tempValue;
//         // 2
//         System.out.println("Enter number of array elements : ");
//         int size = Integer.parseInt(sc.readLine());
//         // 3
//         int[] numArray = new int[size];
//         // 4
//         for (int i = 0; i < size; i++) {
//             System.out.print("Enter element : ");
//             numArray[i] = Integer.parseInt(sc.readLine());
//         }
//         // 5
//         System.out.println("You have entered : ");
//         for (int i = 0; i < size - 1; i++) {
//             System.out.print(numArray[i] + ",");
//         }
//         System.out.println(numArray[numArray.length - 1]);
//         //6
//         for (int i = 0; i < numArray.length; i++)
//         {
//             for (int j = i + 1; j < numArray.length; j++)
//             {
//             //7
//             if (numArray[i] > numArray[j]) 
//                 {
//                     tempValue = numArray[i];
//                     numArray[i] = numArray[j];
//                     numArray[j] = tempValue;
//                 }
//             }
//         }
//         //8
//         System.out.println("Final array after the sorting : ");
//         for (int i = 0; i < size - 1; i++)
//         {
//             System.out.print(numArray[i] + ",");
//         }
//         System.out.println(numArray[numArray.length - 1]);

//     }
// }