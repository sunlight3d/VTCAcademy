package app;

import java.net.InetAddress;

public class NetworkInfo {
    public String getHostAddress(String url) {
        String result = "";
        try {
            String localhostIp = InetAddress.getLocalHost().getHostAddress();
            String hostname = InetAddress.getByName(url).getHostName();
            System.out.println("ssss");
        }catch(Exception e) {
            //e.printStackTrace();
            System.err.println(e.toString());
        } finally {

        }      
        return result;
    }
}