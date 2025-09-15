import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println(i+" : "+"even");
            }else{
                System.out.println(i+" : "+"odd");
            }
        }
    }
}
