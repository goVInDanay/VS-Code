import java.util.Scanner;
public class Reverse{
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static float powe(int n,int pow)
    {
        float r=1;
        if(pow>=0)
        {
            for(int i=0;i<pow;i++)
            {
                r=r*n;
            }
            return r;
        }
        else
        {
            while(pow!=0)
            {
                r=r/n;
                pow++;
            }
            return r;
        }
    }
    public static int perm(int n,int r)
    {
        int nf=factorial(n);
        int rf=factorial(r);
        int nrf=factorial(n-r);
        int com=nf/(rf*nrf);
        return com;
    }
    public static void reverse(int num)
    {
        int r=1;
        while(num>0)
        {
            r*=10;
            num=num/10;
        }
        System.out.println(r/10);
    }
    public static int hcf(int n1,int n2)
    {
        int min;
        if(n1>n2)
        {
            min=n2;
        }
        else
        {
            min=n1;
        }
        int h=1;
        for(int i=1;i<=min;i++)
        {
            if(n1%i==0&&n2%i==0)
            {
                h=i;
            }
        }
        return h;
    }
    public static void bool()
    {
        if (true)
        {
            int x=10;
        }
    }
    public static int max(int[] arr)
    {
        int m=0;
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            if(arr[i]>m)
            {
                m=arr[i];
            }
        }
        return m;
    }
    public static int count(int[] arr)
    {
        int e=0;
        int o=0;
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            
            if(arr[i]%2==0)
            {
                e++;
            }
            else{
                o++;
            }
        }
        return(e*10+o);
    }
    public static int[] rotate(int[] arr)
    {
        int l=arr.length;
        int t=arr[l-1];
        int temp=0;
        for(int i=0;i<l-1;i+=2)
        {
            temp=arr[i+1];
            arr[i+1]=arr[i];
        }
        arr[0]=t;
        return arr;
    }
    public static int[] con(int [] ar1,int[] ar2,int s1,int s2){
        int[] arr=new int[s1+s2];
        int j=0;
        for(int i=0;i<s1;i++)
        {
            arr[j]=ar1[i];
            j++;
        }
        for(int i=0;i<s2;i++)
        {
            arr[j]=ar2[i];
            j++;
        }
        return arr;
    }
    public static int[] dupe(int [] arr)
    {
        int[] arr2=new int[arr.length];  
        arr2[0]=arr[0];      
        int k=1;
        int f=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr2[j]==arr[i])
                {
                    f=0;
                    break;
                }
                else{
                    f=1;
                }
            }
            if(f==1)
            {
                arr2[k]=arr[i];
                k++;
            }
        }
        int[] a=new int[k];
    for(int i=0;i<k;i++)
    {
        a[i]=arr2[i];
    }   
    return a;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int pow=sc.nextInt();
        // int ans=
        // hcf(n,pow);
        // System.out.println(ans);
        // sc.close();
        // boolean x=true;
        // while(x)
        // {
        //     System.out.println("Hello");
        // }
        int size=sc.nextInt();
        // int size2=sc.nextInt();
        int [] ar=new int[size];
        // int [] ar2=new int[size2];
        for(int i=0;i<size;i++)
        {
            ar[i]=sc.nextInt();
        }
        // for(int i=0;i<size2;i++)
        // {
        //     ar2[i]=sc.nextInt();
        // }
        int[] a=dupe(ar);
        // System.out.println("Odd "+m%10+" Even "+m/10);
        for(int i=0;i<(a.length);i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}