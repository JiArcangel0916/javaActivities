package FirstItem;

public class StudentGrade {
    private String strLastName = "";
    private String strFirstName = "";
    private String strStudentNo = "";
    private String strEmailAddress = "";
    private String strCellPhoneNo = "";
    private int intCourseGrade = 0;
    private String strSubjectCode = "";

    public String getLastName(){
        return strLastName;
    }
    public String getFirstName(){
        return strFirstName;
    }
    public String getStudentNo(){
        return strStudentNo;
    }
    public String getEmailAddress(){
        return strEmailAddress;
    }
    public String getCellPhoneNo(){
        return strCellPhoneNo;
    }
    public int getCourseGrade(){
        return intCourseGrade;
    }
    public String getSubjectCode(){
        return strSubjectCode;
    }

    public String setLastName(String strLastName){
        this.strLastName = strLastName;
        return strLastName;
    }
    public String setFirstName(String strFirstName){
        this.strFirstName = strFirstName;
        return strFirstName;
    }
    public String setStudentNo(String strStudentNo){
        this.strStudentNo = strStudentNo;
        return strStudentNo;
    }
    public String setEmailAddress(String strEmailAddress){
        this.strEmailAddress = strEmailAddress;
        return strEmailAddress;
    }
    public String setCellPhoneNo(String strCellPhoneNo){
        this.strCellPhoneNo = strCellPhoneNo;
        return strCellPhoneNo;
    }
    public int setCourseGrade(int intCourseGrade){
        this.intCourseGrade = intCourseGrade;
        return intCourseGrade;
    }
    public String setSubjectCode(String strSubjectCode){
        this.strSubjectCode = strSubjectCode;
        return strSubjectCode;
    }
}
