package com.reg155k;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btnDpi);
        Button btn2 = findViewById(R.id.btnTouch);
        Button btn3 = findViewById(R.id.btnCool);
        Button btn4 = findViewById(R.id.btnReset);

        btn1.setOnClickListener(v -> Toast.makeText(this, "Tăng DPI thành công!", Toast.LENGTH_SHORT).show());
        btn2.setOnClickListener(v -> Toast.makeText(this, "Đã tối ưu cảm ứng!", Toast.LENGTH_SHORT).show());
        btn3.setOnClickListener(v -> Toast.makeText(this, "Đã giảm nhiệt!", Toast.LENGTH_SHORT).show());
        btn4.setOnClickListener(v -> Toast.makeText(this, "Khôi phục hoàn tất!", Toast.LENGTH_SHORT).show());
    }
}
