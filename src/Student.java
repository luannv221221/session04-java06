public class Student {
    private String studentName;
    public String studentCode;
    int age;

    // Constructor không tham
    public Student() {
    }
    // Constructor đầy đủ tham số
    public Student(String studentName, String studentCode, int age) {
        this.studentName = studentName;
        this.studentCode = studentCode;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("Thông tin sinh viên ");
        System.out.println("Mã sinh viên "+this.studentCode);
        System.out.println("Tên sinh viên "+this.studentName);
        System.out.println("Tuổi "+this.age);
    }

    // phương thức setter
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    // phương thức getter
    public String getStudentName(){
        return this.studentName;
    }
}
