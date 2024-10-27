import java.util.ArrayList;
import java.util.Collections;

public class Array_Exercise {
    public static void main(String[]args){
        //1.Write a Java program to test if the first and the last element of an array of
        //integers are same.The length of the array must be greater than or equal to 2
        int [] array1 = {50, -20, 0, 30, 40, 60, 10};
        if(array1[0]==array1.length-1){
            System.out.println("true");
        }
        else System.out.println("false");


        //2.Write a Java program to find the numbers greater than the average of the
        //numbers of a given array.
        int [] array2 = {1, 4, 17, 7, 25, 3, 100};
        double sum = 0;
        for(int n : array2){
            sum += n;
        }
        double avg = sum/array2.length;
        System.out.println("the average of the array is: " + avg + "\n the numbers that are greater than the average are: ");
        for(int n :  array2){
            if(n > avg){
                System.out.print(n + " ");
            }
        }

        //3.Write a Java program to get the larger value between first and last
        //element of an array of integers.
        int [] array3 = {70, 20, 30, 40, 50};
        int largerValue = array3[0];
        if(array3[0]>array3[array3.length-1]){
            largerValue = array3[0];
        }
        else largerValue = array3[array3.length-1];
        System.out.println("The larger value between the first and last element: " + largerValue);

        //4.Write a Java program to swap the first and last elements of an array and
        //create a new array
        int array4[] = {20, 30, 40};
        int temp;
        System.out.println("New array after swapping the first and last elements: ");
        for (int i = 0; i < array4.length; i++) {
            temp = array4[0]; // 20
            array4[0] = array4[array4.length-1]; // 40
            array4[array4.length-1] = temp; //20
            System.out.print(array4[i] + " ");
        }
        System.out.println();
        // Alternative solution:
        ArrayList<Integer> fourthArray = new ArrayList();
        fourthArray.add(20);
        fourthArray.add(30);
        fourthArray.add(40);
        Collections.swap(fourthArray, 0, 2);
        System.out.println("New array after swapping the first and last elements: " + fourthArray);


        //5. Write a program that places the odd elements of an array before the
        //even elements.
        int [] array5 = {2,3,40,1,5,9,4,10,7};
        ArrayList<Integer> orderedArray = new ArrayList();
        // traverse1 to add odd numbers
        for(int i = 0; i <array5.length; i++){
            if(array5[i]%2!=0){
                orderedArray.add(array5[i]);
            }
        }
        // traverse2 to add even numbers
        for(int i = 0; i < array5.length; i++){
            if(array5[i]%2==0){
                orderedArray.add(array5[i]);
            }
        }
        System.out.println(orderedArray);


        //6. Write a program that test the equality of two arrays.
        //[2,3,6,6,4] [2,3,6,6,4]
        ArrayList<Integer> compareArray1 = new ArrayList();
        ArrayList<Integer> compareArray2 = new ArrayList();
        //first array
        compareArray1.add(2);
        compareArray1.add(3);
        compareArray1.add(6);
        compareArray1.add(6);
        compareArray1.add(4);
        // second array
        compareArray2.add(2);
        compareArray2.add(3);
        compareArray2.add(6);
        compareArray2.add(6);
        compareArray2.add(4);
        if(compareArray1.equals(compareArray2))
            System.out.println("true arrays are equals ");
        else System.out.println("false arrays are not equals ");


    }//end main
}
