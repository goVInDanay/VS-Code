import java.util.Scanner;
public class C1352A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            int l=(int)Math.log10(n);
            int m=n;
            int count=1;
            int [] arr=new int[l+1];
            if(m%10!=0)
            {
            count+=1;
            arr[0]=m%10;
            }
            if(m/10==0)
            {
                System.out.println("1");
                System.out.println(m);
                continue;
            }
            m=m/10;
            int k=1;
            int i=0;
            while(m>0)
            {
                int d=m%10;
                if(d!=0 && m/10!=0)
                {
                    count+=1;
                    arr[k]=d*(int)(Math.pow(10,i));
                    k++;
                }
                else if((d!=0 && m/10==0))
                {
                    arr[k]=d*(int)(Math.pow(10,l));
                    k++;
                }
                System.out.println(i);
                i++;
                m=m/10;
            }
            System.out.println(count);
            for(int j=k-1;j>=0;j--)
            {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}