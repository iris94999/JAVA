import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ChatClient implements ActionListener
{

	private JFrame jf;
	private TextField tf;
	private TextArea ta;
	private Button b1,b2;
	
	public void launchFrame()
	{
		
		jf=new JFrame("Chat Room");
		jf.setSize(300, 200);
		tf=new TextField(50);
		ta=new TextArea(10,50);
		b1=new Button("Send");
		b2=new Button("Quit");
		
		JPanel panel=new JPanel(new BorderLayout());//面板默认为流式布局
		
		JPanel panelB1=new JPanel();
		JPanel panelB2=new JPanel();
		
		panelB1.add(b1);
		panelB2.add(b2);
		panel.add(panelB1,BorderLayout.NORTH);
		panel.add(panelB2,BorderLayout.CENTER);
		
		jf.add(tf,BorderLayout.SOUTH);
		jf.add(ta,BorderLayout.CENTER);
		jf.add(panel,BorderLayout.EAST);
		
		b1.addActionListener(this);//注册一个监听器
		b2.addActionListener(this);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();//时间判断常用方法
		if(obj==b1)
		{
			String s=tf.getText();
			ta.setText(s);
		}
		
		if(obj==b2)
		{
			System.exit(0);
		}
	
	}
	public static void main(String[] args) {
		
		ChatClient c=new ChatClient();
		c.launchFrame();

	}

}
