package jp.techacademy.takuro.ueda.javakadai;
import android.util.Log;
/*
 Created by ueda_palsbots on 2017/07/17.
 */
class Human extends Animal implements Thinkable {
    static String to_jp = "人間";
//to_jpとは何。これは犬クラスです、はどこへ
    String hobby;

public Human (String name, int age,String hobby) {
                this.name = name;
                this.age = age;
                this.hobby = hobby;
         }

public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。");
        Log.d("javatest", "年は" + this.age + "歳です。");
}

@Override
public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");
        }
        }