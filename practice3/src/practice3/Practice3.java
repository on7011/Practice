package practice3;

public class Practice3 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i * j); // 掛け算の結果を出力
				System.out.println(" "); // 空白を出力
			}
			System.out.println(""); // 改行を出力
		}

		int isHungry = 0;

		String food = "パンケーキ";

		System.out.println("こんにちは");

		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
		}

		if (isHungry == 3) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした！");

		System.out.println("[メニュー]1:検索 2:登録 3:削除 4:変更＞");
		int selected = 4;
		switch (selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}

		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i++) {
			System.out.println("0~9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("あたり！");
				break; // 出来なかったところ if(num != ans)と書いてしまった。
			} else {
				System.out.println("はずれ");
			}
			System.out.println("ゲームを終了します");
		}
		
	

	}

}
