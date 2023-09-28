class Student{
    static String collegeName;
}
public class Main2{
    public static void main(String[] args) {
        Student.collegeName="GLA";
        Student s1=new Student();
        System.out.println(Student.collegeName);
    }
    
}