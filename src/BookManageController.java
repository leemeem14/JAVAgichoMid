import java.util.ArrayList;

public class BookManageController {
    private ArrayList<BookDTO> bookList;

    public BookManageController() {
        bookList = new ArrayList<>();
        initializeBooks();
    }

    private void initializeBooks() {
        bookList.add(new BookDTO(1525, "책", "말", "한", 8500));
        bookList.add(new BookDTO(2683, "이", "적", "국", 10000));
        bookList.add(new BookDTO(3189, "름", "을", "폴", 5500));
        bookList.add(new BookDTO(4792, "정", "게", "리", 11500));
        bookList.add(new BookDTO(5153, "하", "생", "텍", 13500));
        bookList.add(new BookDTO(6904, "기", "각", "정", 9500));
        bookList.add(new BookDTO(7884, "귀", "이", "수", 5000));
        bookList.add(new BookDTO(8891, "찮", "안", "캠", 7000));
        bookList.add(new BookDTO(9012, "아", "나", "퍼", 6500));
        bookList.add(new BookDTO(1003, "요", "요", "스", 4500));
    }

    public ArrayList<BookDTO> getBookList() {
        return bookList;
    }
}

