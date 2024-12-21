public class Server {
    private static Server instance;

    public static Server getInstance(){
        if (instance == null) instance = new Server();

        return instance;
    }
}
