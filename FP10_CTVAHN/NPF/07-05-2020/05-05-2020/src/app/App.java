package app;

public class App {
    public static void main(String[] args) throws Exception {
        NetworkInfo networkInfo = new NetworkInfo();
        //networkInfo.getHostAddress("www.google.com");
        networkInfo.getDataFromUrl();
        System.out.println("Haha");
    }
}