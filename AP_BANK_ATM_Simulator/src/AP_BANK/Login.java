package AP_BANK;


import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
	Login()
	{
		super("AP Bank Management System");
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);
        
        
		setLayout(null);
        setSize(850,480);
        setLocation(320,150);
//        setUndecorated(true);
        setVisible(true);
	}
	
	public static void main(String[] args) {
		new Login();
	}
}
