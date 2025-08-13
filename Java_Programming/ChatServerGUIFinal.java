import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

class ServerGUI extends JFrame implements ActionListener 
{
    JTextArea chatArea;
    JTextField inputField;
    JTextField receivedField;
    JButton sendButton;

    ServerSocket serverSocket;
    Socket socket;
    BufferedReader reader;
    PrintWriter writer;

    public ServerGUI(String title, int width, int height) throws Exception 
    {
        setTitle(title);
        setSize(width, height);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new GridLayout(2, 1));

        JPanel sendPanel = new JPanel(new BorderLayout());
        JLabel sendLabel = new JLabel("Enter Message: ");
        inputField = new JTextField();
        sendButton = new JButton("Send");
        sendPanel.add(sendLabel, BorderLayout.WEST);
        sendPanel.add(inputField, BorderLayout.CENTER);
        sendPanel.add(sendButton, BorderLayout.EAST);

        JPanel receivePanel = new JPanel(new BorderLayout());
        JLabel receiveLabel = new JLabel("Received Message: ");
        receivedField = new JTextField();
        receivedField.setEditable(false);
        receivePanel.add(receiveLabel, BorderLayout.WEST);
        receivePanel.add(receivedField, BorderLayout.CENTER);

        bottomPanel.add(sendPanel);
        bottomPanel.add(receivePanel);
        add(bottomPanel, BorderLayout.SOUTH);

        sendButton.addActionListener(this);
        inputField.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startServer(); 
    }

    public void startServer() throws Exception 
    {
        serverSocket = new ServerSocket(5100);
        chatArea.append("Waiting for client to connect...\n");

        socket = serverSocket.accept(); // blocking
        chatArea.append("Client connected!\n");

        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(socket.getOutputStream(), true);

        Thread readerThread = new Thread(() -> {
            try {
                String message;
                while ((message = reader.readLine()) != null) {
                    if (message.equalsIgnoreCase("end")) break;
                    chatArea.append("Client: " + message + "\n");
                    receivedField.setText(message);
                }
                chatArea.append("Connection closed.\n");
            } catch (IOException ex) {
                throw new RuntimeException(ex); 
            }
        });
        readerThread.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String message = inputField.getText().trim();
        if (!message.isEmpty()) {
            chatArea.append("Server: " + message + "\n");
            writer.println(message);
            inputField.setText("");
        }
    }
}

public class ChatServerGUIFinal
{
    public static void main(String[] args) throws Exception 
    {
        new ServerGUI("Marvellous Chat Server", 500, 400);
    }
}
