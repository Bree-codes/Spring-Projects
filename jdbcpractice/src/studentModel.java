public class studentModel {

    private int rollNumber;

    private String name;

    private String course;


    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    public String toString()
    {
        return "Roll Number : " + rollNumber+"  Name : "+name+"  Course :  "+course+"\n";
    }

    public studentModel studentModel()
    {
        return new studentModel();
    }
}
