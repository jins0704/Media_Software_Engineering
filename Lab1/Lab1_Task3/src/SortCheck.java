import java.util.Scanner;

public class SortCheck {
    public static void main(String[] args){

        Scanner sanc = new Scanner(System.in);

        SortCheck sc = new SortCheck();

        boolean b1 = sc.isSorted(new int[]{3,3,4,5,6,7});
        boolean b2 = sc.isSorted(new int[]{3,3,5,4,6,7});

        System.out.println(b1);
        System.out.println(b2);
    }

    public static boolean isSorted(int[] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }

}
