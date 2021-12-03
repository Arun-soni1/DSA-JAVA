public class MultidimensionalArray 
{
    public static void main(String[] args) 
    {
        int[][] a = {{1, -2, 3},{-4, -5, 6, 9},{7},};
        for (int[] innerArray: a) 
        {
            for(int data: innerArray)
            {
                System.out.println(data);
            }
        }
    }
}