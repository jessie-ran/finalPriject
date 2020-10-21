package swufe.com.finalpriject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity4 extends AppCompatActivity {
//这里要开始做列表和做下拉框
    //做书架的展示
    //增加新的书籍和修改原来的内容都可以是一个页面，这里指都可以是5
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.jump,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_set2:
                Intent settingIntent = new Intent(this,MainActivity6.class);
                startActivity(settingIntent);
                break;
            case R.id.menu_set3:
                Intent regardIntent = new Intent(this,MainActivity7.class);
                startActivity(regardIntent);
                break;
        }
        return true;
    }

}