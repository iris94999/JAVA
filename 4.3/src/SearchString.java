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
		for(i=0;i<s2.length();i++)//���ڶ����ַ�����Ϊ��ѭ��
		{
			for(j=0;j<s1.length();j++)
			{
				if(s1.charAt(j)!=s2.charAt(i))//һ�������в�һ������ĸ��������һ���ַ�����ѭ��
				{
					break;
				}
				if(s1.charAt(j)==s2.charAt(i))//����ַ�һ���ͽ���һ���ַ�����ѯ����һ��λ��
				{
					i++;
				}
				
			}
			if(j==s1.length()) flag=1;//��ÿһ��������һ���ַ���ѭ����ͬʱ����Ƿ�����Ϊ��һ���ַ����Ѿ�ѭ����ɶ�������
		}
		if(flag==1)
		{
			return true;
		}
		else return false;
		
	}
			
	


	
		
}
