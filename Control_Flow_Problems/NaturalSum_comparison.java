import java.util.Scanner;

public class NaturalSum_comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int by_formula = 0;
        int by_for_loop = 0;
        if(num>0){
            by_formula = num * (num + 1) / 2;
            for(int i=0 ; i<=num ; i++){
                by_for_loop += i;
            }
        }else{
            System.out.print("The number is not a positive integer.");
        }
        System.out.println("By-Formula = "+by_formula);
        System.out.print("By-for Loop = "+by_for_loop);
    }
}
