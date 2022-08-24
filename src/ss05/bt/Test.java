package ss05.bt;

public class Test {
    public static void main(String[] args) {
        Student std=new Student();
        System.out.println(std.setName("tan")+" "+std.setClasses("abc"));
    }
}
class Student{
    private String name="John";
    private String classes="C02";

    public Student(){
    }
    public String setName(String newname){
       return this.name=newname;
    }
    public String setClasses(String newclass){
        return this.classes=newclass;
    }
}
