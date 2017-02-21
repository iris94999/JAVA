import java.io.*;

public class TestLineNumbering {

	public static void main(String[] args) 
	{
		if(args!=null)
		{	
			File file=new File(args[0]);//读取命令行参数
			String s;
			int i=0;
			try
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//对标准输入进行包装
				FileOutputStream fos=new FileOutputStream(file);
				OutputStreamWriter osw=new OutputStreamWriter(fos);
				BufferedWriter bw=new BufferedWriter(osw);
				
				while((s=br.readLine())!=null)
				{
					bw.write((i+1)+" "+s);
					bw.newLine();
					i++;
				}
				bw.close();
				osw.close();
				fos.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
			
			
			
		}
		else 
		{
			System.out.println("没有指定命令行参数");
			
		}
		

	}

}