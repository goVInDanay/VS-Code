class Employee{
String empN="nitai";
String empI="10";
public String toString(){
return empN+" "+empI;
}
}
public class Testee{
public static void main(String[] args){
Employee e1=new Employee();
System.out.println(e1);
}
}
