
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class libraryManager {
    private List<Books> books;
    private List<User> students;

        public libraryManager() {
            books = new ArrayList<Books>();
            students = new ArrayList<User>();
        }

        public void addBook(Books book) {
            books.add(book);
            System.out.println("Book added: " + book.getBookName() + " bookID: " + book.getBookID() + " bookAuthor: " + book.getBookAuthor());
        }

        public void updateBook(int bookId, String newbookName, String newbookAuthor) {

            //String x = books.getBookName();
            //System.out.println(x);
            for (Books books : books) {
                System.out.println(newbookName);
                if (books.getBookID() == bookId) {
                    books.setBookName(newbookName);
                    books.setBookAuthor(newbookAuthor);
                    System.out.println("Book updated: " + newbookName + "BookID: " + books.getBookID() + " bookAuthor: " + books.getBookAuthor());
                    return;
                }
            }
            System.out.println("Book not found!");
        }

        // Method to delete a student
        public void deleteBook(int bId) {
            Iterator<Books> it = books.iterator();
            while (it.hasNext()) {
                if (it.next().getBookID() == bId) {
                    it.remove();
                    System.out.println("Book deleted: " + bId);
                    return;
                }
            }
            System.out.println("Book not found!");
        }

        public void displayBooks() {
            System.out.println("Available Books:");
            for (Books books : books) {
                //if (!book.isIssued()) {
                System.out.println("BookId:- " + books.getBookID() + " BookName:- " + books.getBookName() + " Author:- " + books.getBookAuthor() + " isIssued:- " + books.isIssued());
                //}
            }
        }


        public void addUser(User student) {
            students.add(student);
            System.out.println("Student added:- " + student.getUsername() + " studentID:- " + student.getUserId() + " bookName:- " + student.getBookName());
        }

        public void updateStudent(int stdId, String stdname, String stdbook) {
            for (User students : students) {
                if (students.getUserId() == stdId) {
                    students.setUsername(stdname);
                    students.setBookName(stdbook);
                    System.out.println("Student updated: " + stdname + " studentID: " + students.getUserId() + " bookName: " + students.getBookName());
                    return;
                }
            }
            System.out.println("Student not found!");
        }

        // Method to delete a student
        public void deleteStudent(int stdId) {
            Iterator<User> it = students.iterator();
            while (it.hasNext()) {
                if (it.next().getUserId() == stdId) {
                    it.remove();
                    System.out.println("Student deleted: " + stdId);
                    return;
                }
            }
            System.out.println("Student not found!");
        }

        public void displayStudents() {
            System.out.println("Registered  Students:");
            for (User students : students) {
                System.out.println("StudentId:\'" + students.getUserId() + "\' studentName:\'" + students.getUsername() + " bookIsuused:\' " + students.getBookName());

            }
        }

        public void issueBook(String booknamenew, String issueuser) {
            for (Books book : books) {

                if (book.getBookName().equalsIgnoreCase(booknamenew) && !book.isIssued()) {
                    book.issueBook();
                    System.out.println("Book issued to " + issueuser + ": " + booknamenew);
                    return;
                }
                System.out.println("Book not available or already issued.");
            }
        }
        public void returnBook(String newbook, String returnuser) {
            for (Books book : books) {
                if (book.getBookName().equalsIgnoreCase(newbook) && book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book returned: " + book.getBookName() + " by "+returnuser);
                    return;
                }
            }
            System.out.println("Book not found or not issued.");
        }

        public void searchBook(String searchbookName) {
            for (Books book : books) {
                if (book.getBookName().equalsIgnoreCase(searchbookName)) {
                    System.out.println("Book found: " + book.getBookName()+" Author: "+book.getBookAuthor()+" isIssued: "+book.isIssued());
                    return;
                }

            }
            System.out.println("Book not found");
        }
        public void searchstudent(String SearchstdName){
            for (User students : students) {
            if (students.getUsername().equalsIgnoreCase(SearchstdName)){
                System.out.println("Student found: " + students.getUsername()+ "bookName:- " + students.getBookName()+ " studentID:- " + students.getUserId());
                return;
            }
        }
            System.out.println("Student not found");
    }
}