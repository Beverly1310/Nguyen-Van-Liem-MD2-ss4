import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //EX1
//Circle circle1 = new Circle();
//Circle circle2 = new Circle(5.8,"Red");
//        System.out.println(circle2.chuVi());
//        System.out.println(circle2.dienTich());
//        circle2.inputData(6.7,"Blue");
//        System.out.println(circle2.displayData());

        //EX2
//QuadraticEquation pt1 = new QuadraticEquation(4,-2,-6);
//        System.out.println(pt1.getDiscriminant());
//        System.out.println(pt1.getRoot1());
//        System.out.println(pt1.getRoot2());
        //EX3
//        double[] array = new double[1000000];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]=Math.random();
//        }
//        StopWatch program1 = new StopWatch();
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j <array.length ; j++) {
//                if (array[i]>array[j]){
//                   double tg=array[i];
//                    array[i]=array[j];
//                    array[j]=tg;
//                }
//            }
//        }
//        program1.setEndTime(System.currentTimeMillis());
//        System.out.println(program1.getElapsedTime());
        //EX4
//        Fan fan1= new Fan();
//        fan1.setOn(false);
//        fan1.setColor("Red");
//        fan1.setRadius(10);
//        System.out.println(fan1.toString());
        //EX5
//        Scanner scanner = new Scanner(System.in);
//        Student[] hs = new Student[100];
//        int index = -1;
//int choice;
//do {
//    System.out.println("==========Menu==========\n" +
//            "1. Hiển thị danh sách tất cả học sinh\n" +
//            "\n" +
//            "2.Thêm mới học sinh\n" +
//            "\n" +
//            "3.Sửa thông tin học sinh dựa vào mã học sinh\n" +
//            "\n" +
//            "4.Xoá học sinh\n" +
//            "\n" +
//            "5.Thoát\n" +
//            "\n" +
//            "Chọn việc muốn làm: ");
//    choice = Integer.parseInt(scanner.nextLine());
//    switch (choice) {
//        case 1:
//           if (index!=-1) {
//               for (int i = 0; i <=index; i++) {
//                   System.out.println(hs[i].displayData());
//               }
//           }
//           else {
//               System.out.println("Chưa có sinh viên nào");
//           };
//            break;
//        case 2:
//            index++;
//            hs[index] = new Student();
//            hs[index].setMaHs("HS"+(index+1));
//            System.out.println("Nhập tên SV: ");
//            hs[index].setTenHs(scanner.nextLine());
//            System.out.println("Nhập tuổi SV: ");
//            hs[index].setAge(Integer.parseInt(scanner.nextLine()));
//            System.out.println("Nhập giới tính Sv(Nam/Nữ): ");
//            hs[index].setSex(scanner.nextLine());
//            System.out.println("Nhập đại chỉ: ");
//            hs[index].setDiaChi(scanner.nextLine());
//            System.out.println("Nhập số điện thoại: ");
//            hs[index].setPhone(Integer.parseInt(scanner.nextLine()));
//            break;
//        case 3:
//            System.out.println("Nhập mã sinh viên cần sửa: ");
//            String update = scanner.nextLine();
//            for (int i = 0; i < hs.length; i++) {
//                if(update==hs[i].getMaHs()){
//                    System.out.println("Nhập tên mới: ");
//                    hs[i].setTenHs(scanner.nextLine());
//                    System.out.println("Nhập tuổi mới: ");
//                    hs[i].setAge(Integer.parseInt(scanner.nextLine()));
//                    System.out.println("Nhập giới tính mới(true/phone): ");
//                    hs[i].setSex(scanner.nextLine());
//                    System.out.println("Nhập đại chỉ: ");
//                    hs[i].setDiaChi(scanner.nextLine());
//                    System.out.println("Nhập số điện thoại: ");
//                    hs[i].setPhone(Integer.parseInt(scanner.nextLine()));
//                }
//            }
//            break;
//        case 4:
//            System.out.println("Nhập mã sinh viên cần xóa: ");
//            String delete = scanner.nextLine();
//            for (int i = 0; i < hs.length-1; i++) {
//                if(Objects.equals(delete, hs[i].getMaHs())){
//                    hs[i]=hs[i+1];
//                }
//            }
//            hs[hs.length-1]=null;
//            index--;
//            break;
//    }
//}
//while (choice!=5);
        //EX6
//        Employee nv1 = new Employee("a1","NV1",18,true,2.5);
//        Employee nv2 = new Employee();
//          nv2.inputData();
//        nv1.calSalary();
//        nv2.calSalary();
//        System.out.println(nv1.displayData());
//        System.out.println(nv2.displayData());
    }
}