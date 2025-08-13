import javax.swing.*;
import java.awt.event.*;

class GUI4
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("Marvellous Infosystems..!");
        JButton jobj = new JButton("Submit ?");

        jobj.setBounds(100,100,150,50);
        jobj.addActionListener(new ActionListener()

        {
            public void actionPerformed(ActionEvent aobj)
            {
                JOptionPane.showMessageDialog(fobj,"Button clicked");
            }
        });

        fobj.add(jobj);
        
        fobj.setSize(400,300);
        fobj.setLayout(null);
        fobj.setVisible(true);

        
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}