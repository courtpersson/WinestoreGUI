//Provides user interface & methods to handle events 
//View/Controller class - methods for -
//layout, listening for events, and processing sales/returns 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Screen layout
public class LWMGUI extends JFrame implements ActionListener

{	
	
	
	private static String ClientName;
	private static double AccountStart;
	
	public LWMGUI(String ca, double Initial_Account)
	{
		ClientName = ca;
		AccountStart =  Initial_Account;
	
	}
		
		//components 
		private JPanel top, middle, bottom; 
			private JTextField textname, textprice, textquantity, 
			textpurchase, texttransaction, textbalance; 
			private JButton button, button2;
			
			
		public LWMGUI()
		{
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//need to create a constructor and pass the object here
			setTitle("Lilybank Wine Merchants: " + ClientName);
			setSize(700,200);
			setLocation(100,100);
			layoutComponents();
		}
		
		//frame layout
		private void layoutComponents()
		{
			//top panel 
			top = new JPanel(); 
			top.setBackground(Color.gray);
			JLabel NameLabel = new JLabel("Wine Name: ");
			top.add(NameLabel);
			textname = new JTextField(15);
				top.add(textname);
			
			JLabel QuantityLabel = new JLabel("Quantity:  ");
			top.add(QuantityLabel);
			textquantity = new JTextField(10);
				top.add(textquantity);
			
			JLabel PriceLabel = new JLabel("Price: £ ");
			top.add(PriceLabel);
			textprice = new JTextField(10);
				top.add(textprice);
				
				add(top,BorderLayout.NORTH);
			
			//middle panel 
			middle = new JPanel();
			middle.setBackground(Color.darkGray);
			button = new JButton("Process Sale");
			button2 = new JButton("Process Return"); 
			middle.add(button);
			middle.add(button2); 
			
			//button event sale or return 
			button.addActionListener(this);
			button2.addActionListener(this);
			
			
			this.setVisible(true); 
			
			add(middle, BorderLayout.CENTER);
			
			//bottom panel
			bottom = new JPanel();
			bottom.setBackground(Color.gray);
			JLabel WinePurchasedLabel =  new JLabel("Wine Purchased: " );
			bottom.add(WinePurchasedLabel); 
			textpurchase = new JTextField(10);
				bottom.add(textpurchase);
			
			JLabel TransactionLabel = new JLabel("Total Transaction: ");
			bottom.add(TransactionLabel);
			texttransaction = new JTextField(10); 
				bottom.add(texttransaction);
			
			JLabel BalanceLabel = new JLabel("Current Balance: ");
			bottom.add(BalanceLabel);
			textbalance = new JTextField(10);
				bottom.add(textbalance);
			
			add(bottom, BorderLayout.SOUTH);
		}	
		
	
	//Implement ActionListener - when clicked 
	public void actionPerformed(ActionEvent e) { 
	//sale processed
		if(e.getSource() == button) {
				String wn = textname.getText();
				double wp = Double.parseDouble(textprice.getText()); 
				int wq =Integer.parseInt(textquantity.getText());
				Wine nw = new Wine(wn, wp, wq); 
				
			System.out.println("Sale Processed");
		}
		else
			System.out.println("Return Processed");
		
	}

	public static double getAccountStart() {
		return AccountStart;
	}

	public static void setAccountStart(double accountStart) {
		AccountStart = accountStart;
	}
}
