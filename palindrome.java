import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0;
        int num=0;
        int m=n;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            num=num*10+d;
        }
        System.out.println(num);
    }
}
