import java.util.Scanner;
public class goodkid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i =0;i<t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int min=10;
            int pos=0;
            for(int j=0;j<n;j++)
            a[j]=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                if(min>a[j])
                {
                min=a[j];
                pos=j;
                }
            }
            a[pos]=a[pos]+1;
            int pro=1;
            for(int j=0;j<n;j++)
            pro=pro*a[j];
            System.out.println(pro);
        }

    }
}
    
