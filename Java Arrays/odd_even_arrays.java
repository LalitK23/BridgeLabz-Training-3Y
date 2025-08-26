import java.util.Scanner;

public class odd_even_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int[] even = new int[num/2+1];
        int[] odd = new int[num/2+1];
        int evenindex = 0 , oddindex = 0 ;
        for(int i=1;i<num;i++){
            if(i%2==0){
                even[evenindex++]= i;
            }else{
                odd[oddindex++]= i;
            }
        }
//        for(int i=0;i<num;i++){
//            if(i%2!=0){
//                odd[i]=i;
//                i++;
//            }else{
//                continue;
//            }
//        }
        System.out.println("The even array is : ");
        for(int i=0;i<even.length;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();
        System.out.println("The odd array is : ");
        for(int i=0;i<odd.length;i++){
            System.out.print(odd[i]+" ");
        }

    }
}
