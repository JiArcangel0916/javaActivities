class Student{
    private int id;
    private String name, course;

    public void setId(int newId){
        this.id = newId;
    }

    public void setName(String newName){
        this.name = newName;
    }
    
    public void setCourse(String newCourse){
        this.course = newCourse;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCourse(){
        return course;
    }
}