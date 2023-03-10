package practice;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
        // TODO Auto-generated method stub



       int[] arr = {20,10,50,30,40,100,70,60,80,90};
        traverseArray(arr);
        //sortArrayDesc(arr);
        traverseArray(arr);
    }



   
   /* public static void sortArrayDesc(int[] arr)
    { // sort array by desc order
        int len = arr.length;
        Arrays.sort(arr);
        int [] arr1 = new int[len];
        
        for(int i=arr.length-1; i>=0; i--)
        {
            arr1[len-i-1]=arr[i];
        }
        for(int i=0; i<len; i++)
        {
            arr[i]=arr1[i];
        }
    }*/
    
    public static void traverseArray(int[] arr)
    { // traversing array
        for (int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        
        }
        System.out.println("");
    }
}
