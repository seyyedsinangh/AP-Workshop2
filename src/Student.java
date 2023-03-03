public class Student {
    private String firstname;
    private String lastname;
    //student's id contains at least 7 digits
    private String id;
    private double grade;

    public Student(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        //the student's first grade is zero in the begining
        grade = 0;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(String id) {
        //the id can't be less than 7 digits
        if (id.length()<7) {
            System.out.println("The id is not valid.");
            return;
        }
        this.id = id;
    }

    public void setGrade(double grade) {
        //the grade can't be less than 0 or more than 20
        if (grade>20 || grade<0) {
            System.out.println("The grade is not valid.");
            return;
        }
        this.grade = grade;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public void printStudentInfo() {
        System.out.println(firstname + " " + lastname + "\nID:" + id + "\nGRADE:" + grade);
    }
}
