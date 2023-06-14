import rikkei.Category;
import ra.GenericIO;
import rikkei.Product;

import java.util.Scanner;

public class Main {
    private static Category[] listCategories = new Category[5];
    private static Product[] listProducts = new Product[2];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // thử tạo dối tượng từ abstract Class
//        GenericIO gen = new GenericIO() {
//            @Override
//            public void inputData(Scanner sc) {
//
//            }
//
//            @Override
//            public void displayData() {
//
//            }
//        };
//        Category newCategory = new Category();
//        newCategory.inputData(scanner);
//        newCategory.displayData();
        while (true) {
            System.out.println("-------------Menu-------------");
            System.out.println("1. Quản lí danh mục");
            System.out.println("2. Quản lí sản phẩm");
            System.out.println("3. Thoát");
            System.out.println("------------------------------");
            System.out.println("Hãy nhập vào chọn của bạn");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // menu quản lí danh mục
                    menuCategory();
                    break;
                case 2:
                    // menu quản lí san phẩm
                    menuProduct();
                    break;
                case 3:
                    // thoát chương trính
                    System.exit(0);
                    break;

                default:
                    System.err.println("số không đúng");
            }

        }
    }

    public static void menuCategory() {
        while (true) {
            System.out.println("-------------Category-------------");
            System.out.println("1. Danh sách tất cả danh mục");
            System.out.println("2. Thêm mới danh mục");
            System.out.println("3. Sửa danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Quay lại");
            System.out.println("----------------------------------");
            System.out.println("Hãy nhập vào chọn của bạn");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // danh sách
                    displayCategories();
                    break;
                case 2:
                    // thêm mới
                    createNewCategory();
                    break;
                case 3:
                    // Sửa
                    updateCategory();
                    break;
                case 4:
                    // Xóa
                    deleteCategory();
                    break;
                case 5:
                    // Quay lại
                    break;
                default:
                    System.err.println("số không đúng");
            }
            if (choice == 5) {
                break;
            }
        }
    }

    //hiển thị danh sách danh mục
    public static void displayCategories() {
        // kiểm tra danh sách có trống hay không
        if(checkSizeCategory()==0){
            System.err.println("Danh sách trống vui lòng thêm mới");
            return;
        }
//        trong 1 đối tượng category có phương thức dispayData()
        for (Category cat : listCategories) {
            if (cat != null) { //  check  khác null thì mới truy cập được displayData
                cat.displayData();
            }
        }
    }

    // Thêm mới
    public static void createNewCategory() {
        // kiểm tra danh sách đã đầy hay chưa
        if (checkSizeCategory()==listCategories.length) {
            System.err.println("Danh sách danh mục đầy, không thể tạo mới nữa");
            return;
        }
        Category catNew = new Category();
        // nhập vào các thuộc tính của đổi tượng vừa tạo
        catNew.inputData(scanner);
        // thêm mới đối tượng vào danh sách
        for (int i = 0; i < listCategories.length; i++) {
            if (listCategories[i] == null) {
                listCategories[i] = catNew;
                break;
            }
        }
        System.out.println("Thêm mới thành công");
    }
    // Sửa danh mục
    public  static void updateCategory(){
        // nhập vào id của danh mục cần sửa
        System.out.println("Nhập vào id muốn sửa");
        int idEdit = scanner.nextInt();
        // nuốt dòng
        scanner.nextLine();
        for (int i = 0; i < listCategories.length; i++) {
            if (listCategories[i]!=null){
                if(listCategories[i].getId()==idEdit){
                    // cho phép sửa
                    System.out.println("Nhập tên mới");
                    listCategories[i].setName(scanner.nextLine());
                    System.out.println("cập nhật thành công");
                    return;
                }
            }
        }
        System.err.println("không tìm thấy danh mục, vui lòng thử lại");
    }
    public  static void deleteCategory(){
        // nhập vào id của danh mục cần sửa
        System.out.println("Nhập vào id muốn xóa");
        int idDel = scanner.nextInt();
        // nuốt dòng
        scanner.nextLine();
        for (int i = 0; i < listCategories.length; i++) {
            if (listCategories[i]!=null){
                if(listCategories[i].getId()==idDel){
                    // cho phép xóa
                    listCategories[i]= null;
                    System.out.println("Xóa thành công");
                    return;
                }
            }
        }
        System.err.println("không tìm thấy danh mục, vui lòng thử lại");
    }
    public static int checkSizeCategory(){
        int size = 0;
        for (Category cat : listCategories) {
            if (cat != null) { //  check  khác null thì mới tăng giá trị đếm lên
                size++;
            }
        }
       return size;
    }

