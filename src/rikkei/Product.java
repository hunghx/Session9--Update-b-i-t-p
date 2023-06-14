package rikkei;


import java.util.Scanner;

public class Product implements IProduct{
    private int id;
    private String name;
    private double price;
    private Category category;
    private boolean status = true;

    public Product() {
    }

    public Product(int id, String name, double price, Category category, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.status = status;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner sc) {

    }
    public void inputData(Scanner sc, Category[] list){
        System.out.println("Nhập id : ");
        this.setId(sc.nextInt()); // Nhập từ số
        System.out.println("Nhập tên sản phẩm");
        sc.nextLine();
//        sc = new Scanner(System.in);
        this.setName(sc.nextLine());// Nhập chuỗi
        System.out.println("Nhập giá ");
        this.setPrice(sc.nextDouble());
        // hiển thị danh sách danh mục
        for (Category cat :list
             ) {
            if (cat !=null){
                cat.displayData();
            }
        }
        // chọn danh mục theo id
        while(true){
            System.out.println("Nhập id của danh mục cho sản phẩm");
            int catId = sc.nextInt();
            for (Category cat: list) {
                if (cat != null && cat.getId() == catId) {
                    this.setCategory(cat);
                    break;
                }
            }
            if(this.category!=null){
                //kiểm tra xem thuộc tính category có null không
                break;
            }
            System.err.println("Không tìm thấy id , vui lòng thử lại");
        }
    }

    @Override
    public void displayData() {
        System.out.println("ID : "+id + " | Name : "+name + " | CategoryName : "+ category.getName()+ "\n"+
                " Price : "+ price + " | Status : " + (status?"Bán":"Không bán"));
    }
}
