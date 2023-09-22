import java.util.Scanner;
class Short{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.equals("abc"))
        {
            System.out.println("YES");
        }
        else if(s.equals("acb"))
        System.out.println("YES");
        else if(s.equals("bac"))
        System.out.println("YES");
        else if(s.equals("cba"))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}