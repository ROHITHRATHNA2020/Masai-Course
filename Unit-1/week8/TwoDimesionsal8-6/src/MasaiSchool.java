public abstract class MasaiSchool {
    private String studentName;
    private String studentID;
    private String programName;
    private String IAName;

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getProgramName() {
        return programName;
    }

    public String getIAName() {
        return IAName;
    }

    public abstract void setStudentName(String studentName);

    public abstract void setStudentID(String studentID);

    public abstract void setProgramName(String programName);

    public abstract void setIAName(String iaName);


}
