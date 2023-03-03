public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Ryan", "Gosling", "0987654");
        Student std2 = new Student("Dennis", "Ritchie", "1234567");

        std1.setGrade(18);
        std2.setGrade(17.5);

        std1.printStudentInfo();
        std2.printStudentInfo();

    }
}