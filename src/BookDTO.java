public class BookDTO {
    private int bookNumber;
    private String bookName;
    private String author;
    private String publisher;
    private int price;

    public BookDTO(int bookNumber, String bookName, String author, String publisher, int price) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    // Getters and Setters
    public int getBookNumber() { return bookNumber; }
    public void setBookNumber(int bookNumber) { this.bookNumber = bookNumber; }
    public String getBookName() { return bookName; }
    public void setBookName(String bookName) { this.bookName = bookName; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public double getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
}
