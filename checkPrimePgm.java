package assignmentsweek1;

public class checkPrimePgm {

	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				flag = true;
				break;
			}}

			if (flag == false) {
				System.out.println("Prime");
			} else
				System.out.println("NotPrime");
		}

	}

