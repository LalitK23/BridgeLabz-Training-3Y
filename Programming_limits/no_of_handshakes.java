import java.util.*;
public class no_of_handshakes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of students : ");
        int s = sc.nextInt();
        int h_s = (s * (s -1)) / 2;
        System.out.print("The possible number of handshakes are :"+h_s);
    }
}