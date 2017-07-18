package jp.techacademy.takuro.ueda.javakadai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Human implements Thinkable {
    Human human = new Human("太郎", 25, "散歩");

    human.say();
        Log.d("javatest","私の名前は" + name + "です。");
        Log.d("javatest","年は" + age + "歳です。");

    human.think();
        Log.d("javatest","私は" + hobby + "について考える");

}
//何も継承されていない

/*抽象クラスAnimalを継承したHumanクラスを定義し、生成したインスタンスのsayメソッドで
「私の名前は〜〜です。年は〜〜歳です。」（〜〜はメンバ変数から取得）というLogを出力させてください。
        thinkメソッドを持つThinkableインタフェースを作成し、Humanクラスに実装させてください。
        Humanクラスにはhobbyという文字列型のメンバ変数を用意し、thinkメソッドを呼び出すと
        「私は〜〜について考える」（〜〜はhobbyから取得）というLogを出力させてください。
        Humanクラスの各メンバ変数の初期化はコンストラクタ内で行い、インスタンス毎に異なる値が設定できるようにして下さい。*/