package swufe.com.finalpriject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
//这是注册界面
    RadioGroup radiogroup;
    RadioButton femalebutton;
    RadioButton malebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        radiogroup=(RadioGroup)findViewById(R.id.radioGroupId);

        femalebutton=(RadioButton)findViewById(R.id.femaleButtonId);

        malebutton=(RadioButton)findViewById(R.id.maleButtonId);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        RadioButton ra1=(RadioButton)findViewById(group.getCheckedRadioButtonId());
        String str="femalebutton";
        if  (ra1.getText().toString().equals(str)){
           // Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();
        }
    }
}