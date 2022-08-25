// author  manish chauhan
// Java program to calculate the average value of array element
public class AverageValue {

	public static void main(String[] args) {
	int [] number = new int[] {10,20,30,40,-50,60,-70};
	//calculate sum of all array element
	int sum =0;
	for(int i=0;i<number.length;i++)
		sum= sum+ number[i];
	// calculate average value
	double avg=sum/number.length;
	System.out.println("Avg value of the array element is:"+ avg);
	
	
	

	}
}