public class Student {
    private String studentId;
    private String name;
    private double grade;
    private String course;

    public Student() {
        this.studentId = "";
        this.name = "";
        this.grade = 0.0;
        this.course = "";
    }

    public Student(String studentId, String name, double grade, String course) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.course = course;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String calculateLetterGrade() {
        if (grade >= 90) return "A";
        else if (grade >= 80) return "B";
        else if (grade >= 70) return "C";
        else if (grade >= 60) return "D";
        else return "F";
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Grade: " + grade);
        System.out.println("Letter Grade: " + calculateLetterGrade());
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId("S001");
        s1.setName("Alice");
        s1.setGrade(85.5);
        s1.setCourse("Mathematics");

        Student s2 = new Student("S002", "Bob", 72.0, "Physics");

        System.out.println("Student 1 Info:");
        s1.displayStudent();

        System.out.println("Student 2 Info:");
        s2.displayStudent();

        System.out.println("Testing Getters:");
        System.out.println(s1.getName() + " has grade " + s1.getGrade());
        System.out.println(s2.getName() + " has grade " + s2.getGrade());
    }
}