//    public static boolean checkFullSizeCategory() {
//        int dem = 0;
//        for (Category cat : listCategories) {
//            if (cat != null) { //  check  khác null thì mới tăng giá trị đếm lên
//                dem++;
//            }
//        }
//        if (dem >= 100) {
//            return true;
//        }
//        return false;
//    }
//    public static boolean checkEmptySizeCategory() {
//        int dem = 0;
//        for (Category cat : listCategories) {
//            if (cat == null) { //  check  khác null thì mới tăng giá trị đếm lên
//                dem++;
//            }
//        }
//        if (dem == 0 ) {
//            return true;
//        }
//        return false;
//    }
    // menu product
    public static void menuProduct(){
        while (true) {
            System.out.println("-------------Product-------------");
            System.out.println("1. Danh sách tất cả sản phẩm");
            System.out.println("2. Thêm mới sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phâmr");
            System.out.println("5. Quay lại");
            System.out.println("----------------------------------");
            System.out.println("Hãy nhập vào chọn của bạn");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // danh sách
                    displayProduct();
                    break;
                case 2:
                    // thêm mới
                    createNewProduct();
                    break;
                case 3:
                    // Sửa
                    updateProduct();
                    break;
                case 4:
                    // Xóa
                    deleteProduct();
                    break;
                case 5:
                    // Quay lại
                    break;
                default:
                    System.err.println("số không đúng");
            }
            if (choice == 5) {
                break;
            }
        }
    }


    // hiển thị danh sách sanr phẩm
    public static void displayProduct() {
        // kiểm tra danh sách có trống hay không
        if(checkSizeProduct()==0){
            System.err.println("Danh sách trống vui lòng thêm mới");
            return;
        }
//        trong 1 đối tượng product có phương thức dispayData()
        for (Product pro : listProducts) {
            if (pro != null) { //  check  khác null thì mới truy cập được displayData
                pro.displayData();
            }
        }
    }
    // thêm mới
    public static void createNewProduct() {
        // kiẻm tra xem có danh mục chưa
        if (checkSizeCategory()==0) {
            System.err.println("Danh sách danh mục trống, không thể tạo sản phẩm");
            return;
        }
        // kiểm tra danh sách đã đầy hay chưa
        if (checkSizeProduct()==listProducts.length) {
            System.err.println("Danh sách sản phẩm đầy, không thể tạo mới nữa");
            return;
        }
        Product proNew = new Product();
        // nhập vào các thuộc tính của đổi tượng vừa tạo
        proNew.inputData(scanner,listCategories);
        // thêm mới đối tượng vào danh sách
        for (int i = 0; i < listProducts.length; i++) {
            if (listProducts[i] == null) {
                listProducts[i] = proNew;
                break;
            }
        }
        System.out.println("Thêm mới thành công");
    }

    // kiểm tra số lượng sản phẩm
    public static int checkSizeProduct(){
        int size = 0;
        for (Product pro : listProducts) {
            if (pro != null) { //  check  khác null thì mới tăng giá trị đếm lên
                size++;
            }
        }
        return size;
    }
    // update
    public  static void updateProduct(){
        // nhập vào id của danh mục cần sửa
        System.out.println("Nhập vào id muốn sửa");
        int idEdit = scanner.nextInt();
        // nuốt dòng
        scanner.nextLine();
        for (int i = 0; i < listProducts.length; i++) {
            if (listProducts[i]!=null){
                if(listProducts[i].getId()==idEdit){
                    // cho phép sửa
                    System.out.println("Nhập tên mới");
                    listProducts[i].setName(scanner.nextLine());
                    System.out.println("Nhập giá mới ");
                    listProducts[i].setPrice(scanner.nextDouble());
                    // hiển thị danh sách danh mục
                    displayCategories();
                    // chọn danh mục theo id
                    while(true){
                        System.out.println("Nhập id của danh mục mới cho sản phẩm");
                        int catId = scanner.nextInt();
                        for (Category cat: listCategories) {
                            if (cat != null && cat.getId() == catId) {
                                listProducts[i].setCategory(cat);
                                break;
                            }
                        }
                        if(listProducts[i].getCategory()!=null){
                            //kiểm tra xem thuộc tính category có null không
                            break;
                        }
                        System.err.println("Không tìm thấy id , vui lòng thử lại");
                    }
                    // thông báo
                    System.out.println("cập nhật thánh công");
                    return;
                }
            }
        }
        System.err.println("không tìm thấy danh mục, vui lòng thử lại");
    }
    // delete
    public  static void deleteProduct(){
        // nhập vào id của danh mục cần sửa
        System.out.println("Nhập vào id muốn xóa");
        int idDel = scanner.nextInt();
        // nuốt dòng
        scanner.nextLine();
        for (int i = 0; i < listProducts.length; i++) {
            if (listProducts[i]!=null){
                if(listProducts[i].getId()==idDel){
                    // cho phép xóa
                    listProducts[i]= null;
                    System.out.println("Xóa thành công");
                    return;
                }
            }
        }
        System.err.println("không tìm thấy sản phẩm, vui lòng thử lại");
    }
}