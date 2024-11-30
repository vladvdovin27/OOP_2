public class Reader {
    private String name;
    private String readerId;
    private String faculty;
    private String birthday;
    private Phone phone;

    public Reader(String name, String readerId, String faculty, String birthday,String number) {
        this.name = name;
        this.readerId = readerId;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = new Phone(number);
    }
    public void takeBook() {
    }

    public void takeBook(int counter) {
        System.out.println(name + " взял " + counter + " книг");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(name + "взял книги: ");
        for (String book : bookTitles) {
            System.out.print(book + ", ");
        }
    }

    public void takeBook(Book... bookTitles) {
        System.out.print(name + "взял книги: ");
        for(Book book : bookTitles) {
            System.out.print(book.getName() + ", ");
        }
    }

    public void returnBook () {
    }

    public void returnBook (String...bookTitles){
        System.out.print(name + "вернул книги: ");
        for (String book : bookTitles) {
            System.out.print(book + ", ");
        }
    }

    public void returnBook (Book...bookTitles){
        System.out.print(name + "вернул книги: ");
        for (Book book : bookTitles) {
            System.out.print(book.getName() + ", ");
        }


    }

}