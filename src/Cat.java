public class Cat {
    // định nghĩa trường | thuộc tính
    public String catName;
    public String color;
    public String type;
    public float weight;
    public boolean sex;

    // Constructor không tham số
    public Cat(){

    }
    // constructor đầy đủ tham số
    public Cat(String catName,String color,String type,float weight,boolean sex){
       this.catName =  catName;
       this.color = color;
       this.type = type;
       this.weight = weight;
       this.sex = sex;
    }

    // Phương thức ăn
    public void eat(){
        System.out.println("Tôi tên là "+this.catName);
        System.out.println(this.catName + " Đang ăn");

    }

    // getter setter

}
