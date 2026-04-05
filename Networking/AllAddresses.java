import java.net.InetAddress;

public class AllAddresses {
    public static void main(String[] args) throws Exception {

        // Google has many servers — get all their IPs
        InetAddress[] addresses = InetAddress.getAllByName("google.com");

        System.out.println("Total IPs for google.com: " + addresses.length);
        System.out.println();

        for (InetAddress addr : addresses) {
            System.out.println("  " + addr.getHostAddress());
        }
    }
}