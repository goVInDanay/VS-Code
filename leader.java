import java.util.Scanner;
public class leader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int max=arr[0];
        int pos=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>max)
                max=arr[j];
            }
        }
        System.out.println(max);
    }
    
}
