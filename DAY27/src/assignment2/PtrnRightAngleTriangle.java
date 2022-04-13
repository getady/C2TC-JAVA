
package assignment2;

public class PtrnRightAngleTriangle
{
    public static void main(String[] args) {
        //initialize 3-d array
        int[][][] intArray = {
              {
            	  {1},{2,2},{3,3,3},{4,4,4,4}}
              };
        System.out.println("Multidimensional Array (3-d) is as follows:");
        // use for..each loop to iterate through elements of 3d array
        
        for (int[][] array_2D: intArray) 
        {
            for (int[] array_1D: array_2D) 
            {
                for(int intelem: array_1D) 
                {
                	
                System.out.print(intelem + "");
                 }
               System.out.println();
            }
            System.out.println();
        }
    }
}

