package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
        //１　下記9個をローカル変数として宣言のみしてください			
		//・バイト型・短整数型・整数型・長整数型			
		//・単精度浮動小数点数型・倍精度浮動小数点数型			
		//・文字型・文字列型			
		//・ブーリアン型	
		byte byte1 ; //バイト型
		short short1 ; //短整数型
		int int1 ; //整数型
		long long1 ; //長整数型
		float float1 ; //単精度浮動小数点数型
		double doble1 ; //倍精度浮動小数点数型
		char char1 ; //文字型
		String string1 ; //文字列型
		boolean boolean1 ; //ブーリアン型
		
		//２　それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		byte1 = 0 ;
		short1 = 0 ;
		int1 = 0 ;
		long1 = 0 ;
		float1 = 0 ;
		doble1 = 0 ;
		char1 = '\u0000' ;
		string1 = null ;
		boolean1 = false ;
		
		//３　初期化をしたそれぞれの変数に下記の値を代入してください	
		byte1 = 10 ;
		short1 = 100 ;
		int1 = 1000 ;
		long1 = 10000 ;
		float1 = 9.5f ;
		doble1 = 10.5 ;
		char1 = 'a' ;
		string1 = "ハロー" ;
		boolean1 = true ;
		
		//４　下記の通りにコンソール出力されるようにしてください			
		//上記で作成した変数を必ず使用すること		

	 
		System.out.println( long1 + int1 + short1 + byte1 );
		System.out.println( float1 + doble1 );
		System.out.println( char1 + string1 + boolean1 );
		System.out.println( byte1 + byte1 + byte1 + short1 + int1 + long1 );
		System.out.println( byte1 * short1 * int1 * long1 );
		System.out.println( doble1 / 100 );
		System.out.println( byte1 - short1 );
		
		//５　「ハローJAVA43」

		
		//整数になってるのを文字列とする
		int num = 20 ;
		int num1 = 23 ;
		//ハローJAVA43を出力する処理
		System.out.println( "ハローJAVA" + ( num + num1 ));	
		
		//６
		//↓↓format↓↓		
		//「初めまして山田太郎です」		
		//「年齢は18歳です」		
		//「身長は170.5cmです」		
		//「体重は62.2kgです」		
		//「好きな食べ物は寿司です」		
		
		//名前
		String name = "山田太郎" ;
		//年齢
		int age = 18 ;
		//身長
		float height = 170.5f ;
	    //体重
		float weight = 62.2f ;
		//食べ物
		String food = "寿司" ;
		
		//上のをそれぞれ出力する処理
		System.out.println( "初めまして" + name + "です。" ) ;
		System.out.println( "年齢は" + age + "歳です。" ) ;
		System.out.println( "身長は" + height + "cmです。" ) ;
		System.out.println( "体重は" + weight + "kgです。" ) ;
		System.out.println( "好きな食べ物は" + food + "です。" ) ;
		
		//７　「BMIは○○です」					
		
		//bmiの値を出すための式
		double bmi = (weight / (( height / 100) * ( height / 100)) );
		//bmiの値を出力する処理
		System.out.println( "BMIは" + String.format( "%.1f", bmi ) + "です" );
		
		//８　6で宣言した変数に再代入し下記の通りコンソールに出力してください
		//　初めまして鈴木一郎です		
		//　年齢は24歳です		
		//　身長168.5cmです		
		//　体重は64.2kgです		
		//　好きな食べ物はオムライスです		
		//　BMIは22.6です		
		
		//名前
		name = "鈴木一郎" ;
		//年齢
		age = 24 ;
		//身長
		height = 168.5f ;
		//体重
		weight = 64.2f ;
		//食べ物
		food = "オムライス" ;
		//bmiの値出すための式
		bmi =  weight / (( height / 100) * ( height / 100)) ;
		
		//上のそれぞれ出力する値
		System.out.println( "初めまして" + name + "です。" ) ;
		System.out.println( "年齢は" + age + "歳です。" ) ;
		System.out.println( "身長は" + height + "cmです。" ) ;
		System.out.println( "体重は" + weight + "kgです。" ) ;
		System.out.println( "好きな食べ物は" + food + "です。" ) ;
		System.out.println( "BMIは" + String.format( "%.1f", bmi ) + "です" );
		
		
		
		//９　8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください								
		//初めまして鈴木一郎です								
		//年齢は48歳です								
		//身長337.0cmです								
		//体重は128.4kgです								
		//好きな食べ物はオムライスです								
		//BMIは11.31です	
		
		
		//和算で24に24足して48に
		age += 24 ;
		//168.5に168.5足して337.0に
		height += 168.5 ;
		//64.2に64.2足して128.4に
		weight += 64.2 ;
		//bmiの値を出すための式
		double bmi1 = weight / (( height / 100) * ( height / 100)) ;
		
		//それぞれを出力する処理
		System.out.println( "初めまして" + name + "です。" ) ;
		System.out.println( "年齢は" + age + "歳です。" ) ;
		System.out.println( "身長は" + height + "cmです。" ) ;
		System.out.println( "体重は" + weight + "kgです。" ) ;
		System.out.println( "好きな食べ物は" + food + "です。" ) ;
		System.out.println( "BMIは" + String.format( "%.1f", bmi1 ) + "です" );
		
		
		
		//１０　8で使用した年齢が25歳以上ならtrueが出力	
		
		//問９で数字が違くなってるから再度代入する
		age = 24 ;
		
		//論理値で宣言し、２５以上ならにする
		boolean age1 ;
		age1 = ( age >= 25 );
		//年齢が２５以上ならtrueが出力される処理
		System.out.println( age1 );
		
		
		//１１　8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力	
		
		//問９で数字が違くなってるから彩度代入する
		age = 24 ;
		height = 168.5f ;
		weight = 64.2f ;
		
		//文字列にするためにStringで宣言し、valueOfでそれぞれ引数を渡す
		String sa = String.valueOf ( age ) ;
		String sh = String.valueOf ( height ) ;
		String sw = String.valueOf ( weight ) ;
		
		//変換したものを出力する処理
		System.out.println(sa + sh + sw ) ;
		
		
		
		//１２　11で変換した【年齢・身長】を整数型に変換して出力				
		
		//文字列を整数に変換するため、parseIntで引数を渡す
		age = Integer.parseInt( sa ) ;
		
		//小数点があるため整数を切り捨てする。Double.parseDoublesで引数を渡す
		int i = ( int )Double.parseDouble( sh ) ;
		
		//二つ並べて出力する処理
		System.out.println( age + "・" + i ) ;
		
		
		
		//１３　12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力
		//ただしif文は使わないでください		
		
		//論理値を宣言
		boolean age2 ;
		//論理演算子使って、条件を二つにする
		age2 = ( age >= 25 || height >= 160 ); 
		
		//年齢が２５もしくは身長が１６０以上を出力する処理
		System.out.println( age2 );
		
		
		
		
	}

}
