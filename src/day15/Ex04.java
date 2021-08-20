package day15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("TEST"); // JFrame 객체 생성
		Container c = frame.getContentPane(); // Container 객체 생성
		JLabel label = new JLabel("Hello GUI");
		// JLabel를 통해Hello GUI 텍스트 생성
		
		c.add(label); // JFrame 위에 생성한 텍스트 추가
		
		frame.setLocation(1000, 200); // JFrame의 위치 조절
		
		frame.setPreferredSize(new Dimension(500, 200)); // JFrame의 크기 조절
		frame.pack(); // 변경사항 저장
		
		Font font = new Font(null, Font.ITALIC, 32); // 글꼴, 효과, 크기
		label.setFont(font); // 폰트 적용
		label.setHorizontalAlignment(JLabel.CENTER); 
		// 가운데 정렬
		
		frame.setVisible(true); // JFrame를 화면에 보여줌
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// JFrame 종료시 프로그램도 종료
		
		label.setText("안녕하세요"); // JLabel 텍스트 변경
	}

}
