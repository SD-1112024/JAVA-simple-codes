package JAVAPROGRAMMING;

class Student {
    String name;
    int rollno;
    int age;   

public Student(String name, int rollno){
    this.name=name;
    this.rollno=rollno;
}

private Student(Student S1){
    this.name=name;
    this.rollno=rollno;
    this.age=age;
}
}
class Demo{
    public static void main(String[] args) {
        Student S1= new Student("Raj",121);
        Student S2= new Student("Ram",124);
        Student S3= new Student("Raj","121","31");
        System.out.println("Student 1:"+S1);
        System.out.println("Student 2:"+S2);
        System.out.println("Student 3:"+S3);
    }

    @Override
    public String toString() {
        return "Demo []";
    }
}

  