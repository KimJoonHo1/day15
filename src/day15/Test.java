package day15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("a H시mm분ss초");
		String str = sd.format(date);
		System.out.println(str);
		*/
		
		JFrame frame = new JFrame("Timer");
		Container con = frame.getContentPane();
		
		
		frame.setLocation(1000, 200);
		frame.setPreferredSize(new Dimension(500, 200));
		frame.pack();
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("a H시mm분ss초");
		String str = sdf.format(date);
		
		JLabel label = new JLabel(str);
		label.setHorizontalAlignment(JLabel.CENTER); 
		con.add(label);
		
		Font font = new Font(null, 0, 32); // 글꼴, 효과, 크기
		label.setFont(font); // 폰트 적용
		
		frame.setVisible(true);
		
		while(true) {
			date = new Date();
			str = sdf.format(date);
			label.setText(str);
		}
	}

}
