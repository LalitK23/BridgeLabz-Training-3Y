import java.util.Scanner;

public class multilication_6_to_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between 6 and 9 : ");
        int num = sc.nextInt();
        if(num<6 || num>9){
            System.out.print("Enter the number provided!!!");
        }
        for(int i=1;i<=10;i++){
            System.out.println(num + " * " + i +" = "+(num*i));
        }
    }
}
