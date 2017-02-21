
public class TestArrays {
	public static void printarray(int[] array){
		System.out.print('<');
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
			if(i<array.length-1)
			{
				System.out.print(',');
			}
		}
		System.out.print('>');
	}
	
	public static void main(String[] args) {
		int[] array1={2,3,5,7,11,13,17,19};
		int[] array2=new int[array1.length];
		int i=0,j=0;
		System.out.print("array1 is");
		printarray(array1);
		System.out.println();
		
		array2=array1;
		for(i=0;i<array1.length;i=i+2)
		{
			array2[i]=i;
		}
		System.out.print("array1 is");
		printarray(array1);
		System.out.println();
		
		int[][] matrix=new int[5][];
		for(i=0;i<5;i++)
		{
			matrix[i]=new int[i];

				for(j=0;j<i;j++)
				{
					matrix[i][j]=i*j;
					
				}
				System.out.printf("matrix[%d] is ",i);
				printarray(matrix[i]);
				System.out.println();
			
			
		}
	}
	

}
