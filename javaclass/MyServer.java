import java.io.*;  
//allows server to read and write data

import java.net.*;  
//enables the server to listen for connections and manage sockets

public class MyServer { 
    //defines a class myserver 
public static void main(String[] args){  
try{  
ServerSocket ss=new ServerSocket(6666);
// creates a server socket object binds server to specific port

Socket s=ss.accept();
//establishes connection   
DataInputStream dis=new DataInputStream(s.getInputStream());
//creates a data input stream to read client data  
String  str=(String)dis.readUTF(); 
// reads the string message 
System.out.println("message= "+str);
int num = dis.readInt();
//reads the number
System.out.println("number =" +num); 

ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
MyObject obj = (MyObject) ois.readObject();
// reads an object

BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
//creates an object and adds buffering which reduces number of disk reads
//allows more efficient data reading

FileOutputStream fos = new FileOutputStream("received_file.txt");
// ctrates an object that writes to the name file

byte[] buffer = new byte[1024];
// buffer temporarily holds portions of the data before writing
int bytesRead;
while ((bytesRead = bis.read(buffer)) > 0) {
  fos.write(buffer, 0, bytesRead);
}

fos.close();
bis.close();

ss.close();
//closes the connection  
}catch(Exception e){System.out.println(e);}  
}  
}