import javax.swing.*;

public class BorrowBookTest {
    public static void main(String[] args) {
        Book book = new Book("C# Programming", 5);

        while (true){
            int choice= JOptionPane.showConfirmDialog(null,"Do you wnat to borrow Book?" ,
                    "Borrow Book",JOptionPane.YES_NO_OPTION);

            if(choice == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null,"END PROGRAMMING");
            }

            if(book.getAvailableBook() > 0){
                book.borrowBook();
                System.out.println("Borrowed 1 book, available " + book.getAvailableBook() + " books. ");
            }
            else {
                JOptionPane.showMessageDialog(null, "No books available to borrow...",
                        "Warning Message",JOptionPane.WARNING_MESSAGE);
                break;
            }
            break;

        }
    }
}
