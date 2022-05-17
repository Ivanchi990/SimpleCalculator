package calculadora;

import javax.swing.*;

import java.awt.*;

public class View
{
	protected JFrame window;
	
	protected JMenuBar bar;
	protected JMenu exit;
	protected JMenu theme;
	protected JMenuItem dark;
	protected JMenuItem light;
	
	protected JTextField num;
	
	protected JButton clear;
	protected JButton one;
	protected JButton two;
	protected JButton three;
	protected JButton four;
	protected JButton five;
	protected JButton six;
	protected JButton seven;
	protected JButton eight;
	protected JButton nine;
	protected JButton zero;
	protected JButton plus;
	protected JButton minus;
	protected JButton percent;
	protected JButton asterisk;
	protected JButton slash;
	protected JButton equals;
	protected JButton dec;
	protected JButton pow;
	protected JButton sr;
	
	protected JPanel panel1;
	protected JPanel panel2;
	
	protected Font font;
	
	protected Container cont;
	
	public View()
	{
		create();
		place();
	}
	
	
	public void create()
	{
		window = new JFrame("Calculator");
		cont = window.getContentPane();
		
		bar = new JMenuBar();
		exit = new JMenu("Exit");
		theme = new JMenu("Theme");
		dark = new JMenu("Dark");
		light = new JMenu("light");
		
		num = new JTextField();
		
		font= new Font("Dialog", Font.BOLD, 36);
		 
		num.setFont(font);
		
		clear = new JButton("C");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		plus = new JButton("+");
		minus = new JButton("-");
		percent = new JButton("%");
		asterisk = new JButton("*");
		slash = new JButton("/");
		equals = new JButton("=");
		dec = new JButton(".");
		pow = new JButton("^");
		sr = new JButton("√");

		panel1 = new JPanel();
		panel2 = new JPanel();
		
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
	}
	
	
	public void place()
	{
		window.setTitle("Simple-Calculator");
		window.setSize(250, 350);
		window.setResizable(true);
		
		bar.add(theme);
		bar.add(exit);
		theme.add(dark);
		theme.add(light);
		
		panel1.add(num);
		panel1.setLayout(new GridLayout(1, 1));
		
		panel2.setLayout(new GridLayout(5, 4));
		panel2.add(clear);
		panel2.add(percent);
		panel2.add(plus);
		panel2.add(minus);
		panel2.add(one);
		panel2.add(two);
		panel2.add(three);
		panel2.add(asterisk);
		panel2.add(four);
		panel2.add(five);
		panel2.add(six);
		panel2.add(slash);
		panel2.add(seven);
		panel2.add(eight);
		panel2.add(nine);
		panel2.add(pow);
		panel2.add(dec);
		panel2.add(zero);
		panel2.add(equals);
		panel2.add(sr);
		
		cont.add(bar, BorderLayout.NORTH);
		cont.add(panel1, BorderLayout.CENTER);
		cont.add(panel2, BorderLayout.SOUTH);
		
		window.setVisible(true);
	}
	
	
	public void event(Controler manager)
	{
		exit.addMenuListener(manager);
		dark.addItemListener(manager);
		light.addItemListener(manager);
		clear.addActionListener(manager);
		percent.addActionListener(manager);
		plus.addActionListener(manager);
		minus.addActionListener(manager);
		one.addActionListener(manager);
		two.addActionListener(manager);
		three.addActionListener(manager);
		asterisk.addActionListener(manager);
		four.addActionListener(manager);
		five.addActionListener(manager);
		six.addActionListener(manager);
		seven.addActionListener(manager);
		slash.addActionListener(manager);
		eight.addActionListener(manager);
		nine.addActionListener(manager);
		pow.addActionListener(manager);
		dec.addActionListener(manager);
		zero.addActionListener(manager);
		equals.addActionListener(manager);
		sr.addActionListener(manager);
	}
}
