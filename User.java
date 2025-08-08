public class User {
    private String studentName;
    private int studentId;
    private String bookName;
    public User(int studentId,String studentName,String bookName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.bookName=bookName;
    }
    public int setUserId(int studentId) {
        this.studentId = studentId;
        return studentId;
    }
    public int getUserId() {
        return studentId;
    }
    public String setUsername(String studentName) {
        this.studentName = studentName;
        return studentName;
    }
    public String getUsername() {
        return studentName;
    }
    public String setBookName(String bookName) {
        this.bookName = bookName;
        return bookName;
    }
    public String getBookName() {
        return bookName;
    }
    public String toString() {
        return "User{" +
                "studentId= " + studentId  +
                ",studentName= " + studentName + '\'' +
                ".bookName "+ bookName +"\'" +
                '}';
    }

}
