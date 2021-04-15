import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

//import java.util.Arrays;
//import java.util.Collections;


public class testSelectionSort {
	@Test
	public void test() {
		System.out.println(" Running Test... Low -> High");

		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        //keep Sortedarr since it is given in code
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        SelectionSort temp1 = new SelectionSort();
        int[] sorted = temp1.basicSelectionSort(arr);


        /** add tests to check for this unit test **/
        for (int i = 0; i < arr.length; i++)
            assert  arr[i] > 0; //make sure each value is positive number


       //I do not know if we can use this function :(  Arrays.sort(arr)

        // print results of this test
    //    System.out.println(" [Positives]... ");
    //    for (int i=0; i < arr.length; i++)
    //    System.out.print(arr[i] + ", ");
    }

    public void testNegative(){
        /** Test data contains negative values only **/
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        SelectionSort temp1 = new SelectionSort();
        int[] sorted = temp1.basicSelectionSort(arr);

        for (int i = 0; i < arr.length; i++)
            assert  arr[i] < 0; //make sure each value is negative

    	 /** add tests to check for this unit test **/
       // Arrays.sort(arr);
        // print results of this test

        System.out.println('\n' + " [Negatives]... ");
        for (int i=0; i < arr.length; i++)
        System.out.print(arr[i] + ", ");
    }

    public void testMixed(){
        /** Test data contains with both positive, negative and zeros **/
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 0;
        arr[3] = 10;
        arr[4] = 2;

        SelectionSort temp1 = new SelectionSort();
        int[] sorted = temp1.basicSelectionSort(arr);

     // print results of this test
      //  System.out.println('\n' + " [Mixed]... ");
      //  for (int i=0; i < arr.length; i++)
      //  System.out.print(arr[i] + ", ");
    }

    public void testDuplicates(){
        /** Test data contains duplicates **/
    	int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 9;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = -7;

        SelectionSort temp1 = new SelectionSort();
        int[] sorted = temp1.basicSelectionSort(arr);

     // print results of this test
      //  System.out.println('\n' + " [Duplicates]... ");
      //  for (int i=0; i < arr.length; i++)
      //  System.out.print(arr[i] + ", ");
    }
}
