package recurssion;

public class josephusProblem {
	
	private static int josephusProblem(int n ,int k) {
		if(n == 1 ) {
			return 0;
		}
		return (josephusProblem(n-1,k) + k)%n;
	}
	public static void main(String args[]) {
		System.out.println(josephusProblem.josephusProblem(5, 3));
	}
}
