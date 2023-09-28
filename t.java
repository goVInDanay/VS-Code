import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class t {
    public static void main(String[] args) throws FileNotFoundException {
       
        File InputStream=new File("Sample.txt");
        Scanner sc=new Scanner(input Stream);
        sc.useDelimeter("A");
    String r=sc.nextLine();
    System.out.println(r);
    r=sc.nextLine();
    System.out.println(r);
    sc.close();
    }
}

