package ss10_DanhSach_ArrayList.th;

import java.util.ArrayList;
import java.util.List;

public class demoArrayList {
    public static class student{
        public int id;
        public String name;

        public student(int id, String name) {
            this.id = id;
            this.name = name;
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

        @Override
        public String toString() {
            return "student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.add(new student(1,"nguyen cong tan"));
        System.out.println(arr);
    }
}
