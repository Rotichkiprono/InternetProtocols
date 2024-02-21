import java.net.InetAddress;

public class LocalIP {
   public static void main(String[] args)
   throws Exception {
      InetAddress addr = InetAddress.getLocalHost(); //creates an object rep the machines ip-adress and the method retrieves it
      System.out.println("Local HostAddress: "+addr.getHostAddress());
      String hostname = addr.getHostName(); //gets the machine's host name
      System.out.println("Local host name: "+hostname );
   }
}