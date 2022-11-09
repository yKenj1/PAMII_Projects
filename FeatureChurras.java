package com.example.tcc_prototype;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class FeatureChurras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature_screen);

        public void response(){



        }

        Button btnReserva = findViewById(R.id.btnReserve);
        btnReserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                public void onCheckboxClicked(View view){

                    boolean check = ((CheckBox) view).isChecked();

                    switch(view.getId()){
                        case R.id.checkBox:
                            if (check){
                                AlertDialog.Builder popUp = new AlertDialog.Builder();
                                popUp.setMessage();

                            }else{

                            }
                    }
                }
            }
        });

    }
}