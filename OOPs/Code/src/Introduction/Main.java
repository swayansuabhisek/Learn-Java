package Introduction;

public class Main {
    public static void main(String[] args) {

        int[] rolls = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];
        Student[] students = new Student[5];

        Student gg = new Student();
        // gg.roll = 45;
        // gg.name = "Swayansu Abhisek";
        // gg.mark = 88.5f;

        Student g = new Student();
        //gg.greet();

        System.out.println(gg.roll);
        System.out.println(gg.name);
        System.out.println(gg.mark);

        Student random = new Student(gg);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        two.name ="gulu";
        System.out.println(one.name);
    }
}

class Student{
    int roll;
    String name;
    float mark;



    void greet(){
        System.out.println("My Name is "+this.name);
    }

    void changeName(String name){
        this.name = name;
    }

    Student(Student other){
        this.roll = other.roll;
        this.name = other.name;;
        this.mark = other.mark;
    }
    Student(){
        this.roll = 45;
        this.name = "Swayansu Abhisek";
        this.mark = 88.5f;
    }
    Student(int roll,String name,float mark){
        this.roll = roll;
        this.name  = name;
        this.mark = mark;
    }
}
