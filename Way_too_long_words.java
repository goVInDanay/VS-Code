import java.util.Scanner;
public class Way_too_long_words
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        String s2="";
        if(l>10)
        {
            s2=s.charAt(0)+Integer.toString(l-2)+s.charAt(l-1);
            System.out.println(s2);
        }
        else{
            System.out.println(s);
        }
        sc.close();
    }
}