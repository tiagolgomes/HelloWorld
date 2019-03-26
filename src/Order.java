import java.util.ArrayList;

public class Order{

    private int number;
    private String date;
    private int parcel;

    Person person = new Person();
    Product product = new Product();
    ArrayList<Product> listProduct = new ArrayList<Product>();

    public Order() {
    }

    public Order(int number, String date, int parcel, Person person, Product product, ArrayList<Product> listProduct) {
        this.number = number;
        this.date = date;
        this.parcel = parcel;
        this.person = person;
        this.product = product;
        this.listProduct = listProduct;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getParcel() {
        return parcel;
    }

    public void setParcel(int parcel) {
        this.parcel = parcel;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }
}
