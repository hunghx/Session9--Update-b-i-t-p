package rikkei.entity;

import java.util.Scanner;

public class Category implements IGenericIO {

    private int id;
    private String name;

    public Category() {
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
