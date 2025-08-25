import java.util.Scanner;
public class VowelConsonant {
    static int len(String s){
        int i=0;
        for(char ch: s.toCharArray())
            i++;
        return i;
    }
    static String check(char c){
        if(c>='A'&&c<='Z') c=(char)(c+32);
        if(c>='a'&&c<='z') return "aeiou".indexOf(c)>=0?"Vowel":"Consonant";
        return "Not";
    }
    static int[] count(String s){
        int v=0,c=0,l=len(s);
        for(int i=0;i<l;i++){
            String r=check(s.charAt(i));
            if(r.equals("Vowel"))v++;
            else if(r.equals("Consonant"))c++;
        }
        return new int[]{v,c};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] r=count(sc.nextLine());
        System.out.println("Vowels: "+r[0]+" Consonants: "+r[1]);
    }
}
