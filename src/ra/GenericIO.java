package ra;

import java.util.Scanner;

public abstract class GenericIO {
    // final - cuối cùng  ko cho phép gán lại giá trị / hằng số ||
    // ko cho phép ghi đè phương thức
    // ko cho phép kế thừa bởi lớp
    private int id;
    private String name;


    public GenericIO() {
    }

    public GenericIO(int id, String name) {
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
    public abstract void inputData(Scanner sc);
    public abstract void displayData();
}
