package bai_tap_them1.model;


public class Person {
    public static class Student {
        private String id;
        private String name;
        private Object date;
        private String gender;
        private String className;
        private double point;

        public Student(String id, String name, Object date, String gender, String className, double point) {
            this.id = id;
            this.name = name;
            this.date = date;
            this.gender = gender;
            this.className = className;
            this.point = point;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getDate() {
            return date;
        }

        public void setDate(Object date) {
            this.date = date;
        }

        public String isGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public double getPoint() {
            return point;
        }

        public void setPoint(double point) {
            this.point = point;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", date=" + date +
                    ", gender=" + gender +
                    ", className='" + className + '\'' +
                    ", point=" + point +
                    '}';
        }
    }

    public static class Teacher {
        private  String id;
        private  String name;
        private Object date;
        private String gender;
        private  String specialize;

        public Teacher(String id, String name, Object date, String gender, String specialize) {
            this.id = id;
            this.name = name;
            this.date = date;
            this.gender = gender;
            this.specialize = specialize;
        }

        public String getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", date=" + date +
                    ", gender=" + gender +
                    ", specialize='" + specialize + '\'' +
                    '}';
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getDate() {
            return date;
        }

        public void setDate(long date) {
            this.date = date;
        }

        public String isGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getSpecialize() {
            return specialize;
        }

        public void setSpecialize(String specialize) {
            this.specialize = specialize;
        }
    }
}
