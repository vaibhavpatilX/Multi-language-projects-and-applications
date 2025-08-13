import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class ServerGUI extends JFrame implements ActionListener 
{
    JTextPane chatPane;
    JTextField inputField;
    JButton sendButton;

    ServerSocket serverSocket;
    Socket socket;
    BufferedReader reader;
    PrintWriter writer;

    StyledDocument doc;
    Style styleLeft, styleRight, styleTime;

    public ServerGUI(String Title, int Width, int Height) throws Exception 
    {
        setTitle(Title);
        setSize(Width, Height);
        setLayout(new BorderLayout());

        chatPane = new JTextPane();
        chatPane.setEditable(false);
        doc = chatPane.getStyledDocument();

        styleLeft = doc.addStyle("Left", null);
        StyleConstants.setAlignment(styleLeft, StyleConstants.ALIGN_LEFT);
        StyleConstants.setFontSize(styleLeft, 14);
        StyleConstants.setLeftIndent(styleLeft, 10);
        StyleConstants.setSpaceBelow(styleLeft, 5);

        styleRight = doc.addStyle("Right", null);
        StyleConstants.setAlignment(styleRight, StyleConstants.ALIGN_RIGHT);
        StyleConstants.setFontSize(styleRight, 14);
        StyleConstants.setRightIndent(styleRight, 10);
        StyleConstants.setSpaceBelow(styleRight, 5);

        styleTime = doc.addStyle("Time", null);
        StyleConstants.setFontSize(styleTime, 10);
        StyleConstants.setItalic(styleTime, true);
        StyleConstants.setForeground(styleTime, Color.GRAY);

        JScrollPane scrollPane = new JScrollPane(chatPane);
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

        startServer();
    }

    public void startServer() throws Exception 
    {
        serverSocket = new ServerSocket(5100);
        appendMessage("Waiting for client to connect...", false);
        socket = serverSocket.accept();
        appendMessage("Client connected!", false);

        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(socket.getOutputStream(), true);

        Thread readerThread = new Thread(() -> {
            try {
                String message;
                while ((message = reader.readLine()) != null) {
                    if (message.equalsIgnoreCase("end")) break;
                    appendMessage("Client: " + message, false);
                }
                appendMessage("Connection closed.", false);
            } catch (Exception e) {
                throw new RuntimeException(e);
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
            appendMessage("You: " + message, true);
            writer.println(message);
            inputField.setText("");
        }
    }

    public void appendMessage(String message, boolean isRight) 
    {
        try {
            String time = new SimpleDateFormat("hh:mm a").format(new Date());
            Style style = isRight ? styleRight : styleLeft;

            doc.insertString(doc.getLength(), message + "\n", null);
            doc.setParagraphAttributes(doc.getLength() - message.length() - 1, message.length(), style, false);

            doc.insertString(doc.getLength(), time + "\n\n", styleTime);
            doc.setParagraphAttributes(doc.getLength() - time.length() - 2, time.length(), style, false);

            chatPane.setCaretPosition(doc.getLength());
        } catch (BadLocationException ex) {
            throw new RuntimeException(ex);
        }
    }
}

public class ChatServerWp 
{
    public static void main(String[] args) throws Exception 
    {
        new ServerGUI("WhatsApp Style Server", 500, 500);
    }
}
