package in.lavit.viewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("Welcome in Java Way....");
        setContentView(textView);
        //textView = findViewById(R.id.textViewName);
        //textView.setText("My Name is Girish Welcome.......");
    }
}
