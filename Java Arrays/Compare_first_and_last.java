import java.util.Scanner;

public class Compare_first_and_last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println("The number is postive and even.");
                }else{
                    System.out.println("The number is positive and odd.");
                }
            } else if (arr[i]<0) {
                System.out.println("The number is negative.");
            }else{
                System.out.println("The number is zero");
            }
        }
        if(arr[0]>arr[arr.length-1]){
            System.out.println("The first element of the array is greater than the last element.");
        }else if(arr[0]<arr[arr.length-1]){
            System.out.println("The last element of the array is greater than the first element.");
        }else{
            System.out.print("Both first and last elements are equal.");
        }
    }
}
