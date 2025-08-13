import java.net.*;
import java.io.*;

class ChatServerFinal throws Exception
{
    public static void main(String A[])
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Marvellous Server is waiting at port number 5100");
        Socket sobj = ssobj.accept();
        System.out.println("Marvellous Server successfully connected with Client..");


        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        FileWriter fwobj = new FileWriter("ChatMessanger.txt");
        fwobj.write("----------------------Marvellous Chat Application"+System.getProperty( "line.separator"));
        
        BufferedWriter brobj = new BufferedWriter(fwobj);
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("Marvellous Chat Messaanger is Ready to use..");
        System.out.println("----------------------------------------------------------------");

        String str1 = null, str2 = null;

        while((str1 = bobj1.readLine()) != null)
        {
            System.out.println("Client says : "+str1);
            brobj.write("Client says: "+str1);
            brobj.newLine();
            
            System.out.println("Enter the message for Client..");
            str2 = bobj2.readLine();
            pobj.println(str2);
            
            brobj.write("Server says: "+str2);
            brobj.newLine();
            
        }

        
        brobj.close();
        sobj.close();
        ssobj.close();
    }
}