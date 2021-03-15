package Task3;

import java.util.Scanner;

public class SortCheck {

    public static void main(String[] args){

        SortCheck sc = new SortCheck();

        boolean b1 = sc.isSorted(new int[]{3,3,4,5,6,7});
        boolean b2 = sc.isSorted(new int[]{3,3,5,4,6,7});

        System.out.println("b1 == " + b1);
        System.out.println("b2 == " + b2);
    }

    private static boolean isSorted(int[] arr){

        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }

}
