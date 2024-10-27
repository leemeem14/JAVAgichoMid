import java.util.ArrayList;
class BookManageController {
    private ArrayList<BookDTO> bookList;

    public BookManageController() {
        bookList = new ArrayList<>();
        initializeBooks();
    }

    private void initializeBooks() {
        bookList.add(new BookDTO(1, "책", "말", "한", 8500));
        bookList.add(new BookDTO(2, "이", "적", "국", 10000));
        bookList.add(new BookDTO(3, "름", "을", "폴", 5500));
        bookList.add(new BookDTO(4, "정", "게", "리", 11500));
        bookList.add(new BookDTO(5, "하", "생", "텍", 13500));
        bookList.add(new BookDTO(6, "기", "각", "정", 9500));
        bookList.add(new BookDTO(7, "귀", "이", "수", 5000));
        bookList.add(new BookDTO(8, "찮", "안", "캠", 7000));
        bookList.add(new BookDTO(9, "아", "나", "퍼", 6500));
        bookList.add(new BookDTO(10, "요", "요", "스", 4500));
    }

    public ArrayList<BookDTO> getBookList() {
        return bookList;
    }

    public BookDTO getBook(int bookNumber) {
        for (BookDTO book : bookList) {
            if (book.getBookNumber() == bookNumber) {
                return book;
            }
        }
        return null;
    }

    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public boolean updateBook(int bookNumber, BookDTO updatedBook) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getBookNumber() == bookNumber) {
                bookList.set(i, updatedBook);
                return true;
            }
        }
        return false;
    }

    public boolean deleteBook(int bookNumber) {
        return bookList.removeIf(book -> book.getBookNumber() == bookNumber);
    }
}

