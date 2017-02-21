import java.util.Scanner;

public class SearchString {
	private static Scanner input;
	public static void main(String[] args) {
		System.out.println("Please input the word you want to search!");
		input = new Scanner(System.in);
		boolean result=isSubString(input.next(),"The cat in the hat.");
		System.out.print(result);
		
	}
	public static boolean isSubString(String s1,String s2){
		int i=0,j=0;
		int flag=0;
		for(i=0;i<s2.length();i++)//将第二个字符串作为外循环
		{
			for(j=0;j<s1.length();j++)
			{
				if(s1.charAt(j)!=s2.charAt(i))//一但发现有不一样的字母就跳出第一个字符串的循环
				{
					break;
				}
				if(s1.charAt(j)==s2.charAt(i))//如果字符一样就将第一个字符串查询到下一个位置
				{
					i++;
				}
				
			}
			if(j==s1.length()) flag=1;//在每一次跳出第一个字符串循环的同时检测是否是因为第一个字符串已经循环完成而跳出的
		}
		if(flag==1)
		{
			return true;
		}
		else return false;
		
	}
			
	


	
		
}
