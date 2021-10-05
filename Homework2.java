import java.util.Scanner;

class StudentTest {
    public static void main(String[] args) {

        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Scanner sc1 = new Scanner(System.in);
        Student s1 = new Student(sc1.next(), sc1.next(), sc1.next() , sc1.next());

        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Scanner sc2 = new Scanner(System.in);
        Student s2 = new Student(sc2.next(), sc2.next(), sc2.next(), sc2.next());

        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Scanner sc3 = new Scanner(System.in);
        Student s3 = new Student(sc3.next(), sc3.next(), sc3.next(), sc3.next());

        String v1, v2, v3;
        v1 = s1.Phone_number.substring(0,3) + "-" + s1.Phone_number.substring(3,7) + "-" + s1.Phone_number.substring(7,11);
        v2 = s2.Phone_number.substring(0,3) + "-" + s2.Phone_number.substring(3,7) + "-" + s2.Phone_number.substring(7,11);
        v3 = s2.Phone_number.substring(0,3) + "-" + s3.Phone_number.substring(3,7) + "-" + s3.Phone_number.substring(7,11);

        System.out.println("첫번째 학생: " + s1.Student_ID + " " + s1.name + " " + s1.major + " " + v1);
        System.out.println("두번째 학생: " + s2.Student_ID + " " + s2.name + " " + s2.major + " " + v2);
        System.out.println("세번째 학생: " + s3.Student_ID + " " + s3.name + " " + s3.major + " " + v3);
    }
}


class Student {
        String Student_ID;
        String name;
        String major;
        String Phone_number;

        Student (String Student_ID, String name, String major, String Phone_number) {
            this.Student_ID = Student_ID;
            this.name = name;
            this.major = major;
            this.Phone_number = Phone_number;
        }

        void setStudent_ID(String s) {
            Integer.parseInt(s);
            Student_ID = s;
        }

        String getStudent_ID() {
            return Student_ID;
        }

        void setName(String n) {
            name = n;
        }

        String getName() {
            return name;
        }

        void setMajor(String m) {
            major = m;
        }

        String getMajor() {
            return major;
        }

        void setPhone_number(String num) {
        Integer.parseInt(num);
        Phone_number = num;
        }

        String getPhone_number() {
            return Phone_number;
        }



}


