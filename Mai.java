class Job{
String role;
long salary;
int id;
}
class Person{
String name="";
Job varJob=new Job();
}
public class Mai{
public static void main(String[] args){
Person p=new Person();
p.name="abhi";
p.varjob.role="management";
p.varjob.salary=120000;
System.out.println(p.name);
System.out.println(p.varjob.role);
System.out.println(p.varjob.salary);
}
}