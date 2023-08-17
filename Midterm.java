public class Midterm {
    public static void main(String[] args) {
        Product P1 = new Product("Chair", 500.0);
        Product P2 = new Electronics("Telvision", 20000.0, "Samsung", "Neo QLED");
        Product P3 = new Smartphone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
        Product P4 = new Book("OOP Programing", 250.0, "Jone Doe", 300);
    
        P1.daisies();
        P1.getName();
        P1.getPrice();
        P1.daisies();

        P2.getName();
        P2.getPrice();
        P2.getBrand();
        P2.getModel();
        P2.daisies();

        P3.getName();
        P3.getPrice();
        P3.getBrand();
        P3.getModel();
        P3.getOperatingSystem();
        P3.daisies();
        
        P4.getName();
        P4.getPrice();
        P4.getAuthor();
        P4.getPages();
        P4.daisies();
    }
}

class Product {
    
    String name ;
    double price ;
    public Product(String name,double price){
        this.name = name;
        this.price = price;
    }

    public void getModel() {
    }

    public void getBrand() {
    }

    public void getOperatingSystem() {
    }

    public void getAuthor() {
    }

    public void getPages() {

    }

    public void getName(){
        System.out.println("");
        System.out.println("Product Name : " + this.name);
    }

    public String setName(String name){
        return name;
    }

    public void getPrice(){
        System.out.println("Product Price : " + this.price);
    }

    public double setPrice(double price){
        return price;
    }

    public void daisies(){
        int daisies = 36;
        for (int i = 1; i <= daisies; i++) {
            System.out.print("*");
        }   
    }
}

class Electronics extends Product {
    
    String brand ;
    String model ;
    public Electronics(String name,double price,String brand,String model){
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public void getBrand(){
        System.out.println("Brand : " + this.brand);
    }

    public String setBrand(String brand){
        return brand;
    }
    
    public void getModel(){
        System.out.println("Model : " + this.model);
    }

    public String setModel(String model){
        return model;
    }

}

class Smartphone extends Electronics {

    String OperatingSystem ;
    public Smartphone(String name,double price,String brand,String model,String OperatingSystem){
        super(name, price, brand, model);
        this.OperatingSystem = OperatingSystem;        
    }

    public void getOperatingSystem(){
        System.out.println("Operating System : " + this.OperatingSystem);
    }

    public String setOperatingSystem(String OperatingSystem){
        return OperatingSystem;
    }
}

class Book extends Product {

    String author;
    int pages;
    public Book(String name,double price,String author,int pages){
        super(name, price);
        this.author = author;
        this.pages =pages;
    }

    public void getAuthor(){
        System.out.println("Author : " + this.author);
    }

    public String setAuthor(String author){
        return author;
    }

    public void getPages(){
        System.out.println("Number of Pages : " + this.pages);
    }

    public int setPages(int pages){
        return pages;
    }
}