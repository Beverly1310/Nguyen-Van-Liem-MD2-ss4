public class Circle {
    private double banKinh;
    private String color;
    public Circle(){}

    public Circle(double banKinh, String color) {
        this.banKinh = banKinh;
        this.color = color;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public String getColor() {
        return color;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public void setColor(String color) {
        this.color = color;
    }
    final double pi = 3.14F;
    public double chuVi() {
        double chuViHinhTron = 2*pi*banKinh;
        return chuViHinhTron;
    }
    public double dienTich() {
        double dienTichHinhTron = pi*banKinh*banKinh;
        return dienTichHinhTron;
    }
    public void inputData(double banKinh, String color) {
        this.banKinh=banKinh;
        this.color=color;
    }
    public String displayData() {
        String data = "Ban kinh hinh tron la: "+banKinh+" Mau cua hinh tron la: "+color;
        return data;
    }
}
