package arrays;

public class Arrays2 {

	public static void main(String[] args) {
int[] numbers = {43, 25, 37, 11, 88};
		
		int max = 0;
		int min = 0;
		
		for(int i=1; i<numbers.length; i++)
		{
			if (numbers[i] > max)
			{
				max = numbers[i];
			}
			if (numbers[i] < min)
			{
				min = numbers[i];
			}
		}
		System.out.println("Maximun = "+max);
		System.out.println("Minumun = "+min);

	}

}
