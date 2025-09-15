import java.util.Scanner;

public class youngest_tallest_friend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Amar : ");
        int am_age = sc.nextInt();
        System.out.print("Enter the age of Akbar : ");
        int ak_age = sc.nextInt();
        System.out.print("Enter the age of Anthony : ");
        int an_age = sc.nextInt();
        System.out.print("Enter the height of Amar : ");
        int am_height = sc.nextInt();
        System.out.print("Enter the height of Akbar : ");
        int ak_height = sc.nextInt();
        System.out.print("Enter the height of Anthony : ");
        int an_height = sc.nextInt();
        int younger = 0;
        int tallest = 0;
        if(am_age<ak_age && am_age<an_age){
            System.out.println("The youngest among all friends is Amar");
        } else if (ak_age<an_age) {
            System.out.println("The youngest among all friends is Akbar");
        }else{
            System.out.println("The youngest among all friends is Anthony");
        }

        if(am_height>ak_height && am_height>an_height){
            System.out.println("The tallest among all friends is Amar");
        } else if (ak_height>an_height) {
            System.out.println("The tallest among all friends is Akbar");
        }else{
            System.out.println("The tallest among all friends is Anthony");
        }
    }
}
