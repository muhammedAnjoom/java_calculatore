

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;





public class Caluter implements ActionListener {
	
	JFrame jf;
	boolean isOpratiesclicked=false;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton sumButton;
	JButton diveButton;
	JButton mutipleButton;
	JButton subtraButton;
	JButton additonButton;
	JButton clearButton;
	
	String oldValue;

	public Caluter() {
		
		jf=new JFrame("Calculater");
		jf.setLayout(null);
		jf.setSize(600,600);
		
		jf.setLocation(300,150);
		
	    displayLabel=new JLabel();
	    displayLabel.setFont(new Font("Serif",Font.PLAIN,70));
		displayLabel.setBounds(30,20, 540,80);
		displayLabel.setBackground(Color.BLACK);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,120,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		sevenButton.setBackground(Color.WHITE);
		sevenButton.setForeground(Color.BLACK);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130,120,80,80);
		eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		eightButton.setBackground(Color.WHITE);
		eightButton.setForeground(Color.BLACK);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230,120,80,80);
		nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		nineButton.setBackground(Color.WHITE);
		nineButton.setForeground(Color.BLACK);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30,220,80,80);
		fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		fourButton.setBackground(Color.WHITE);
		fourButton.setForeground(Color.BLACK);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130,220,80,80);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		fiveButton.setBackground(Color.WHITE);
		fiveButton.setForeground(Color.BLACK);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230,220,80,80);
		sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		sixButton.setBackground(Color.WHITE);
		sixButton.setForeground(Color.BLACK);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30,320,80,80);
		oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		oneButton.addActionListener(this);eightButton.setBackground(Color.WHITE);
		oneButton.setBackground(Color.WHITE);
		oneButton.setForeground(Color.BLACK);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130,320,80,80);
		twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		twoButton.setBackground(Color.WHITE);
		twoButton.setForeground(Color.BLACK);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230,320,80,80);
		threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		threeButton.setBackground(Color.WHITE);
		threeButton.setForeground(Color.BLACK);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30,430,80,80);
		dotButton.setFont(new Font("Arial",Font.PLAIN,40));
		dotButton.setBackground(Color.WHITE);
		dotButton.setForeground(Color.BLACK);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130,430,80,80);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		zeroButton.setBackground(Color.WHITE);
		zeroButton.setForeground(Color.BLACK);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		sumButton=new JButton("=");
		sumButton.setBounds(230,430,80,80);
		sumButton.setFont(new Font("Arial",Font.PLAIN,40));
		sumButton.setBackground(Color.WHITE);
		sumButton.setForeground(Color.BLACK);
		sumButton.addActionListener(this);
		jf.add(sumButton);
		
		diveButton=new JButton("/");
		diveButton.setBounds(330,120,80,80);
		diveButton.setFont(new Font("Arial",Font.PLAIN,40));
		diveButton.setBackground(Color.WHITE);
		diveButton.setForeground(Color.BLACK);
		diveButton.addActionListener(this);
		jf.add(diveButton);
		
		mutipleButton=new JButton("*");
		mutipleButton.setBounds(330,220,80,80);
		mutipleButton.setFont(new Font("Arial",Font.PLAIN,40));
		mutipleButton.setBackground(Color.WHITE);
		mutipleButton.setForeground(Color.BLACK);
		mutipleButton.addActionListener(this);
		jf.add(mutipleButton);
		
		subtraButton=new JButton("-");
		subtraButton.setBounds(330,320,80,80);
		subtraButton.addActionListener(this);
		subtraButton.setFont(new Font("Arial",Font.PLAIN,40));
		subtraButton.setBackground(Color.WHITE);
		subtraButton.setForeground(Color.BLACK);
		
		jf.add(subtraButton);
		
		additonButton=new JButton("+");
		additonButton.setBounds(330,430,80,80);
		additonButton.addActionListener(this);
		additonButton.setFont(new Font("Arial",Font.PLAIN,40));
		additonButton.setBackground(Color.WHITE);
		additonButton.setForeground(Color.BLACK);
		jf.add(additonButton);
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(430,120,140,80);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial",Font.PLAIN,40));
		clearButton.setBackground(Color.WHITE);
		clearButton.setForeground(Color.BLACK);
		
		jf.add(clearButton);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Caluter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			
			if(isOpratiesclicked) {
				displayLabel.setText("7");
				
				isOpratiesclicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
			
		}else if(e.getSource()==eightButton) {
			
			if(isOpratiesclicked) {
				displayLabel.setText("8");
				
				isOpratiesclicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
			
		}else if(e.getSource()==nineButton) {
			
			if(isOpratiesclicked) {
				displayLabel.setText("9");
				
				isOpratiesclicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}	
		}else if(e.getSource()==fourButton) {
			
			if(isOpratiesclicked) {
				displayLabel.setText("4");
				
				isOpratiesclicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if (e.getSource()==fiveButton) {
			if (isOpratiesclicked) {
				displayLabel.setText("5");
				isOpratiesclicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if(e.getSource()==sixButton) {
			if (isOpratiesclicked) {
				displayLabel.setText("6");
				isOpratiesclicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}else if(e.getSource()==oneButton) {
			if (isOpratiesclicked) {
				displayLabel.setText("1");
				isOpratiesclicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if (e.getSource()==twoButton) {
			if (isOpratiesclicked) {
				displayLabel.setText("2");
				isOpratiesclicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
			
		}else if(e.getSource()==threeButton) {
			if (isOpratiesclicked) {
				displayLabel.setText("3");
				isOpratiesclicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}else if(e.getSource()==dotButton) {
			if (isOpratiesclicked) {
				displayLabel.setText(".");
				isOpratiesclicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
			
		}else if (e.getSource()==zeroButton) {
			if (isOpratiesclicked) {
				displayLabel.setText("0");
				isOpratiesclicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
		}else if(e.getSource()==sumButton){
			String newValue=displayLabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newvalueF=Float.parseFloat(newValue);
			
			
			float result=oldValueF*newvalueF;
			 
			displayLabel.setText(result+"");
			
			float result1=oldValueF+newvalueF;
			displayLabel.setText(result1+"");
			
			float result2=oldValueF/newvalueF;
			displayLabel.setText(result2+"");
			
			float result3=oldValueF-newvalueF;
			displayLabel.setText(result3+"");
			
			
			
			
		}else if(e.getSource()==diveButton) {
			isOpratiesclicked=true;
			oldValue=displayLabel.getText();
		}else if(e.getSource()==mutipleButton) {
			
			isOpratiesclicked=true;
			oldValue=displayLabel.getText();
		}else if(e.getSource()==subtraButton) {
			isOpratiesclicked=true;
			oldValue=displayLabel.getText();
		}else if(e.getSource()==additonButton) {
			
			isOpratiesclicked=true;
			oldValue=displayLabel.getText();
			
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("");
		}
		
	}
	
	
	
}
