import java.util.Scanner;
public class sidehour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int t=2*n+1;
        int count=n;
        int space=2*n-1; 
        int l=0;
        int n2=1;
        while(row<=2*n+1)
        {
            int i=1;
            int j=1;
            int k=n;
            int k2=count;
            if(row<n+1)
            {
                for(int a=0;a<n2;a++)
                {
                    System.out.print(k+" ");
                    k--;
                }
                while(i<=space)
                {
                    System.out.print("  ");
                    i++;
                }
                for(int a=0;a<n2;a++)
                {
                    if(k2!=0)
                    {
                    System.out.print(k2+" ");
                    }k2++;
                }
                space-=2;
                count--;
            }
            else if(row==n+1)
            {
                for(int a=0;a<n2;a++)
                {
                    System.out.print(k+" ");
                    k--;
                }
                for(int a=0;a<n2;a++)
                {
                    if(k2!=0)
                    {
                    System.out.print(k2+" ");
                    }k2++;
                }
                space+=2;
                count++;
            }
            else{
                while(j<=2*(n+1)-row)
                {
                    System.out.print(k+" ");
                    k--;
                    j++;
                }
                while(i<=space)
                {
                    System.out.print("  ");
                    i++;
                }
                for(int a=1;a<=2*(n+1)-row;a++)
                {
                    if(k2!=0)
                    {
                    System.out.print(k2+" ");
                    }k2++;
                }
                space+=2;
                count++;
            }
 
            row++;
            n2++;
            System.out.println();
        }
    }
}
