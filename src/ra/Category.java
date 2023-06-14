package ra;

import java.util.Scanner;

public class Category extends GenericIO{

    @Override
    public void inputData(Scanner sc) {
//        sc = new Scanner(System.in);
        System.out.println("Nhập id : ");
        this.setId(sc.nextInt()); // Nhập từ số
        System.out.println("Nhập tên danh mục");
        sc.nextLine();
//        sc = new Scanner(System.in);
        this.setName(sc.nextLine());// Nhập chuỗi
    }

    @Override
    public void displayData() {
        System.out.println("ID : "+this.getId()+ " | Name : "+ this.getName());
    }
}
