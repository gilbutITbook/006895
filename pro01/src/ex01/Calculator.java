package ex01;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calculator extends JFrame {
	private static float USD_RATE= 1124.70F;
	private static float JPY_RATE = 10.113F;
	private static float CNY_RATE = 163.30F;
	private static float GBP_RATE = 1444.35F;
	private static float EUR_RATE = 1295.97F;
			
	JLabel title = new JLabel("달러");
	JTextField operand1 = new JTextField(10);
	String[] opExpression = {"선택","달러", "엔화", "위안","파운드","유로"};
	JComboBox<String> opSelection = new JComboBox<String>(opExpression);
	JTextField txtResult = new JTextField(10);
	JButton btnClear = new JButton("다시입력");
	
	public Calculator() {
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	private void startFrame(){
		opSelection.addActionListener(new SelectionHandler());
		btnClear.addActionListener(new SelectionHandler());
		this.setTitle("환율 계산하기");
		this.add(title);
		this.add(operand1);
		this.add(opSelection);
		this.add(txtResult);
		this.add(btnClear);
		this.setSize(700,200);
		
	}
	
	class SelectionHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==opSelection){
				calculate();
			}else if(e.getSource()==btnClear){
				init();
			}
			
		}
	}

	private void calculate(){
		float won=Float.parseFloat(operand1.getText());
		String result=null;
		String operator=opSelection.getSelectedItem().toString();
		if(operator.equals("달러")){
			result=String.format("%.6f",won/USD_RATE);
		}else if(operator.equals("엔화")){
			result=String.format("%.6f",won/JPY_RATE);
		}else if(operator.equals("위안")){
			result=String.format("%.6f",won/CNY_RATE);
		}else if(operator.equals("파운드")) {
			result=String.format("%.6f",won/GBP_RATE);
		}else if(operator.equals("유로")) {
			result=String.format("%.6f",won/EUR_RATE);
		}
		txtResult.setText(result);
	}
	
	private void init(){
		operand1.setText("");
		txtResult.setText("");
	}
	public static void main(String[] args){
		Calculator calc=new Calculator();
		calc.startFrame();
		
	}

}
