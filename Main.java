public class Main {
    public static void main(String[] args){
        Server serv = Server.getInstance();
        System.out.println(serv);

        User u = new User(new Guest());
        u.checkMsg();
        u.getInfo();
        u.authorization();
        u.getInfo();
        u.checkMsg();

    }
}
