import java.util.Scanner;

public class hour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=2*n+1;
        int space=0;
        int count=n;
        while(row<=n*2+1)
        {
            int i=1;
            int j=1;
            int k=count;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            while(j<=star)
            {
                
                System.out.print(k+" ");
                if(j<(star/2)+1)
                k--;
                else k++;
                j++;
            }
            row++;
            System.out.println();
            if(row<=n+1)
            {
                star-=2;
                space++;
                count--;
            }
            else{
                star+=2;
                space--;
                count++;
            }
        }
    }
}
