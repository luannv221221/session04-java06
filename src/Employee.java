import java.util.Date;
import java.util.Scanner;

public class Employee {
    // định nghĩa trường
    private String code;
    private String name;
    private int age;
    private boolean sex;
    private double salary;

    public Employee() {
    }

    public Employee(String code, String name, int age, boolean sex, double salary) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // phương thức nhập thông tin
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã nhân viên ");
        this.code = scanner.nextLine();
        System.out.println("Nhập vào tên nhân viên ");
        this.name = scanner.nextLine();
        System.out.println("Nhập vào tuổi nhân viên ");
        this.age = scanner.nextInt();
        System.out.println("Nhập vào lương cơ bản ");
        this.salary = scanner.nextDouble();
    }
    // phương thức hiển thị thông tin
    public void showData(){
        System.out.println("Thôn tin nhân viên ");
        System.out.println("Mã nhân viên : "+this.code);
        System.out.println("Họ và tên : "+this.name);
        System.out.println("Năm sinh : "+(2024 - this.age));
        System.out.println("Lương cơ bản : "+this.salary);
    }
}
