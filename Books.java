public class Books {
    private int bookID;
    private String bookName;
    private String bookAuthor;
    private boolean isIssued;

    public Books(int bookID, String bookName, String bookAuthor, boolean isIssued) {

        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.isIssued = false;

    }
    public int getBookID() {
        return bookID;
    }
    public void setBookID(int bookID) {

        this.bookID = bookID;
    }
    public String getBookName() {

        return bookName;
    }
    public void setBookName(String bookName) {

        this.bookName = bookName;
    }
    public String getBookAuthor() {

        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {

        this.bookAuthor = bookAuthor;
    }
    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }


/*

    public boolean isIssued() {
        this.isIssued=true;
        return isIssued;
    }
    public boolean returnBook() {
        this.isIssued=false;
        return true;
    }
*/
    @Override
    public String toString() {
            return "Book{" +
                "id=" + bookID +
                ", title='" + bookName + '\'' +
                ", author='" + bookAuthor + '\'' +
                ", isBorrowed=" + isIssued +
                '}';
    }
}
