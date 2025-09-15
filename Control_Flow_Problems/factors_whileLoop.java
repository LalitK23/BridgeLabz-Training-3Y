import java.util.Scanner;

public class factors_whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int i=1;
        while(i!=num+1){
            if(num%i==0){
                System.out.print(i+" , ");
            }
            i++;
        }
    }
}
