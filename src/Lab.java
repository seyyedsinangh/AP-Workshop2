public class Lab {
    private Student[] students;
    private String teacherName;
    //the day when the lab is held
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;

    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        //an array of student with the size of maxSize
        students = new Student[maxSize];
        avgGrade = 0.0;
        currentSize = 0;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setAvgGrade(double avgGrade) {
        if (avgGrade<0 || avgGrade>20) {
            System.out.println("The grade is not valid.");
            return;
        }
        this.avgGrade = avgGrade;
    }

    public void calAvg() {
        double sum = 0.0;
        for (int i=0; i<currentSize; i++) {
            sum += students[i].getGrade();
        }
        avgGrade = sum/currentSize;
    }

    public void enrollStudent(Student registerStudent) {
        if (currentSize == maxSize) {
            System.out.println("The lab is full, you can't enroll students anymore!");
            return;
        }
        students[currentSize] = registerStudent;
        currentSize++;
    }

    public void printLabInfo() {
        System.out.println("The teacher's name:" + teacherName + "\nThe day of the lab:" + dayOfWeek);
        System.out.println("The maximum size of the lab:" + maxSize + "\nThe current size of the lab:" + currentSize);
        System.out.println("The average grade of the lab:" + avgGrade);
        System.out.println("Students:");
        for (int i=0; i<currentSize; i++) {
            System.out.println(students[i].getFirstname() + " " + students[i].getLastname());
        }
    }
}
