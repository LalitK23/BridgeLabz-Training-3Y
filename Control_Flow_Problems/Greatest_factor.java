import java.util.*;
public class Greatest_factor {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int g_f =0 ;
        int f = 0;
        for(int i = num-1 ; i>=1 ; i--){
            if(num%i==0){
                f=i;
                if(f>g_f){
                    g_f = f;
                }
            }
        }
        System.out.print("The greatest factor is "+g_f);
    }
}
