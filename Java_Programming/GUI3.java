import javax.swing.*;

class GUI3
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("Marvellous Infosystems..!");
        JButton jobj = new JButton("Submit ?");

        jobj.setBounds(100,100,150,50);

        fobj.add(jobj);
        
        fobj.setSize(400,300);
        fobj.setLayout(null);
        fobj.setVisible(true);

        
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}