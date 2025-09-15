
import java.util.*;
public class Spring_season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month : ");
        int m = sc.nextInt();
        System.out.print("Enter the day : ");
        int d = sc.nextInt();
        if(m>=3){
            if(m==3){
                if(d>=20){
                System.out.print("It's spring season!!!");
            }else{
                    System.out.print("It's not a spring season!!!");
                }
            }else if(m>3 && m<6){
                if(d>0){
                    System.out.print("It's a Spring season!!!");
                }
            } else if (m==6) {
                if(d<=20){
                    System.out.print("It's a spring season");
                }else{
                    System.out.print("It's not a spring season!!!");
                }
            }
        }else{
            System.out.print("It's not a spring season!!!");
        }
    }
}
