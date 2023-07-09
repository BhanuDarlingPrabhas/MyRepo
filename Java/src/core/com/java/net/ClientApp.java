package core.com.java.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket s = new Socket("172.20.10.10", 314);//Logical connection b/w client and server
		System.out.println("Waiting for server to accept request");
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		Scanner sc = new Scanner(System.in);
		
		String str1 ="" , str2 = "";
		while( !str1.equalsIgnoreCase("exit")) {
			System.out.println("Enter message to send to server");
			str1 = sc.nextLine();
			dos.writeUTF(str1);
			dos.flush();
			str2 = dis.readUTF();	
			System.out.println("Message from Server :"+str2);
			}
		s.close();
		sc.close();
		}

}
