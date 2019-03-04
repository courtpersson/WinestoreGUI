
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AsEx1
{

	//variables
	private static String clientAccount, InitialAccount; 
	private static boolean isValid = true; 
	private static int test1 = -1 ;
	private static double Initial_Account;
	
	
	public AsEx1(String ca, boolean iv, double ia, int test)
	{
		//constructor name, initial value 
	clientAccount = ca;
	Initial_Account = ia;
	isValid = iv;
	test1 = test;
	}
	public String clientAccount()
	{
		return clientAccount;
	}
	
	public double getInitial_Account()
	{
		return Initial_Account;
	}
		
	public static void main(String[] args)
	{
		
		//JOptionPane 
		clientAccount = JOptionPane.showInputDialog(null, "Enter Customer Name: ", "Lillybank Wine Merchants", JOptionPane.PLAIN_MESSAGE);
		if (clientAccount == null || clientAccount.isEmpty()); 
		if(clientAccount instanceof String);
		
		if (isValid = false) {
		JOptionPane.showMessageDialog(null, "You did not enter a name");
		System.exit(0);
		}
	
		
		while(test1 > 0); 
		{
		try {
			InitialAccount = JOptionPane.showInputDialog(null, "Enter Client Account Balance: ", "Lillybank Wine Merchants", JOptionPane.PLAIN_MESSAGE);
			Initial_Account = Double.parseDouble(InitialAccount);

		}
		catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(
					null, "You did not enter a number","Error", JOptionPane.ERROR_MESSAGE);
			InitialAccount = JOptionPane.showInputDialog(null, "Enter Client Account Balance: ");
			Initial_Account = Double.parseDouble(InitialAccount);
			test1++; 
		}
	
		JFrame frame = new LWMGUI();
		LWMGUI e = new LWMGUI();
		e.setVisible(true);
		frame.setTitle("Lilybank Wine Merchant: " + clientAccount);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
		
}
	}
}




