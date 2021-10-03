package assignmentsweek1;


public class fibonacciPgm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int range =8;
int secondNum =1;
int firstNumber=0;
int sum;
System.out.println(firstNumber);
for (int firstNum = 0; firstNum <= range; firstNum++) {
	sum = firstNum + secondNum;
		System.out.println(sum);
	secondNum=firstNum;
	sum=secondNum;	
	
	
}

	}

}
