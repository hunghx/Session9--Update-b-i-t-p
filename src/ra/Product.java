package ra;

import java.util.Scanner;

public class Product extends GenericIO{
    private double price;
    private Category category;
    private boolean status;

    public Product(double price, Category category, boolean status) {
        this.price = price;
        this.category = category;
        this.status = status;
    }

    public Product(int id, String name, double price, Category category, boolean status) {
        super(id, name);
        this.price = price;
        this.category = category;
        this.status = status;
    }

    @Override
    public void inputData(Scanner sc) {

    }

    @Override
    public void displayData() {

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
}
