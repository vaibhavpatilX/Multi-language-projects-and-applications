import java.net.*;
import java.io.*;

class ChatClientFinal throws Exception
{
    public static void main(String A[]) 
        System.out.println("Client is ready to connect with the server");
        
        Socket sobj = new Socket("localhost",5100);
        System.out.println("Marvellous client is successfully connected with Server..!");


        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        FileWriter fwobj = new FileWriter("ChatMessanger.txt");
        fwobj.write("---------------------- Marvellous Chat Application ----------------------"+System.getProperty( "line.separator"));

        BufferedWriter brobj = new BufferedWriter(fwobj);

        System.out.println("----------------------------------------------------------------");
        System.out.println("Marvellous Chat Messaanger is Ready to use..");
        System.out.println("----------------------------------------------------------------");

        String str1 = null, str2 = null;

        while(!(str1 = bobj2.readLine()).equals("end"))
        {
            pobj.println(str1);
            brobj.write("Client says: "+str1);
            brobj.newLine();

            str2 = bobj1.readLine();
            System.out.println("Server says : "+str2);
            
           
            brobj.write("Server says: "+str2);
            brobj.newLine();
            
            System.out.println("Enter message for server: ");
        }
        
        pobj.println("end");  
        brobj.close();
        sobj.close();
    }
}