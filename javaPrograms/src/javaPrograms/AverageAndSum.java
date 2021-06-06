package javaPrograms;

public class AverageAndSum {

	public static void main(String[] args) {
		AvgandSum aands = new AvgandSum();
		System.out.println(aands.sum(1, 2));		
		System.out.println(aands.avg(5, 10));

	}

}


class AvgandSum{
	float avg(int num1,int num2) {
		float avg = (num1+num2)/2;
		return(avg);
	}
	int sum(int n1,int n2) {
		int sum = n1+n2;
		return sum;

	}

}





