package filter;

import java.util.ArrayList;
import java.util.List;

// filtering out the laptop price greater than 25000

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}

public class FilterDemo4 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP Laptop", 25000));
        productList.add(new Product(2, "Del Laptop", 30000));
        productList.add(new Product(3, "Lenovo Laptop", 28000));
        productList.add(new Product(4, "Sony Laptop", 23000));
        productList.add(new Product(5, "Apple Laptop", 90000));

        productList
                .stream()
                .filter(laptop -> (laptop.price > 25000))
                .forEach(product -> System.out.println(product.getPrice()));

    }
}
