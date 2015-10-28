import java.util.Arrays;
public class W10Lab1 {

	public static void main(String[] args) {
		int[] aryNums;
		int sum = 0;
		double avg = 0;
		aryNums = new int [6];
		aryNums[0] = 123;
		aryNums[1] = 456;
		aryNums[2] = 479;
		aryNums[3] = 135;
		aryNums[4] = 246;
		aryNums[5] = 135;

		Arrays.sort(aryNums);
		
		for(int i=0; i<aryNums.length; i++)
		{
			System.out.println("num:" +aryNums[i]);
			sum=sum+aryNums[i];
		}
		avg = sum / 6.0;
		System.out.printf("The average is: %f", avg);
		
		
	}

}
