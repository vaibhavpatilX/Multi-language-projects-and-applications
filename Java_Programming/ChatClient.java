import java.net.*;
import java.io.*;

class ChatClient
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client is ready to connect with the server");
        
        Socket sobj = new Socket("localhost",5100);
        System.out.println("Marvellous client is successfully connected with Server..!");


        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        String str = bobj1.readLine();
        System.out.println("Message from Server: "+str);

        pobj.println("Hii message from Client");
    }
}