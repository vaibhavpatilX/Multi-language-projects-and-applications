import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

class ServerGUI extends JFrame implements ActionListener 
{
    JTextArea chatArea;
    JTextField inputField;
    JButton sendButton;

    ServerSocket serverSocket;
    Socket socket;
    BufferedReader reader;
    PrintWriter writer;

    public ServerGUI(String Title, int Width, int Height) throws Exception
    {
        setTitle(Title);
        setSize(Width , Height);
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

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startServer(); 
    }

    public void startServer() throws Exception
    {
        serverSocket = new ServerSocket(5100);
        chatArea.append("Waiting for client to connect...\n");

        socket = serverSocket.accept(); // blocking call
        chatArea.append("Client connected!\n");

        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(socket.getOutputStream(), true);

        Thread readerThread = new Thread(() -> {
            try {
                String message;
                while ((message = reader.readLine()) != null) {
                    if (message.equalsIgnoreCase("end")) break;
                    chatArea.append("Client: " + message + "\n");
                }
                chatArea.append("Connection lost.\n");
            } catch (Exception e) {
                chatArea.append("Error: " + e.getMessage() + "\n");
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
            chatArea.append("Server: " + message + "\n");
            writer.println(message);
            inputField.setText("");
        }
    }
}

public class ChatServerGUI 
{
    public static void main(String A[]) throws Exception 
    {
        new ServerGUI("Marvellous Chat Server", 400, 400);
    }
}
