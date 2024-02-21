import java.net.InetAddress;
//allows working with the ip adress

public class TranslateIP {
  //defining the class
  public static void main(String[] argv) throws Exception {
//defines the entry point of the program
    InetAddress addr = InetAddress.getByName("74.125.67.100");
    //creates an object by providing an ip address and uses a method to get the hostname
    System.out.println("Host name is: "+addr.getHostName());
    //prints the translated hostname of the given ip adress
    System.out.println("Ip address is: "+ addr.getHostAddress());
    //prints the ip address retrieved
  }
}