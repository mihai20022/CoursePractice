package ExerciseProject.Products;

public class Products {
    private int id;
    private String name;
    private Category category;
    private String madeOf;
    private Double price;

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Products(int id, String name, Category category, String madeOf, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.madeOf = madeOf;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", madeOf='" + madeOf + '\'' +
                ", price=" + price +
                '}';
    }
}
