public class Book {
    public boolean getId;
    private int id;
    private static int latestId;
    private final String name;
    private final String author;
    private double price;
    public Book(String name,String author,double price){
        this.id = latestId++;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                 id +
                " , " + name  +
                '}';
    }
}
