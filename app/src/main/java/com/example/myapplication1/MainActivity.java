package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvllello;
    private static String TAG= "MainActivity";

    EditText edta, edtb, edtc;
    Button btnluu;
    RadioButton rbnam, rbnu;
    CheckBox cba, cbb;
    FrameLayout FL;
    TextView TV;
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");
        // anh xa toi các control thông qua id
        edta = findViewById(R.id.edta);
        edtb = findViewById(R.id.edtb);
        edtc = findViewById(R.id.edtc);
        rbnam = findViewById(R.id.rbnam);
        rbnu = findViewById(R.id.rbnu);
        cba = findViewById(R.id.cba);
        cbb = findViewById(R.id.cbb);

        btnluu = findViewById(R.id.btnLuu);
        // xu ly su kien onclick tren nut tinh tong
        btnluu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy giá trị từ các EditText và các control khác
                String valueA = edta.getText().toString();
                String valueB = edtb.getText().toString();
                String valueC = edtc.getText().toString();
                boolean isNamSelected = rbnam.isChecked();
                boolean isNuSelected = rbnu.isChecked();
                boolean isCheckboxASelected = cba.isChecked();
                boolean isCheckboxBSelected = cbb.isChecked();

                // Tạo một đối tượng StringBuilder để xây dựng nội dung
                StringBuilder result = new StringBuilder();
                result.append("Tôi tên: ").append(valueA).append("\n");
                result.append("MSSV: ").append(valueB).append("\n");
                result.append("Tuổi: ").append(valueC).append("\n");
                result.append("Giới tính: ").append(isNamSelected ? "Nam" : "Nữ").append("\n");
                result.append("Sở thích: ").append(isCheckboxASelected ? "Đá bóng" : "Chơi game").append("\n");

                displayResultInTextView(result.toString());
            }
        });
    }
    private void displayResultInTextView(String result) {
        // Tìm đối tượng TextView theo ID
        TextView textView = findViewById(R.id.TV);

        // Đặt văn bản cho TextView
        textView.setText(result);
    }
}