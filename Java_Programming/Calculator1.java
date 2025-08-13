import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener
{
    public JFrame fobj;
    public JButton bobj;
    public JTextField tobj;
    public JPasswordField pobj;
    public JLabel UserLabel, PassLabel, ResultLabel;

    public Calculator(String Title, int Width, int Height)
    {
        fobj = new JFrame();

        
        fobj.setTitle(Title);
        fobj.setSize(Width,Height);
        
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {
        
    }
}
class Calculator1
{
    public static void main(String A[])
    {      
        Calculator mobj = new Calculator("Calculator",400,300);
    }
}