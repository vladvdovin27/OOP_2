public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+78777777777", "iPhone 13", 0.15);
        Phone phone3 = new Phone("+79118671811", "iPhone 15ProMax",1.0);

        phone1.infoPhone(phone1);
        phone2.infoPhone(phone2);
        phone3.infoPhone(phone3);

        phone1.receiveCall("Петя");
        System.out.println("Номер phone1: " + phone1.getNumber());
        phone2.receiveCall("Вася");
        System.out.println("Номер phone2: " + phone2.getNumber());
        phone3.receiveCall("Ваня");
        System.out.println("Номер phone3: " + phone3.getNumber());

        phone1.receiveCall("Коля", "+79474846474");

        phone1.sendMessage("+79461212121", "+79666666666");

        Reader[] readers = new Reader[]{
                new Reader("Петров В. В.", "12345", "ФМИИТ", "2005-05-05", "+79123456789"),
                new Reader("Иванова А. А.", "67890", "ФМИИТ", "2005-11-11", "+79111234567")
        };
        readers[0].takeBook(3);
        readers[0].takeBook("Война и мир", "Капитанская дочка", "Евгений Онегин");
        readers[0].takeBook(new Book("Война и мир", "Л.Н.Толстой"), new Book("Капитанская дочка", "А.С. Пушкин"), new Book("Энциклопедия", "А.С. Пушкин"));
    }
}