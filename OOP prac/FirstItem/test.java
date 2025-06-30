package FirstItem;

public class test {
    public static void main(String[]args){
        StudentGrade clSG = new StudentGrade();

        System.out.println(clSG.getLastName());
        System.out.println(clSG.getFirstName());
        System.out.println(clSG.getStudentNo());
        System.out.println(clSG.getEmailAddress());
        System.out.println(clSG.getCellPhoneNo());
        System.out.println(clSG.getCourseGrade());
        System.out.println(clSG.getSubjectCode());

        System.out.println(clSG.setLastName("Dela Cruz"));
        System.out.println(clSG.setFirstName("Juan"));
        System.out.println(clSG.setStudentNo("202312345"));
        System.out.println(clSG.setEmailAddress("juandc@sample.com"));
        System.out.println(clSG.setCellPhoneNo("09221234567"));
        System.out.println(clSG.setCourseGrade(90));
        System.out.println(clSG.setSubjectCode("0912"));
    } 
}