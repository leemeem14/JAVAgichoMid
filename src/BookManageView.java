import java.util.ArrayList;

public class BookManageView {
    public void printBookList(ArrayList<BookDTO> books) {
        System.out.println("Book List:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-5s %-25s %-15s %-20s %-10s ", "No.", "Book Name", "Author", "Publisher", "Price");
                System.out.println("--------------------------------------------------");
        for (BookDTO book : books) {
            System.out.printf("%-5d %-25s %-15s %-20s %.2f원\n",
                    book.getBookNumber(),
                    book.getBookName(),
                    book.getAuthor(),
                    book.getPublisher(),
                    book.getPrice());
        }
        System.out.println("--------------------------------------------------");
    }
}
