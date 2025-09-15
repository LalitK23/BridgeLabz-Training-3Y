import java.util.*;
public class SumOfNnaturalnumbers_comparison {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int by_formula = num * (num+1)/2;
        int by_while = 0;
        while(num!=0){
            by_while+=num;
            num--;
        }
        System.out.println("By-Formula = "+by_formula);
        System.out.print("By-while Loop = "+by_while);

    }
}
