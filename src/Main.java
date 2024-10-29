import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BookManageController controller = new BookManageController();
        BookManageView view = new BookManageView();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.printMenu();
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        view.printBookList(controller.getBookList());
                        break;
                    case 2:
                        System.out.print("조회할 책 번호를 입력하세요: ");
                        int searchNumber = scanner.nextInt();
                        scanner.nextLine();
                        view.printBook(controller.getBook(searchNumber));
                        break;
                    case 3:
                        System.out.print("추가할 책의 번호를 입력하세요: ");
                        int newNumber = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("추가할 책의 제목을 입력하세요: ");
                        String newName = scanner.nextLine();
                        System.out.print("추가할 책의 저자를 입력하세요: ");
                        String newAuthor = scanner.nextLine();
                        System.out.print("추가할 책의 출판사를  입력하세요: ");
                        String newPublisher = scanner.nextLine();
                        System.out.print("추가할 책의 가격을 입력하세요: ");
                        int newPrice = scanner.nextInt();
                        System.out.print("추가할 책의 쪽수를 입력하세요: ");
                        int newPage = scanner.nextInt();
                        scanner.nextLine();
                        controller.addBook(new BookDTO(newNumber, newName, newAuthor, newPublisher, newPrice, newPage));
                        System.out.println("책이 추가 되었습니다.");
                        break;
                    case 4:
                        System.out.print("정보 수정할 책의 번호를 입력하세요: ");
                        int updateNumber = scanner.nextInt();
                        scanner.nextLine();
                        BookDTO bookToUpdate = controller.getBook(updateNumber);
                        if (bookToUpdate != null) {
                            System.out.print("책의 이름을 입력하세요(엔터로 정보 유지).: ");
                            String updatedName = scanner.nextLine();
                            if (!updatedName.isEmpty()) bookToUpdate.setBookName(updatedName);

                            System.out.print("책의 저자를 입력하세요(엔터로 정보 유지).: ");
                            String updatedAuthor = scanner.nextLine();
                            if (!updatedAuthor.isEmpty()) bookToUpdate.setAuthor(updatedAuthor);

                            System.out.print("책의 출판사를 입력하세요(엔터로 정보 유지).: ");
                            String updatedPublisher = scanner.nextLine();
                            if (!updatedPublisher.isEmpty()) bookToUpdate.setPublisher(updatedPublisher);

                            System.out.print("책의 가격을 입력하세요(-1 입력으로 정보 유지).: ");
                            int updatedPrice = scanner.nextInt();
                            scanner.nextLine();
                            if (updatedPrice != -1) bookToUpdate.setPrice(updatedPrice);

                            System.out.print("책의 쪽수를 입력하세요(-1 입력으로 정보 유지).");
                            int updatedPage = scanner.nextInt();
                            scanner.nextLine();
                            if (updatedPage != -1) bookToUpdate.setPages(updatedPage);

                            if (controller.updateBook(updateNumber, bookToUpdate)) {
                                System.out.println("책의 수정이 완료되었습니다.");
                            } else {
                                System.out.println("다시 시도해주시길 바랍니다.");
                            }
                        } else {
                            System.out.println("입력하신 번호의 책이 조회되지 않습니다.");
                        }
                        break;
                    case 5:
                        System.out.print("삭제할 책의 번호를 입력하십시오.: ");
                        int deleteNumber = scanner.nextInt();
                        scanner.nextLine();
                        if (controller.deleteBook(deleteNumber)) {
                            System.out.println("책 삭제가 완료 되었습니다.");
                        } else {
                            System.out.println("책을 찾을수 없거나 삭제에 실패하였습니다.");
                        }
                        break;
                    case 6:
                        System.out.println("종료합니다.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("지원하지않는 숫자입니다.");
                }
            } catch (Exception e) {
                System.out.println("에러가 발생했습니다.: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}