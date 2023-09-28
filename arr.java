import java.util.Scanner;
import java.lang.Math;
public class arr{
    public static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int size=fact(n);
        int a[]=new int[2];
        int min=1000;
        for(int i=0;i<arr.length;i++)
        {
            double sum=0;
            for(int j=i+1;j<arr.length;j++)
            {
                sum=Math.sqrt((arr[i]+arr[j])*(arr[i]+arr[j]));
                if(min>sum){
                    min=(int)(sum);
                    a[0]=arr[i];
                    a[1]=arr[j];
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}