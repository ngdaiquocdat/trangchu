package com.reg155k;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;

public class Reg155kPanelApp extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(16, 16, 16, 16);

        Button btn1 = new Button(this);
        btn1.setText("Tăng DPI");
        layout.addView(btn1, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        Button btn2 = new Button(this);
        btn2.setText("Tối ưu cảm ứng");
        layout.addView(btn2, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        Button btn3 = new Button(this);
        btn3.setText("Giảm nhiệt");
        layout.addView(btn3, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        Button btn4 = new Button(this);
        btn4.setText("Khôi phục");
        layout.addView(btn4, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        setContentView(layout);

        btn1.setOnClickListener(v -> Toast.makeText(this, "Tăng DPI thành công!", Toast.LENGTH_SHORT).show());
        btn2.setOnClickListener(v -> Toast.makeText(this, "Đã tối ưu cảm ứng!", Toast.LENGTH_SHORT).show());
        btn3.setOnClickListener(v -> Toast.makeText(this, "Đã giảm nhiệt!", Toast.LENGTH_SHORT).show());
        btn4.setOnClickListener(v -> Toast.makeText(this, "Khôi phục hoàn tất!", Toast.LENGTH_SHORT).show());
    }
}
