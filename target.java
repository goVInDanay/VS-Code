import java.util.Scanner;
public class target {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
         char [][] arr=new char[5][20];
         for(int i=0;i<5;i++)
         {
            String s=sc.next();
            for(int z=0;z<10;z++)
            {
                arr[i][z]=s.charAt(z);
            }
         }   
         for(int i=4;i>=0;i--)
         {
            String s=sc.next();
            int k=10;
            for(int z=0;z<10;z++)
            {
                arr[i][k]=s.charAt(z);
                k++;
            }
        }
        int c=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<20;j++)
            {
                if(arr[i][j]=='X') {
                    if(i==0 || (j==0 || j==9 || j==10 || j==19))
                    c+=1;
                    else if(i==1 || (j==1 || j==8 || j==11 || j==18))
                    c+=2;
                    else if(i==2 || (j==2 || j==7 || j==12 || j==17))
                    c+=3;
                    else if(i==3 || (j==3 || j==6 || j==13 || j==16))
                    c+=4;
                    else if(i==4 || (j==4 || j==5 || j==14 || j==15))
                    c+=5;
                }
            }
        }
        System.out.println(c);
    }
}
}
