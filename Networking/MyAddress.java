import java.net.InetAddress;

public class MyAddress {
    public static void main(String[] args) throws Exception {

        InetAddress myMachine = InetAddress.getLocalHost();

        System.out.println("My Computer Name: " + myMachine.getHostName());
        System.out.println("My IP Address   : " + myMachine.getHostAddress());

        // Special address — 127.0.0.1 means "this machine itself"
        // Called loopback address
        InetAddress loopback = InetAddress.getByName("localhost");
        System.out.println("Loopback        : " + loopback.getHostAddress());
    }
} 
    

