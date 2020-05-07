package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class NetworkInfo {
    public String getHostAddress(String url) {
        String result = "";
        try {
            String localhostIp = InetAddress.getLocalHost().getHostAddress();
            String hostname = InetAddress.getByName(url).getHostName();            
            InetAddress[] ips =  InetAddress.getAllByName(url);
            for(int i = 0; i < ips.length; i++) {
                System.out.println(ips[i].toString());
            }

            System.out.println("ssss");            
        }catch(Exception e) {
            //e.printStackTrace();
            System.err.println(e.toString());
        } finally {

        }      
        return result;
    }
    public static void getDataFromUrl() {
        try {
            URL url = new URL("https://dantri.com.vn");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = null;
            if (urlConnection instanceof HttpURLConnection) {
                connection = (HttpURLConnection) urlConnection;
            } else {
                System.out.println("Please enter an HTTP URL.");
                return;
            }
            BufferedReader in = new BufferedReader(new

            InputStreamReader(connection.getInputStream()));

            String urlString = "";
            String current;
            while ((current = in.readLine()) != null) {
                urlString += current;
            }
            System.out.println(urlString);
        }catch(Exception e) {

        }
    }
}