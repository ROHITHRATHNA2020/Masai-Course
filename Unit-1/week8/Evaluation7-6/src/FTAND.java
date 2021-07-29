public class FTAND extends Assignment {
     private String assignmentName;
     private String assignmentLink;

    @Override
    public void setAssignmentName(String assignmentName) {
        this.assignmentName=assignmentName;
    }

    @Override
    public void setAssignmentLink(String link) {
       assignmentLink=link;
    }

    @Override
    public String getAssignmentName() {
        return assignmentName;
    }

    @Override
    public String getAssignmentLink() {
        return assignmentLink ;
    }


    @Override
    public void display() {
        System.out.println("The Assignment Name is "+getAssignmentName());
        System.out.println("The Assignment Link is "+getAssignmentLink());
    }
}


/*

    public void display(){
        System.out.println("The Assignment Name is "+getAssignmentName() );
        System.out.println("The Assignment Link is  " +getAssignmentLink());
        System.out.println("The Assignment Password is " +getAssignmentPassword());
        System.out.println("Total number of questions are " );
        System.out.println("Batch Name is FTAND-03"+getBatchName());

    }
 */
