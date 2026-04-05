import java.net.InetAddress;

public class BasicLookup {
    public static void main(String[] args) throws Exception {

        // Ask DNS: what is the IP address of google.com?
        InetAddress address = InetAddress.getByName("google.com");

        System.out.println("Host Name : " + address.getHostName());
        System.out.println("IP Address: " + address.getHostAddress());

        // toString() shows both together
        System.out.println("Full      : " + address.toString());
    }
}