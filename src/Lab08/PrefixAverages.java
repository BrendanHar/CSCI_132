package Lab08;

public class PrefixAverages {

	/** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
	public static double[] prefixAverage1 (double[] x) {
		int n = x.length;
		double[] a = new double[n];
		for (int j = 0; j < n; j++) {
			double total = 0;
			for (int i = 0; i <= j; i++)
				total += x[i];
			a[j] = total / (j + 1);

		}
		return a;
	}
	
	/** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
	public static double[] prefixAverage2(double[] x) {
		int n = x.length;
		double[] a = new double[n];
		double total = 0;
		for (int j = 0; j < n; j++) {
			total += x[j];
			a[j] = total / (j + 1);
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] a = new double[10];
		double [] b = new double[100];
		double [] c = new double[1000];
		double [] d = new double[10000];
		double [] e = new double[100000];

		System.out.print(prefixAverage1(a));
		System.out.print(prefixAverage1(b));
		System.out.print(prefixAverage1(c));
		System.out.print(prefixAverage1(d));
		System.out.print(prefixAverage1(e));


		System.out.print(prefixAverage2(a));
		System.out.print(prefixAverage2(b));
		System.out.print(prefixAverage2(c));
		System.out.print(prefixAverage2(d));
		System.out.print(prefixAverage2(e));
		
	}

}
