package com.JavaSE.Java7.Serialization.Socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
     private Socket socket;
	public static void main(String args []) throws UnknownHostException, IOException, ClassNotFoundException {
    	 new client().clientrun();
     }
     public void clientrun() throws UnknownHostException, IOException, ClassNotFoundException {
    	   socket = new Socket("127.0.0.1" , 3221);
    	   ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
           ObjectInputStream inputstream = new ObjectInputStream(socket.getInputStream());
           packet packets = new packet("HI");
           outputStream.writeObject(packets);
           packet recieve = (packet)inputstream.readObject();
           System.out.println("recieved in client "  + recieve.message);
           socket.close();
           outputStream.close();
           inputstream.close();
     }
}