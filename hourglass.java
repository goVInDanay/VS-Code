import java.util.Scanner;

public class hourglass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int a=0;a<i;a++)
            {System.out.print("\t");}
            for(int j=n-i;j>=0;j--)
            {
                System.out.print(j+"\t");
            }
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(k+"\t");
            }
            System.out.println();
        }
    }
}
