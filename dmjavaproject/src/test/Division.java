package test;

public class Division {

	public static void main(String[] args) {

		Division div = new Division();

		System.out.println(div.div(6, 3));
	}

	public double div(double a, double b) {

		double res=0;

		if (b==0) {
			System.out.println("divide by Zero not allowe");
		}else {
			res =  a/b;
		}
		return res;
	}

}
