package entities;

public class Product {
    private String name;
    private Double price;
    private Integer quatity;

    public Product(String name, Double price, Integer quatity) {
        this.name = name;
        this.price = price;
        this.quatity = quatity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuatity() {
        return quatity;
    }

    public void setQuatity(Integer quatity) {
        this.quatity = quatity;
    }

    public double total() {
        return this.price * this.quatity;
    }
}
