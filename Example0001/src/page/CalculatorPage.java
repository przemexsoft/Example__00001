package page;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import operation.DecimalCalculation;

public class CalculatorPage implements ActionListener  {

	private JFrame frame;
	private JTextField textField;
	private String Num="";
	private float tmpSum= 0; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorPage window = new CalculatorPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 434, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_7 = new JButton("7");
		btn_7.setActionCommand("7");
		btn_7.addActionListener(this);
		btn_7.setBounds(21, 31, 38, 23);
		frame.getContentPane().add(btn_7);
		
		JButton btn_4 = new JButton("4");
		btn_4.setActionCommand("4");
		btn_4.addActionListener(this);
		btn_4.setBounds(21, 65, 38, 23);
		frame.getContentPane().add(btn_4);
		
		JButton btn_8 = new JButton("8");
		btn_8.setActionCommand("8");
		btn_8.addActionListener(this);;
		btn_8.setBounds(69, 31, 38, 23);
		frame.getContentPane().add(btn_8);
		
		JButton btn_2 = new JButton("2");
		btn_2.setActionCommand("2");
		btn_2.addActionListener(this);
		btn_2.setBounds(69, 99, 38, 23);
		frame.getContentPane().add(btn_2);
		
		JButton btn_5 = new JButton("5");
		btn_5.setActionCommand("5");
		btn_5.addActionListener(this);
		btn_5.setBounds(69, 65, 38, 23);
		frame.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setActionCommand("6");
		btn_6.addActionListener(this);
		btn_6.setBounds(117, 65, 38, 23);
		frame.getContentPane().add(btn_6);
		
		JButton btn_9 = new JButton("9");
		btn_9.setActionCommand("9");
		btn_9.addActionListener(this);
		btn_9.setBounds(117, 31, 38, 23);
		frame.getContentPane().add(btn_9);
		
		JButton btn_1 = new JButton("1");
		btn_1.setActionCommand("1");
		btn_1.addActionListener(this);
		btn_1.setBounds(21, 99, 38, 23);
		frame.getContentPane().add(btn_1);
		
		JButton btn_add = new JButton("+");
		btn_add.setActionCommand("+");
		btn_add.addActionListener(this);
		btn_add.setBounds(165, 31, 48, 23);
		frame.getContentPane().add(btn_add);
		
		JButton btn_3 = new JButton("3");
		btn_3.setActionCommand("3");
		btn_3.addActionListener(this);
		btn_3.setBounds(117, 99, 38, 23);
		frame.getContentPane().add(btn_3);
		
		JButton btn_sub = new JButton("-");
		btn_sub.setActionCommand("-");
		btn_sub.addActionListener(this);
		btn_sub.setBounds(165, 65, 48, 23);
		frame.getContentPane().add(btn_sub);
		
		JButton btn_0 = new JButton("0");
		btn_0.setActionCommand("0");
		btn_0.addActionListener(this);
		btn_0.setBounds(21, 133, 38, 23);
		frame.getContentPane().add(btn_0);
		
		JButton btn_mul = new JButton("*");
		btn_mul.setActionCommand("*");
		btn_mul.addActionListener(this);
		btn_mul.setBounds(165, 99, 48, 23);
		frame.getContentPane().add(btn_mul);
		
		JButton btn_div = new JButton("/");
		btn_div.setActionCommand("/");
		btn_div.addActionListener(this);
		btn_div.setBounds(165, 133, 48, 23);
		frame.getContentPane().add(btn_div);
		
		JButton button = new JButton("=");
		button.setActionCommand("/");
		button.setBounds(165, 167, 48, 23);
		frame.getContentPane().add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton tmpButton= (JButton)e.getSource();
		DecimalCalculation ddd = new DecimalCalculation();
		switch(tmpButton.getActionCommand()){
		case "+":
		tmpSum = Float.parseFloat(Num);
		if (tmpSum !=0)	{
			tmpSum =	tmpSum + ddd.operationAdd(Float.parseFloat(Num));	
			 
		}
		textField.setText(Num);
			break;
		case "-":
			
			break;
		case "*":
			
			break;
		case "/":
			
			break;
			
		default:
			Num+=tmpButton.getText();
			textField.setText(Num);
			break;
		}
		
		}
		
		
		
	}

