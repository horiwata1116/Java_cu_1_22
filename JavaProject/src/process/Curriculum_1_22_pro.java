package process;

import java.text.SimpleDateFormat;
import java.util.Date;

// 処理記述クラス
public class Curriculum_1_22_pro {
	
	// 現在時刻を取得
	Date currentDate = new Date();
	
	// 日付フォーマットを指定
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	// フォーマットに従って日付を文字列に変換
	String formattedDate = dateFormat.format(currentDate);
	
	// コンソールに出力
	public Curriculum_1_22_pro(){
		System.out.println("こんにちは！ここは日本です！");
		System.out.println("この寿司はうまい");
		System.out.println("寿司は和食です");
		System.out.println("今の現在日時は" + this.formattedDate + "です");
		}
}
