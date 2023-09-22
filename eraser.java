import java.util.Scanner;
public class eraser {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=0;i<t;i++)
    {
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.next();
        int c=0;
        char [] arr=s.toCharArray();
        while(i<n)
        {
            if(arr[i]=='B')
            {
                for(int x=i;x<=i+k;x++)
                {
                    System.out.println(x);
                    arr[x]='W';
                    c++;
                }
            }
            i+=k;
            System.out.println(i);

        }
        System.out.println(c);
    }
}
}
