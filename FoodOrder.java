import javax.swing.*;
import java.awt.event.*;

public class FoodOrder extends JFrame implements ActionListener{
	JCheckBox cb1, cb2, cb3, cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15;
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
		
		cb4 = new JCheckBox("Bread @ 20");
		cb4.setBounds(100, 250, 150, 20);

		cb5 = new JCheckBox("Garlic Bread @ 30");
		cb5.setBounds(100, 250, 150, 20);

		cb6 = new JCheckBox("French fries @ 20");
		cb6.setBounds(100, 250, 150, 20);

		cb7 = new JCheckBox("Onion Rings @ 20");
		cb7.setBounds(100, 250, 150, 20);

		cb8 = new JCheckBox("Ceaser Salad @ 40");
		cb8.setBounds(100, 250, 150, 20);

		cb9 = new JCheckBox("Tacos @ 60");
		cb9.setBounds(100, 250, 150, 20);

		cb10= new JCheckBox("Macaroni and cheese @ 50");
		cb10.setBounds(100, 250, 150, 20);

		cb11= new JCheckBox("Sandwich @ 35");
		cb11.setBounds(100, 250, 150, 20);

		cb12= new JCheckBox("Cold coffee @ 30");
		cb12.setBounds(100, 250, 150, 20);

		cb13= new JCheckBox("Coke @ 20");
		cb13.setBounds(100, 250, 150, 20);

		cb14= new JCheckBox("Diet Coke @ 25");
		cb14.setBounds(100, 250, 150, 20);

		cb15= new JCheckBox("Fruit  soda @ 15");
		cb15.setBounds(100, 250, 150, 20);

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
		if(cb4.isSelected()){
			amount = amount + 20;
			msg += "Bread: 20 Rs \n";
		}
		if(cb5.isSelected()){
			amount = amount + 30;
			msg += "Garlic Bread: 30 Rs \n";
		}
		if(cb6.isSelected()){
			amount = amount + 20;
			msg += "French Fries: 20 Rs \n";
		}
		if(cb7.isSelected()){
			amount = amount + 20;
			msg += "Onion Rings: 20 Rs \n";
		}
		if(cb8.isSelected()){
			amount = amount + 40;
			msg += "Ceaser Salad: 40 Rs \n";
		}
		if(cb9.isSelected()){
			amount = amount + 60;
			msg += "Tacos: 60 Rs \n";
		}
		if(cb10.isSelected()){
			amount = amount + 50;
			msg += "Macaroni and cheese: 50 Rs \n";
		}
		if(cb11.isSelected()){
			amount = amount + 35;
			msg += "Sandwich: 35 Rs \n";
		}
		if(cb12.isSelected()){
			amount = amount + 30;
			msg += "Cold coffee: 30 Rs \n";
		}
		if(cb13.isSelected()){
			amount = amount + 20;
			msg += "Coke: 20 Rs \n";
		}
		if(cb14.isSelected()){
			amount = amount + 25;
			msg += "Diet coke: 25 Rs \n";
		}
		if(cb15.isSelected()){
			amount = amount + ;
			msg += "Fruit soda: 15 Rs \n";
		}

		msg += "--------------\n";
		JOptionPane.showMessageDialog(this,msg+"Total: "+amount);
	}
	public static void main(String[] args) {
		new FoodOrder();
	}
}
