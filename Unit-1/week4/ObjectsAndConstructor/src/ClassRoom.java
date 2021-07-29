public class ClassRoom {
    String student_Name;
    int age;
    String address;

    public ClassRoom(String student_Name,int age,String address){
        this.student_Name=student_Name;
        this.age=age;
        this.address=address;
    }

    public static void main(String[] args) {
        ClassRoom classRoom=new ClassRoom("Rohith", 15,"Bengaluru");
        classRoom.printCategory();
        classRoom.printDetails();
        System.out.println("______________________________________");
        ClassRoom classRoom1=new ClassRoom("raj", 13,"Mangaluru");
        classRoom1.printCategory();
        classRoom1.printDetails();
    }

    public void printCategory(){
        if(age>=5 && age <=12){
            System.out.println("Primary School");
        }else if(age>=13 && age <=15) {
            System.out.println("High School");
        }
    }
    public void printDetails(){
        System.out.println(student_Name);
        System.out.println(address);
    }
}
