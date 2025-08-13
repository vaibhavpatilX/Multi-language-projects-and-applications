import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

class ClientGUI extends JFrame implements ActionListener 
{
    JTextArea chatArea;
    JTextField inputField;
    JButton sendButton;

    Socket socket;
    BufferedReader reader;
    PrintWriter writer;

    public ClientGUI(String Title, int Width, int Height) throws Exception 
    {
        setTitle(Title);
        setSize(Width, Height);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        sendButton = new JButton("Send");
        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);

        add(bottomPanel, BorderLayout.SOUTH);

        sendButton.addActionListener(this);
        inputField.addActionListener(this); 

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        connectToServer(); 
    }

    public void connectToServer() throws Exception 
    {
        socket = new Socket("localhost", 5100);
        chatArea.append("Connected to server!\n");

        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(socket.getOutputStream(), true);

        Thread readerThread = new Thread(() -> {
            try {
                String message;
                while ((message = reader.readLine()) != null) {
                    if (message.equalsIgnoreCase("end")) break;
                    chatArea.append("Server: " + message + "\n");
                }
                chatArea.append("Connection closed.\n");
            } catch (Exception e) {
                chatArea.append("Connection error: " + e.getMessage() + "\n");
            }
        });
        readerThread.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String message = inputField.getText().trim();
        if (!message.isEmpty()) 
        {
            chatArea.append("Client: " + message + "\n");
            writer.println(message);
            inputField.setText("");
        }
    }
}

public class ChatClientGUI 
{
    public static void main(String[] args) throws Exception 
    {
        new ClientGUI("Marvellous Chat Client", 400, 400);
    }
}
