public class Spartans extends MasaiSchool{
    private String batchName;
    private String studentName;

    @Override
    public String getStudentName() {
    }

    @Override
    public String getStudentID() {
        return super.getStudentID();
    }

    @Override
    public String getProgramName() {
        return super.getProgramName();
    }

    @Override
    public String getIAName() {
        return super.getIAName();
    }

    public void setBatchName(String batchName){
        this.batchName=batchName;
    }

    public void display(){
        System.out.println("Student Name is "+getStudentName());
        System.out.println("student ID is "+getStudentID());
        System.out.println("Program Name is "+getProgramName());
        System.out.println("IA Name is "+getIAName());
        System.out.println("Batch Name is "+ batchName);
    }

    @Override
    public void setStudentName(String studentName) {
      this.studentName=studentName;
    }

    @Override
    public void setStudentID(String studentID) {

    }

    @Override
    public void setProgramName(String programName) {

    }

    @Override
    public void setIAName(String iaName) {
    }
}
