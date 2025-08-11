

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Library Management System");
        System.out.println("Please enter your Choice:");

        libraryManager manager = new  libraryManager ();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add New Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Register New Student");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Show All Registered Student");
            System.out.println("9. Issue Book");
            System.out.println("10. Return Book");
            System.out.println("11. Search Book");
            System.out.println("12. Search Student");
            System.out.println("13. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            //System.out.print(choice);

            switch(choice) {
                case 1:

                System.out.print("Enter bookID: ");
                int bookID = scanner.nextInt();

                scanner.nextLine();  // Consume newline

                System.out.print("Enter bookName: ");
                String bookName = scanner.nextLine();

                System.out.print("Enter bookAuthor: ");
                String bookAuthor = scanner.nextLine();

                    manager.addBook(new Books(bookID,bookName,bookAuthor,true));
                break;
                case 2:
                    System.out.print("Enter BookId to update: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter BookName to update: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter BookAuthor to update: ");
                    String author = scanner.nextLine();

                    manager.updateBook(bookId,name,author);
                    break;
                case 3:

                    System.out.print("Enter BookId to Delete: ");

                    int bId = scanner.nextInt();
                    manager.deleteBook(bId);
                    break;
                case 4:
                    manager.displayBooks();
                    break;
                case 5:
                    System.out.print("Enter Student ID: ");
                    int studentId= scanner.nextInt();// Consume newline
                     scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String studentName = scanner.nextLine();

                    System.out.print("Enter Book Name: ");
                    String bookIssued = scanner.nextLine();

                     manager.addUser(new User(studentId, studentName, bookIssued));
                    break;
                case 6:
                    System.out.print("Enter Student Id to update: ");
                    int stdId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Student Name ");
                    String stdname = scanner.nextLine();

                    System.out.print("Enter Book Name: ");
                    String stdbook = scanner.nextLine();

                    manager.updateStudent(stdId,stdname,stdbook);
                    break;
                case 7:
                    System.out.print("Enter Student ID: ");
                    int DelID = scanner.nextInt();
                    scanner.nextLine();

                    manager.deleteStudent(DelID);
                    break;
                case 8:
                    manager.displayStudents();
                 //   scanner.nextLine();
                    break;
                case 9:
                    System.out.println("Enter Book Name: ");
                    Scanner sc = new Scanner(System.in);
                    String borrowbook = sc.nextLine();
                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String  isssueuser=sc.nextLine();

                    manager.issueBook(borrowbook,isssueuser);
                    break;
                case 10:
                    System.out.print("Enter Book Name: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String bookreturn = scanner1.nextLine();
                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String  Namestudent=scanner1.nextLine();

                    manager.returnBook(bookreturn,Namestudent);
                    break;
                case 11:
                    System.out.print("Enter Book Name: ");
                    Scanner scanner2= new Scanner(System.in);
                    String searchbookName = scanner2.nextLine();
                    scanner.nextLine();

                    manager.searchBook(searchbookName);
                    break;
                case 12:
                    System.out.print("Enter Student Name: ");
                    Scanner scanner3 = new Scanner(System.in);
                    String SearchstdName = scanner3.nextLine();
                    scanner.nextLine();

                    manager.searchstudent(SearchstdName);
                    break;
                case 13: System.out.println("Exit");
                default:System.out.println("\"Invalid choice! Please try again.");
            }
        } while (choice != 13);
    }
}
