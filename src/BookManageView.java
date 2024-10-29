import java.util.ArrayList;
class BookManageView {
    public void printBookList(ArrayList<BookDTO> books) {
        System.out.println("Book List:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-5s %-20s %-10s %-15s %-5s %s\n", "책번호", "책 이름", "저자", "출판사", "가격", "쪽수");
        System.out.println("--------------------------------------------------");
        for (BookDTO book : books) {
            System.out.printf("%-5d %-25s %-15s %-20s %d원 %d쪽\n",
                    book.getBookNumber(),
                    book.getBookName(),
                    book.getAuthor(),
                    book.getPublisher(),
                    book.getPrice(),
                    book.getPages());
        }
        System.out.println("--------------------------------------------------");
    }

    public void printBook(BookDTO book) {
        if (book != null) {
            System.out.println("책 정보:");
            System.out.println("책 번호: " + book.getBookNumber());
            System.out.println("이름: " + book.getBookName());
            System.out.println("저자: " + book.getAuthor());
            System.out.println("출판사: " + book.getPublisher());
            System.out.println("가격: " + book.getPrice() + "원");
            System.out.println("출판사: " + book.getPages());
        } else {
            System.out.println("책 조회 실패.");
        }
    }

    public void printMenu() {
        System.out.println("\n도서 관리 시스템");
        System.out.println("1. 책 출력");
        System.out.println("2. 책 검색(단일)");
        System.out.println("3. 책 추가");
        System.out.println("4. 책 정보 수정");
        System.out.println("5. 책 삭제");
        System.out.println("6. 종료");
        System.out.print("원하시는 행동을 선택하십시오.: ");
    }
}
