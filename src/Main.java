public class Main {
    public static void main(String[] args) {
        BookManageController controller = new BookManageController();
        BookManageView view = new BookManageView();
        view.printBookList(controller.getBookList());
    }
}
