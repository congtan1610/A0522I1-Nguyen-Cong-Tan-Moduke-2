package ss10_DanhSach_ArrayList.bt.SettupArrayListMethod;

public class TestMyList {
    public static class Student{
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a=new Student(1,"Nam");
        Student b=new Student(2,"huy");
        Student c=new Student(3,"le");
        Student d=new Student(4,"dung");
        Student e=new Student(5,"minh");
        MyList<Student> studentMyList=new MyList<>();
        //test method add(element)
       studentMyList.add(a);
       studentMyList.add(b);
       studentMyList.add(c);
       studentMyList.add(d);
       studentMyList.add(e);
       //test method size()
        System.out.println("size: "+studentMyList.size());
        //test method get()
       for (int i=0;i<studentMyList.size();i++){
           System.out.println(studentMyList.get(i).getName());
       }
        //test method remove()
        studentMyList.remove(0);
        System.out.println("\nsau khi remove(0)");
        System.out.println("size: "+studentMyList.size());
        for (int i=0;i<studentMyList.size();i++){
            System.out.println(studentMyList.get(i).getName());
        }
        //test method contains
        System.out.println("\nsau khi test contains()");
        if (!studentMyList.contains(a)){
            System.out.println(studentMyList.get(0).getName()+"\n");
        }else System.out.println("null");
        //test method add(elment,index)
        studentMyList.add(a,3);
        for (int i=0;i<studentMyList.size();i++){
            System.out.println(studentMyList.get(i).getName());
        }
        //test method clear
        studentMyList.clear();
        System.out.println("\nsau khi clear()");
        System.out.println("size: "+studentMyList.size());
    }
}
//link tham khảo
//https://www.youtube.com/watch?v=qmZIGtWtMHI&t=1671s
//https://www.youtube.com/watch?v=wMS091Df1b0&t=1s