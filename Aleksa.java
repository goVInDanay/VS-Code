import java.util.Scanner;
public class Aleksa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            a[0]=2;
            a[1]=3;
            int k=4;
            for(int i=2;i<n;i++)
            {
                a[i]=k;
                if((a[i]*3)%(a[i-2]+a[i-1])==0)
                a[i]++;
                if(a[i]==a[i-1]) 
                a[i]++;
                if((a[i]*3)%(a[i-2]+a[i-1])==0)
                a[i]++;
                k=a[i];
                k++;
            }
            for(int i=2;i<n;i++)
            {
            }
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            System.out.println();
        }
        
    }
    
}
