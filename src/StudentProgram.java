public class StudentProgram {
    public static void main(String[] args) {
        // khởi tạo đối tượng sv1
        Student student1 = new Student();
        student1.setStudentName("Đức Mai");
        student1.studentCode = "B111";
        student1.age = 19;
        student1.showInfo();

        // Khởi tạo đôi tượng sv2 thông Constructor có tham số
        Student student2 = new Student("Ngọc Mai","B001",18);
        System.out.println("Tên của đối tượng student2 là "+student2.getStudentName());
        student2.showInfo();

    }
}
