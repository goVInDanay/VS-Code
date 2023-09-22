import java.util.Scanner;
public class secret_agent
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        String s=(s1.concat(s2)).concat(s3);
        char a[]=new char[9];
        a=s.toCharArray();
        int f=0;
        int c=0;
        for(int i=0;i<9;i++)
        if(a[i]=='X')
        c++;
        if(a[0]=='X' && a[8]=='X')
        f+=1;
        if(a[1]=='X' && a[7]=='X')
        f+=1;
        if(a[2]=='X' && a[6]=='X')
        f+=1;
        if(a[3]=='X' && a[5]=='X')
        f+=1;
        if(a[4]=='X')
        f+=1;
        if(((c==1 || c==2) && (f==1)) || ((c==3 || c==4) && (f==2)) || ((c==5 || c==6) && (f==3)) || ((c==7 || c==8) && (f==4)) || (c==9 && f==5))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}