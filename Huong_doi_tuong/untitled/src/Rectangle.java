public class Rectangle {
    int chieudai;
    int chieurong;

    public Rectangle(){
    }

    public Rectangle(int chieurong, int chieudai) {
        this.chieurong = chieurong;
        this.chieudai = chieudai;
    }

    public String display(){
        return "Hình chữ nhật có chiều dài là: " + chieudai + " và chiều rộng là: " + chieurong;
    }

    public int getArea() {
        return this.chieudai * this.chieurong;
    }

    public int getPerimeter() {
        return (this.chieudai + this.chieurong) * 2;
    }
}
