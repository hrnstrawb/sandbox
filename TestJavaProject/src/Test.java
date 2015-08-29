public class Test {
	private static int numOfPens = 1;
	public static void main(String args[]) {
		if (args.length == 0) {
			System.out.println("You must specify the number of pens to command line argument.");
		} else {
			numOfPens = Integer.valueOf(args[0]);
			System.out.println("This is " + numOfPens +" pen.");
		}
	}
}
