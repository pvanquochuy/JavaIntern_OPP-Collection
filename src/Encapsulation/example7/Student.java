package Encapsulation.example7;

public class Student {
    private int student_id;
    private String student_name;
//    private List<Double> grades;

    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
//        this.grades = new ArrayList<>();
    }

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int studentId) {
        this.student_id = studentId;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String studentName) {
        this.student_name = studentName;
    }

//    public void addGrade(double grade) {
//        if (grade < 0.0 || grade > 100.0) {
//            throw new IllegalArgumentException("Grade must be between 0.0 and 100.0");
//        }
//        grades.add(grade);
//    }

//    public double calculateAverageGrade() {
//        if (grades.isEmpty()) {
//            throw new IllegalStateException("No grades added yet!");
//        }
//        double sum = 0.0;
//        for (double grade : grades) {
//            sum += grade;
//        }
//        return sum / grades.size();
//
//    }
}
