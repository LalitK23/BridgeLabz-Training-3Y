import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int i=0;
        while(true){
            System.out.print("Enter the element : ");
            arr[i]=sc.nextDouble();
            i++;
            if(i>10)
                break;
            if(arr[i]<0){
                break;
            }else{
                break;
            }
        }
        for(int j=0;j<arr.length;i++){
            total += arr[j];
        }
        System.out.print("The total of all elements of te array is : "+total);
    }
}
