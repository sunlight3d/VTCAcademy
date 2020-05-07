package app;

public class App {
    public static void main(String[] args) throws Exception {
        NetworkInfo networkInfo = new NetworkInfo();
        networkInfo.getHostAddress("www.google.com");
        System.out.println("Haha");
    }
}