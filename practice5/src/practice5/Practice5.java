package practice5;

public class Practice5 {
//	5-1 
//	public static void main(String[] args) {
//		introduceOneself("おおはしなお");
//		introduceOneself(24);
//		introduceOneself(154.5);
//		introduceOneself('丑');
//	}
//	
//	public static void introduceOneself(String name) {
//		System.out.println("私の名前は" + name + "です");
//	}
//	
//	public static void introduceOneself(int age) {
//		System.out.println("年齢は" + age + "歳です");
//	}
//	
//	public static void introduceOneself(double height) {
//		System.out.println("身長は" + height + "cmです");
//	}
//	
//	public static void introduceOneself(char eto) {
//		System.out.println("干支は" + eto + "です");
//	}

//	5-1回答
//	public static void main(String[] args) {
//		introduceOneself();
//		email("お花畑をみたよ","nnn-70@gmail.com","今日はいい天気だったから、お花畑をみてきたよ♡");
//	}
//	
//	public static void introduceOneself() {
//		String name = "なお";
//		int age = 24;
//		double height = 154.5;
//		char zodiac = '丑';
//		
//		System.out.println("私の名前は" + name + "です");
//		System.out.println("年齢は" + age + "歳です");
//		System.out.println("身長は" + height + "cmです");
//		System.out.println("干支は" + zodiac + "です");
//	}

//	5-2,5-3
//	public static void main(String[] args) {
//		email("お花畑をみたよ","nnn-70@gmail.com","今日はいい天気だったから、お花畑をみてきたよ♡");
//		String address = "nnn-7777@gmail.com";
//		String text = "こんにちは！今日も晴れているね！";
//		email(address,text);
//	}
//	
//	public static void email(String title, String address, String text) {
//		System.out.println(address + "に、以下のメールを送信しました");
//		System.out.println("件名:" + title);
//		System.out.println("本文:" + text);
//	}
//	
//	public static void email(String address, String text) {
//		System.out.println(address + "に、以下のメールを送信しました");
//		System.out.println("件名:" + "無題");
//		System.out.println("本文:" + text);
//	}

//	5-2,5-3回答
//	public static void main(String[] args) {
//		String address = "nnn-70@gmai.com";
//		String text = "今日はいい天気だったから、お花畑をみてきたよ♡";
//		email(address,text);
//	}
//	
//	public static void email(String address, String text) {
//		System.out.println(address + "に以下のメールを送信しました");
//		System.out.println("件名:" + "無題");
//		System.out.println("本文:" + text);
//	}

//	この下のemailメソッドは引数は３個なので、今回のmainメソッドでは呼ばれなかった。
//	public static void email(String title, String address, String text) {
//		System.out.println(address + "に以下のメールを送信しました");
//		System.out.println("件名:" + title);
//		System.out.println("本文:" + text);
//	}

//	5-4
//	public static void main(String[] args) {
//		calcTriangleArea(10.0, 5.0);
//		calcCircleArea(5.0);
//	}
//
//	public static double calcTriangleArea(double bottom, double height) {
//		double ans = bottom * height / 2;
//		System.out.println(ans + "cm2");
//		return ans;
//	}
//
//	public static double calcCircleArea(double radius) {
//		double ans2 = radius * radius * 3.14;
//		System.out.println(ans2 + "cm2");
//		return ans2;
//	}

//	5-4回答
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積：" + triangleArea + "平方cm");
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積：" + circleArea + "平方cm");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double ans = (bottom * height) / 2;
		return ans;
	}

	public static double calcCircleArea(double radius) {
		double ans2 = radius * radius * 3.14;
		return ans2;
	}

}
