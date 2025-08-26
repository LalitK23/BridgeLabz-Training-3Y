import java.util.Scanner;

public class footballPlayers_meanHeight {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double[] arr = new double[11];
        double total_h = 0.0;
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the height : ");
            arr[i] = sc.nextDouble();
            total_h += arr[i];
        }
        double mean_h = total_h/arr.length;
        System.out.print("The mean height of the football team is : "+mean_h);
    }
}
