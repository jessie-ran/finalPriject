package swufe.com.finalpriject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity5 extends AppCompatActivity {
//去往该书籍的百科方式：https://baike.baidu.com/item/书的名字
    //豆瓣书评：https://www.douban.com/search?cat=1001&q=书的名字
    //修改和增添书单都可以用这个页面
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
}