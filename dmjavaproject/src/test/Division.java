package test;

public class Division {

	public static void main(String[] args) {

		Division div = new Division();

		System.out.println(div.div(6, 3));
	}

	public double div(double x, double y) {

		double res=0;

		if (x==0) {
			System.out.println("divide by Zero not allowed");
		}else {
			res =  x/y;
		}
		return res;
	}

}
