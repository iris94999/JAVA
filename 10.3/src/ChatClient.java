
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ChatClient implements WindowListener
{

	private JFrame jf;
	private TextField tf;
	private TextArea ta;
	private Button b1,b2;
	private JMenuBar file;
	
	public void launchFrame()
	{
		
		jf=new JFrame("Chat Room");
		jf.setSize(300, 200);
		tf=new TextField(50);
		ta=new TextArea(10,50);
		b1=new Button("Send");
		b2=new Button("Quit");
		file=new JMenuBar();
		
		
		
		class Button1 implements ActionListener//用内部类法实现监听
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String s=tf.getText();
				ta.setText(s);
			}
			
		}
		
		class Button2 implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		}
		
		class Textfield implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				String s=tf.getText();
				ta.setText(s);
			}
		}
		
		class Sendmenu implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				String s=tf.getText();
				ta.setText(s);
			}
		}
		
		class Quitmenu implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		}
		
		
	
		JPanel panel=new JPanel(new BorderLayout());//面板默认为流式布局
		JPanel panelB1=new JPanel();
		JPanel panelB2=new JPanel();
		
		panelB1.add(b1);
		panelB2.add(b2);
		panel.add(panelB1,BorderLayout.NORTH);
		panel.add(panelB2,BorderLayout.CENTER);
		
		jf.add(file,BorderLayout.NORTH);//加入菜单条
		
		JMenu menu=new JMenu("文件（F）");
		JMenu menuBelong=new JMenu("选项");
		JMenuItem SendMenu=new JMenuItem("Send");
		JMenuItem QuitMenu=new JMenuItem("Quit");
		
		file.add(menu);
		//menu.add(menuBelong);
		//menuBelong.add(SendMenu);
		//menuBelong.add(QuitMenu);
		menu.add(SendMenu);
		menu.add(QuitMenu);
		
		
		
		jf.add(tf,BorderLayout.SOUTH);
		jf.add(ta,BorderLayout.CENTER);
		jf.add(panel,BorderLayout.EAST);
		
		b1.addActionListener(new Button1());
		b2.addActionListener(new Button2());
		tf.addActionListener(new Textfield());
		SendMenu.addActionListener(new Sendmenu());
		QuitMenu.addActionListener(new Quitmenu());
		
		//jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
	}
	

	/*public void actionPerformed(ActionEvent e)
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
		
		if(obj==tf)
		{
			String s=getText();
			ta=setText(s);
		}
	
	}*/
	

	public void windowClosing(WindowEvent e) {
		
		System.exit(0);
		
	}

	
	
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		ChatClient c=new ChatClient();
		c.launchFrame();

	}


}
