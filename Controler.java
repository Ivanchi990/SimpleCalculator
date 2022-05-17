package calculadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Controler implements ActionListener, MenuListener, ItemListener
{
	View view;
	Methods methods;
	
	public Controler(View view)
	{
		this.view = view;
		this.methods = new Methods(view);
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		JButton source3 = (JButton) e.getSource();
		
		if(source3 == view.clear)
		{
			methods.clear();
		}
		else if(source3 == view.percent)
		{
			methods.operator(source3);
		}
		else if(source3 == view.plus)
		{
			methods.operator(source3);
		}
		else if(source3 == view.minus)
		{
			methods.operator(source3);
		}
		else if(source3 == view.asterisk)
		{
			methods.operator(source3);
		}
		else if(source3 == view.slash)
		{
			methods.operator(source3);
		}
		else if(source3 == view.pow)
		{
			methods.operator(source3);
		}
		else if(source3 == view.one)
		{
			methods.addNum(source3);
		}
		else if(source3 == view.two)
		{
			methods.addNum(source3);
		}
		else if(source3 == view.three)
		{
			methods.addNum(source3);
		}
		else if(source3 == view.four)
		{
			methods.addNum(source3);
		}
		else if(source3 == view.five)
		{
			methods.addNum(source3);
		}
		else if(source3 == view.six)
		{
			methods.addNum(source3);
		}
		else if(source3 == view.seven)
		{
			methods.addNum(source3);
		}
		else if(source3 == view.eight)
		{
			methods.addNum(source3);
		}
		else if(source3 == view.nine)
		{
			methods.addNum(source3);
		}
		else if(source3 == view.zero)
		{
			methods.addNum(source3);
		}
		else if(source3 == view.dec)
		{
			methods.addDot();
		}
		else if(source3 == view.equals)
		{
			methods.solve();
		}
	}


	public void menuSelected(MenuEvent e) 
	{
		if(e.getSource() == view.exit)
		{
			methods.exit();
		}
	}


	public void menuDeselected(MenuEvent e) 
	{
		
	}


	public void menuCanceled(MenuEvent e) 
	{
		
	}
	
	
	public void itemStateChanged(ItemEvent e) 
	{
		JMenuItem source = (JMenuItem) e.getSource();
		
		if(source == view.dark)
		{
			dark();
		}
		else if(source == view.light)
		{
			light();
		}
	}
	
	
	public void dark()
	{
		view.num.setBackground(Color.GRAY);
		view.bar.setBackground(Color.BLACK);
		view.exit.setBackground(Color.BLACK);
		view.exit.setForeground(Color.WHITE);
		view.theme.setBackground(Color.BLACK);
		view.theme.setForeground(Color.WHITE);
		view.clear.setForeground(Color.WHITE);
		view.clear.setBackground(Color.BLACK);
		view.percent.setForeground(Color.WHITE);
		view.percent.setBackground(Color.BLACK);
		view.plus.setForeground(Color.WHITE);
		view.plus.setBackground(Color.BLACK);
		view.minus.setForeground(Color.WHITE);
		view.minus.setBackground(Color.BLACK);
		view.one.setBackground(Color.BLACK);
		view.one.setForeground(Color.WHITE);
		view.two.setBackground(Color.BLACK);
		view.two.setForeground(Color.WHITE);
		view.three.setBackground(Color.BLACK);
		view.three.setForeground(Color.WHITE);
		view.asterisk.setBackground(Color.BLACK);
		view.asterisk.setForeground(Color.WHITE);
		view.four.setBackground(Color.BLACK);
		view.four.setForeground(Color.WHITE);
		view.five.setBackground(Color.BLACK);
		view.five.setForeground(Color.WHITE);
		view.six.setBackground(Color.BLACK);
		view.six.setForeground(Color.WHITE);
		view.slash.setBackground(Color.BLACK);
		view.slash.setForeground(Color.WHITE);
		view.seven.setBackground(Color.BLACK);
		view.seven.setForeground(Color.WHITE);
		view.eight.setBackground(Color.BLACK);
		view.eight.setForeground(Color.WHITE);
		view.nine.setBackground(Color.BLACK);
		view.nine.setForeground(Color.WHITE);
		view.pow.setBackground(Color.BLACK);
		view.pow.setForeground(Color.WHITE);
		view.dec.setBackground(Color.BLACK);
		view.dec.setForeground(Color.WHITE);
		view.zero.setBackground(Color.BLACK);
		view.zero.setForeground(Color.WHITE);
		view.equals.setBackground(Color.BLACK);
		view.equals.setForeground(Color.WHITE);
		view.sr.setBackground(Color.BLACK);
		view.sr.setForeground(Color.WHITE);
	}
	
	
	public void light()
	{
		view.num.setBackground(Color.WHITE);
		view.bar.setBackground(Color.WHITE);
		view.exit.setBackground(Color.WHITE);
		view.exit.setForeground(Color.BLACK);
		view.theme.setBackground(Color.WHITE);
		view.theme.setForeground(Color.BLACK);
		view.clear.setForeground(Color.BLACK);
		view.clear.setBackground(Color.WHITE);
		view.percent.setForeground(Color.BLACK);
		view.percent.setBackground(Color.WHITE);
		view.plus.setForeground(Color.BLACK);
		view.plus.setBackground(Color.WHITE);
		view.minus.setForeground(Color.BLACK);
		view.minus.setBackground(Color.WHITE);
		view.one.setBackground(Color.WHITE);
		view.one.setForeground(Color.BLACK);
		view.two.setBackground(Color.WHITE);
		view.two.setForeground(Color.BLACK);
		view.three.setBackground(Color.WHITE);
		view.three.setForeground(Color.BLACK);
		view.asterisk.setBackground(Color.WHITE);
		view.asterisk.setForeground(Color.BLACK);
		view.four.setBackground(Color.WHITE);
		view.four.setForeground(Color.BLACK);
		view.five.setBackground(Color.WHITE);
		view.five.setForeground(Color.BLACK);
		view.six.setBackground(Color.WHITE);
		view.six.setForeground(Color.BLACK);
		view.slash.setBackground(Color.WHITE);
		view.slash.setForeground(Color.BLACK);
		view.seven.setBackground(Color.WHITE);
		view.seven.setForeground(Color.BLACK);
		view.eight.setBackground(Color.WHITE);
		view.eight.setForeground(Color.BLACK);
		view.nine.setBackground(Color.WHITE);
		view.nine.setForeground(Color.BLACK);
		view.pow.setBackground(Color.WHITE);
		view.pow.setForeground(Color.BLACK);
		view.dec.setBackground(Color.WHITE);
		view.dec.setForeground(Color.BLACK);
		view.zero.setBackground(Color.WHITE);
		view.zero.setForeground(Color.BLACK);
		view.equals.setBackground(Color.WHITE);
		view.equals.setForeground(Color.BLACK);
		view.sr.setBackground(Color.WHITE);
		view.sr.setForeground(Color.BLACK);
	}
}
