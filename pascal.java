import java.util.Scanner;
public class pascal {
    public static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static int comb(int n,int r)
    {
        int re=fact(n)/((fact(r))*fact(n-r));
        return re;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("1");
        for(int i=2;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(comb(i,j)+" ");
            }
            System.out.println();
        }
    }
}
