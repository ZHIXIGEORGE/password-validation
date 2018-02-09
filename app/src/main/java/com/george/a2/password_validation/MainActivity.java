package com.george.a2.password_validation;

/*import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
*/
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.Layout;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText1;
    TextView textView1;
    Layout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final Validator v = new Validator();
        button = (Button) findViewById(R.id.button);
        editText1 = (EditText) findViewById(R.id.editText1);
        textView1 = (TextView) findViewById(R.id.textView1);

        button.setOnClickListener(new View.OnClickListener() {//this method will set textview value to edittext
            @Override
            public void onClick(View view) {
                if (v.validate(editText1.getText().toString()) == 0)
                    textView1.setText("not strong password");
                else if (v.validate(editText1.getText().toString()) == 1)
                    textView1.setText("not strong password");
                else if (v.validate(editText1.getText().toString()) == 2)
                    textView1.setText("not strong password");
                else if (v.validate(editText1.getText().toString()) == 3)
                    textView1.setText("normal strong password");
                else if (v.validate(editText1.getText().toString()) == 4)
                    textView1.setText("normal strong password");
                else
                    textView1.setText("strong password");
            }
        });
    }
}
