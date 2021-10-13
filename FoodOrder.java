import javax.swing.*;
import java.awt.event.*;

public class FoodOrder extends JFrame implements ActionListener{
	JCheckBox cb1, cb2, cb3, cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,cb26,cb27,cb28,cb29,cb30,cb31,cb32,cb33,cb34,cb35;
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
		
		cb5 = new JCheckBox("Panner Tika @ 100);
		cb5.setBounds(100, 300, 150, 20);
				    
		cb6 = new JCheckBox("Chur Chur Naan @ 200);
		cb6.setBounds(100, 350, 150, 20);	    

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

		cb12= new JCheckBox("Veg cheese sandwich @ 40");
		cb12.setBounds(100, 250, 150, 20);

		cb13= new JCheckBox("Club Grilled sandwich @ 40");
		cb13.setBounds(100, 250, 150, 20);

		cb14= new JCheckBox("Mexican Salsa Sandwich @ 50");
		cb14.setBounds(100, 250, 150, 20);

		cb15= new JCheckBox("Chipotle Burger @ 50");
		cb15.setBounds(100, 250, 150, 20);

		cb16= new JCheckBox("Veg Masala Maggi @ 40");
		cb16.setBounds(100, 250, 150, 20);

		cb17= new JCheckBox("Cheese Maggi @ 45");
		cb17.setBounds(100, 250, 150, 20);

		cb18= new JCheckBox("Paprika Sauce Pasta @ 50");
		cb18.setBounds(100, 250, 150, 20);

		cb19= new JCheckBox("White Sauce Pasta @ 50");
		cb19.setBounds(100, 250, 150, 20);

		cb20= new JCheckBox("American Burger @ 60");
		cb20.setBounds(100, 250, 150, 20);

		cb21= new JCheckBox("Crispy Veg Burger @ 60");
		cb21.setBounds(100, 250, 150, 20);

		cb22= new JCheckBox("Loaded Cheese Burger @ 70");
		cb22.setBounds(100, 250, 150, 20);

		cb23= new JCheckBox("The Meathead Burger @ 70");
		cb23.setBounds(100, 250, 150, 20);

		cb24= new JCheckBox("Chilli Cheese Fries @ 50");
		cb24.setBounds(100, 250, 150, 20);

		cb25= new JCheckBox("Sizzler Brownie @ 100");
		cb25.setBounds(100, 250, 150, 20);

		cb26= new JCheckBox("Classic Cheesecake @ 70");
		cb26.setBounds(100, 250, 150, 20);

		cb27= new JCheckBox("Strawberry Cheesecake @ 70");
		cb27.setBounds(100, 250, 150, 20);

		cb28= new JCheckBox("Cupcake Platter @ 100");
		cb28.setBounds(100, 250, 150, 20);

		cb29= new JCheckBox("Vanilla Float @ 49");
		cb29.setBounds(100, 250, 150, 20);
		
		cb30= new JCheckBox("Chocolate Float @ 49");
		cb30.setBounds(100, 250, 150, 20);

		cb31= new JCheckBox("Mixed Fruit Float @ 60");
		cb31.setBounds(100, 250, 150, 20);

		cb32= new JCheckBox("Hot Chocolate @ 40");
		cb32.setBounds(100, 250, 150, 20);

		cb33= new JCheckBox("Vanilla Latte @ 50");
		cb33.setBounds(100, 250, 150, 20);

		cb34= new JCheckBox("Caramel Latte @ 50");
		cb34.setBounds(100, 250, 150, 20);

		cb35= new JCheckBox("Cold Coffee @ 40");
		cb35.setBounds(100, 250, 150, 20);

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
			amount = amount + 100;
			msg += "Paneer Teeka: 100 Rs \n";
		}
		if(cb6.isSelected()){
			amount = amount + 200;
			msg += "Chur Chur Naan: 200 Rs \n";
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
			amount = amount + 40;
			msg += "Veg cheese sandwich: 40 Rs \n";
		}
		if(cb13.isSelected()){
			amount = amount + 40;
			msg += "Club Grilled Sandwich: 40 Rs \n";
		}
		if(cb14.isSelected()){
			amount = amount + 50;
			msg += "Mexican Salsa Sandwich: 50 Rs \n";
		}
		if(cb15.isSelected()){
			amount = amount + 50;
			msg += "Chipotle Burger: 50 Rs \n";
		}
		if(cb16.isSelected()){
			amount = amount + 40;
			msg += "Veg Masala Maggi: 40 Rs \n";
		}
		if(cb17.isSelected()){
			amount = amount + 45;
			msg += "Cheese Maggi: 45 Rs \n";
		}
		if(cb18.isSelected()){
			amount = amount + 50;
			msg += "Paprika Sauce Pasta : 50 Rs \n";
		}
		if(cb19.isSelected()){
			amount = amount + 50;
			msg += "White Sauce Pasta: 50 Rs \n";
		}
		if(cb20.isSelected()){
			amount = amount + 60;
			msg += "American Cheese Burger: 60 Rs \n";
		}
		if(cb21.isSelected()){
			amount = amount + 60;
			msg += "Crispy Veg Burger: 60 Rs \n";
		}
		if(cb22.isSelected()){
			amount = amount + 70;
			msg += "Loaded Cheese Burger: 70 Rs \n";
		}
		if(cb23.isSelected()){
			amount = amount + 70;
			msg += "The Meathead Burger: 70 Rs \n";
		}
		if(cb24.isSelected()){
			amount = amount + 50;
			msg += "Chilli Cheese Fries: 50 Rs \n";
		}
		if(cb25.isSelected()){
			amount = amount + 100;
			msg += "Sizzler Brownie: 100 Rs \n";
		}
		if(cb26.isSelected()){
			amount = amount + 70;
			msg += "Classic Cheesecake: 70 Rs \n";
		}
		if(cb27.isSelected()){
			amount = amount + 70;
			msg += "Strawberry Cheesecake: 70 Rs \n";
		}
		if(cb28.isSelected()){
			amount = amount + 100;
			msg += "Cupcake Platter: 100 Rs \n";
		}if(cb29.isSelected()){
			amount = amount + 49;
			msg += "Vanilla Float: 49 Rs \n";
		}
		if(cb30.isSelected()){
			amount = amount + 49;
			msg += "Chocolate Float: 49 Rs \n";
		}
		if(cb31.isSelected()){
			amount = amount + 60;
			msg += "Mixed Fruit Float: 60 Rs \n";
		}
		if(cb32.isSelected()){
			amount = amount + 40;
			msg += "Hot Chocolate: 40 Rs \n";
		}
		if(cb33.isSelected()){
			amount = amount + 50;
			msg += "Vanilla Latte: 50 Rs \n";
		}
		if(cb34.isSelected()){
			amount = amount + 50;
			msg += "Caramel Latte: 50 Rs \n";
		}
		if(cb35.isSelected()){
			amount = amount + 40;
			msg += "Cold Coffee: 40 Rs \n";
		}

		msg += "--------------\n";
		JOptionPane.showMessageDialog(this,msg+"Total: "+amount);
	}
	public static void main(String[] args) {
		new FoodOrder();
	}
}
