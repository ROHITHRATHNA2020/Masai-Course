public class StudentDrive {
    public static void main(String[] args) {
        Student student1= new Student("Aman","19-05-1995","O+ve");

        System.out.println("Student 1 name is "+student1.name);
        int a= age(student1.DOB);
        System.out.println("Student 1 age is "+ a);
        System.out.println("Student 1 blood group is "+student1.blood_Group);

        Student student2= new Student("Rahul Vats","18-05-1998","AB -ve");
        System.out.println("Student 2 name is "+student2.name);
        int b=age(student1.DOB);
        System.out.println("Student 2 age is "+b);
        System.out.println("Student 2 blood group is "+student2.blood_Group);
    }

    public static int age(String DOB){
        int currentYear=2021;
        String[] str=DOB.split("-");
        int a=Integer.parseInt(str[2]);
        int age=currentYear-a;
        return age;
    }
}
