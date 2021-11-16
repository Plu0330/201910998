public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}

class Course {

    protected String Code;
    protected String Name;

    public String GetCode(String Code) {return Code;}
    public String GetName(String Name) {return Name;}

    public void Course (String Code, String Name) {
        this.Code = Code;
        this.Name = Name;
    }
}

class OfflineCourse extends Course {
    public OfflineCourse(String Code, String Name) {
        this.Code = Code;
        this.Name = Name;
    }

    @Override
    public String toString() {return "Code: " + Code + ", Name: " + Name +", Type: Offline";}
}

class OnlineCourse extends Course {
    public OnlineCourse(String Code, String Name) {
        this.Code = Code;
        this.Name = Name;
    }

    @Override
    public String toString() {return "Code: " + Code + ", Name: " + Name +", Type: Online";}
}