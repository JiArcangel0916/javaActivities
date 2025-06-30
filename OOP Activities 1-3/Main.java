public class Main {
    public static void main(String[] args){
        Student stud1 = new Student();
        stud1.setId(34002);
        stud1.setName("Albrecht Zildjian A. Arcangel");
        stud1.setCourse("BS in Computer Science");

        System.out.println();
        System.out.println("Student ID:     "+stud1.getId());
        System.out.println("Name:           "+stud1.getName());
        System.out.println("Course:         "+stud1.getCourse());
        System.out.println();
    }
}
