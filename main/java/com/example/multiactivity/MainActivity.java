package com.example.multiactivity;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    ActivityResultLauncher<Intent> ActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        // There are no request codes
                        Intent data = result.getData();
                        // doSomeOperations();
                        TextView bemVindo = findViewById(R.id.bemVindo);
                        bemVindo.setText("olá, " + data.getStringExtra("user_name"));
                    } else {
                        TextView bemVindo = findViewById(R.id.bemVindo);
                        bemVindo.setText("Deu ruim");
                    }
                }
            });
    public void callActivityForResult() {
        Intent intent = new Intent(this, third_activity.class);
        ActivityResultLauncher.launch(intent);
    }
    public void openActivity(View view, Class myClass) {
        Intent intent = new Intent(this, myClass);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botaoAct2 = findViewById(R.id.abreAct2);
        botaoAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(view, second_activity.class);
            }
        });
        Button botaoAct3 = findViewById(R.id.abreAct3);
        botaoAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callActivityForResult();
            }
        });
    }
}