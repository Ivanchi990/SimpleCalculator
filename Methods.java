package calculadora;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Methods 
{
	View view;
	
	double num1;
	String operator;
	double num2;
	
	double res;
	
	public Methods(View view)
	{
		this.view = view;
	}
	
	
	public void operator(JButton j)
	{	
		if(!view.num.getText().equals("") || isDigit(view.num.getText()))
		{
			num1 = Double.valueOf(view.num.getText());
			operator = j.getText();
			view.num.setText("");
		}
		else
		{
			JOptionPane.showMessageDialog(view.window, "Wow, I guess that's not a number");
		}
	}
	
	
	public void solve()
	{
		if(!view.num.getText().equals("") || isDigit(view.num.getText()))
		{
			num2 = Double.valueOf(view.num.getText());
			
			switch(operator)
			{
				case "+":
					setSum();
					break;
				case "-":
					setSub();
					break;
				case "/":
					setDiv();
					break;
				case "*":
					setMul();
					break;
				case "^":
					setPow();
					break;
				case "%":
					setPer();
				default:
					break;
			}
			
			String re = String.valueOf(res);
			
			if(re.length() > 12)
			{
				view.font = new Font("Dialog", Font.BOLD, 20);
				view.num.setFont(view.font);
			}
			
			view.num.setText(re);
		}
		else
		{
			JOptionPane.showMessageDialog(view.window, "Wow, I guess that's not a number");
		}
	}
	
	
	public void setSum()
	{
		res = num1 + num2;
	}
	
	
	public void setSub()
	{
		res = num1 - num2;
	}
	
	
	public void setDiv()
	{
		res = num1 / num2;
	}
	
	
	public void setMul()
	{
		res = num1 * num2;
	}
	
	
	public void setPow()
	{
		res = Math.pow(num1, num2);
	}
	
	
	public void setPer()
	{
		res = (num1 * num2) / 100;
	}
	
	
	public void addNum(JButton button)
	{
		int num = Integer.valueOf(button.getText());
		view.num.setText(view.num.getText() + num);
	}
	
	
	public void addDot()
	{
		view.num.setText(view.num.getText() + ".");
	}
	
	
	public boolean isDigit(String num)
	{
        try 
        {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException excepcion) 
        {
            return false;
        }
	}
	
	
	public void clear()
	{
		view.num.setText("");
		view.font= new Font("Dialog", Font.BOLD, 36);
		view.num.setFont(view.font);
		num1 = 0;
		operator = null;
		num2 = 0;
	}
	
	
	public void exit()
	{
		int ans = JOptionPane.showConfirmDialog(view.window, "¿Are you sure?", "exit", 0, 1);
		
		if(ans == 0)
		{
			System.exit(0);
		}
	}
}
