package practice4;

public class Practice4 {
	public static void main(String[] args){
//		4-1①
		int[] points = new int[4];
//		省略しないで書くと…
//		int[] points;
//		point = new int[4];
		
//		②
		double[] weight = new double[5];
		
//		③
		boolean[] answers = new boolean[3];
		
//		④
		String[] names = new String[3];
		
//		4-2
		int[] moneyList = new int[]{121902,8302,55100};
		for(int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		
		for(int kouza: moneyList) {
			System.out.println(kouza);
		}
		
//		4-4
		int[] numbers = new int[] {3,4,9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for(int n : numbers) {
			if(n == input) {
				System.out.println("あたり！");
			}
		}
		
		
		
	}

}
