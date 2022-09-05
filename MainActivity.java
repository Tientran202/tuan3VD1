package com.example.tuan3_vd1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nang, cao;
    Button buttonBMi;
    TextView kqChu,kqSo;

    float canNang,chieuCao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nang = findViewById(R.id.nang);
        cao = findViewById(R.id.cao);
        buttonBMi = findViewById(R.id.buttonBMI);
        kqChu = findViewById(R.id.kqChu);
        kqSo = findViewById(R.id.kqSo);





    }

    public void nhan(View view) {
        float BMI;

        canNang = Float.valueOf(nang.getText().toString().trim());
        chieuCao = Float.valueOf(cao.getText().toString().trim());

        BMI = canNang / (chieuCao*chieuCao);
        kqSo.setText(String.valueOf("Chỉ số cơ thể của bạn là:" +BMI));
        if (BMI <18 ){
            kqChu.setText("Người gầy");
        }else if(BMI<24.9){
            kqChu.setText("Người bình thường");

        }else if(BMI < 29.9){
            kqChu.setText("Béo phì cấp độ I");

        }else if(BMI < 34.9){
            kqChu.setText("Béo phì cấp độ II");

        }else{
            kqChu.setText("Béo phì cấp độ III");
        }



    }
}