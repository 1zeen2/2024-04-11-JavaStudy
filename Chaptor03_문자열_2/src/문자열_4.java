
import javax.swing.*;

public class 문자열_4 extends JFrame {
	
	JTextField tf = new JTextField();
	public 문자열_4() {
		add("North", tf);
		tf.setText(String.valueOf(true)); // 윈도우에는 String밖에 없어서 String.valueOf를 사용하여 정수를 문자열로 변경하여야 한다.
		setSize(350, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 문자열_4();
		
	}

}
