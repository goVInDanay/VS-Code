import java.util.Scanner;
import java.util.Arrays;
public class daytona {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            Arrays.sort(a);
            int fr=0;
            int freq[]=new int[n];
            int x=0;
            freq[0]=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]==k)
                fr++;
                else
                {
                    freq[x]++;
                    for(int j=i+1;j<n;j++)
                    {
                        if(a[i]==a[j])
                        {
                            freq[x]++;
                        }
                        else
                        break;
                    }
                    x++;
                }

            }
            int f=0;
            for(int i=0;i<freq.length;i++)
            {
                if(fr<=)
            }


        }
    }
    
}
