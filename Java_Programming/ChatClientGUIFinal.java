import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

class ClientGUI extends JFrame implements ActionListener 
{
    JTextArea chatArea;
    JTextField inputField;
    JTextField receivedField;
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
                    receivedField.setText(message); // show in text field
                }
                chatArea.append("Connection closed.\n");
            } catch (Exception e) {
                throw new RuntimeException(e); // pass as unchecked
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

public class ChatClientGUIFinal 
{
    public static void main(String[] args) throws Exception 
    {
        new ClientGUI("Marvellous Chat Client", 500, 400);
    }
}
