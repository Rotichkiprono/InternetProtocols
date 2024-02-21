import java.net.InetAddress;
//works with ip adress
import java.net.UnknownHostException;
//handles exeptions when hostname resolution fails

public class HostName {
   //defines the class
   public static void main(String[] args) {
      InetAddress address = null;
      //declares a variable and initializes it as null
      try {
            //tries to get the ip address of the domain name
         address = InetAddress.getByName("www.daystar.ac.ke");
         //System.in.println("Enter the DOMAIN NAME");
              }
	  catch (UnknownHostException e) {
         System.exit(2);
      }
      System.out.println("The organization IP addresss detected for - "+address.getHostName() + "  DOMAIN IS " + address.getHostAddress());
      System.exit(0);
      //exits the program code
   }
}