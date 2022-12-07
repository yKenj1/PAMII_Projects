package com.example.tcc_prototype;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class FeatureChurras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature_screen);

        Button btnReserva = findViewById(R.id.btnReserve);
        btnReserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                public void onCheckboxClicked(View view){

                    boolean check = ((CheckBox) view).isChecked();

                    switch(view.getId()){
                        case R.id.checkBox:
                            if (check){
                                AlertDialog.Builder popUp = new AlertDialog.Builder(this);
                                popUp.setMessage("Reserva concluída com sucesso");
                                popUp.setNeutralButton("Ok", null);
                                popUp.show();

                            }else{
                                AlertDialog.Builder popUp = new AlertDialog.Builder(this);
                                popUp.setMessage("Reserva retirada com sucesso");
                                popUp.setNeutralButton("Ok", null);
                                popUp.show();

                            }
                        case R.id.checkBox2:
                            if (check){
                                AlertDialog.Builder popUp = new AlertDialog.Builder(this);
                                popUp.setMessage("Reserva concluída com sucesso");
                                popUp.setNeutralButton("Ok", null);
                                popUp.show();

                            }else{
                                AlertDialog.Builder popUp = new AlertDialog.Builder(this);
                                popUp.setMessage("Reserva retirada com sucesso");
                                popUp.setNeutralButton("Ok", null);
                                popUp.show();

                            }
                        case R.id.checkBox3:
                            if (check){
                                AlertDialog.Builder popUp = new AlertDialog.Builder(this);
                                popUp.setMessage("Reserva concluída com sucesso");
                                popUp.setNeutralButton("Ok", null);
                                popUp.show();

                            }else{
                                AlertDialog.Builder popUp = new AlertDialog.Builder(this);
                                popUp.setMessage("Reserva retirada com sucesso");
                                popUp.setNeutralButton("Ok", null);
                                popUp.show();

                            }
                        case R.id.checkBox4:
                            if (check){
                                AlertDialog.Builder popUp = new AlertDialog.Builder(this);
                                popUp.setMessage("Reserva concluída com sucesso");
                                popUp.setNeutralButton("Ok", null);
                                popUp.show();

                            }else{
                                AlertDialog.Builder popUp = new AlertDialog.Builder(this);
                                popUp.setMessage("Reserva retirada com sucesso");
                                popUp.setNeutralButton("Ok", null);
                                popUp.show();

                            }
                    }
                };
            }
        });

        Button btnFinish = findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}