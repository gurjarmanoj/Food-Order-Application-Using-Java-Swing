import javax.swing.*;
import java.awt.event.*;

public class FoodOrder extends JFrame implements ActionListener{
	JCheckBox cb1, cb2, cb3;
	JButton b;
	public FoodOrder(){
		JMenu menu;
		JMenuItem j1, j2;
		JMenuBar md = new JMenuBar();
		menu = new JMenu("Items");
		j1 = new JMenuItem("Pizza");
		j2 = new JMenuItem("Burger");

		menu.add(j1); menu.add(j2);
		JLabel l = new JLabel("Food Ordering System");
		l.setBounds(50,50,300,20);
		cb1 = new JCheckBox("Pizza @ 100");
		cb1.setBounds(100,100,150,20);

		cb2 = new JCheckBox("Burger @ 30");
		cb2.setBounds(100,150,150,20);

		cb3 = new JCheckBox("Pasta @ 50");
		cb3.setBounds(100, 200, 150, 20);

		b = new JButton("Order Now");
		b.setBounds(100, 250, 150, 20);

		b.addActionListener(this);
		md.add(menu);
		setJMenuBar(md);

		add(l); add(cb1); add(cb2); add(cb3); add(b);
		setSize(800, 800);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		float amount = 0;
		String msg = "";
		if(cb1.isSelected()){
			amount = amount + 100;
			msg += "Pizza: 100 Rs \n";
		}
		if(cb2.isSelected()){
			amount = amount + 30;
			msg += "Burger: 30 Rs \n";
		}
		if(cb3.isSelected()){
			amount = amount + 50;
			msg += "Pasta: 50 Rs \n";
		}

		msg += "--------------\n";
		JOptionPane.showMessageDialog(this,msg+"Total: "+amount);
	}
	public static void main(String[] args) {
		new FoodOrder();
	}
}