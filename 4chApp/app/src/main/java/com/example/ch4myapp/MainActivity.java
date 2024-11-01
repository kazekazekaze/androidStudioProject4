package com.example.ch4myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static final int clickId = R.id.btClick;
    static final int btreeId = R.id.btReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        MainClickListener listener = new MainClickListener();

        Button btClick = findViewById(R.id.btClick);
        btClick.setOnClickListener(listener);

        Button btReset = findViewById(R.id.btReset);
        btReset.setOnClickListener(listener);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }

    private class MainClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            EditText input = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();

            if(id == R.id.btClick) {
                String text = input.getText().toString();
                output.setText(text + "さん、こんにちは！");
            }else if(id == R.id.btReset) {
                output.setText("");
                input.setText("");
            }
        }
    }
}

