package BT_Java.BT_05;

public class Student implements Comparable<Student> {
    String studentCode;
    String fullName;
    Double score;
    String yearOfBirth;

    public Student(String studentCode, String fullName, Double score, String yearOfBirth) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.score = score;
        this.yearOfBirth = yearOfBirth;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode='" + studentCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", score=" + score +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.studentCode.compareTo(o.studentCode);
    }
}
