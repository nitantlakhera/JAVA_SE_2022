package com.JavaSE.Java7.Serialization.Socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static final int port=3221;
	private ServerSocket serversocket;
    public static void main(String args []) throws IOException, ClassNotFoundException {
    	new server().serverSocket();
    }
    public void serverSocket() throws IOException, ClassNotFoundException {
    	serversocket = new ServerSocket(port);
    	System.out.println("Server is up and running in port " + port);
        Socket socket = serversocket.accept();
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inputstream = new ObjectInputStream(socket.getInputStream());
        packet recievePacket = (packet)inputstream.readObject();
        System.out.println("message " +recievePacket.message);
        if(recievePacket.message == "hello") {
        	packet returnPacket = new packet("Hi message from server");
        	outputStream.writeObject(returnPacket);
        }
        serversocket.close();
        inputstream.close();
        outputStream.close();
    }
}
