package ntu.vuquanglang.simplewidgetapp59cntt2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView txtKQ;
        EditText edtSoa;
         EditText edtSob;
        RadioGroup rdgPheptinh;
        Button btnTinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvent();
    }


    private void addViews()
        {
            txtKQ = findViewById(R.id.txtKQ);
            edtSoa = findViewById(R.id.editSốa);
            edtSob = findViewById(R.id.editSốb);
            rdgPheptinh = findViewById(R.id.rdgPheptinh);
            btnTinh = findViewById(R.id.btnTinh);

        }
        private void addEvent()
        {
            btnTinh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tinhToan();
                }
            });
        }
        private void tinhToan()
        {
            float Soa = Float.parseFloat(edtSoa.getText().toString());
            float Sob = Float.parseFloat(edtSob.getText().toString());
            float KQ;
            switch (rdgPheptinh.getCheckedRadioButtonId())
            {
                case R.id.rdbCộng:
                    KQ = Soa + Sob;
                    txtKQ.setText(new Float(KQ).toString());
                    break;
                case R.id.rdbTrừ:
                    KQ = Soa - Sob;
                    txtKQ.setText(new Float(KQ).toString());
                    break;
                case R.id.rdbNhân:
                    KQ = Soa * Sob;
                    txtKQ.setText(new Float(KQ).toString());
                    break;
                case R.id.rdbChia:
                    try {
                        KQ = Soa + Sob;
                    txtKQ.setText(new Float(KQ).toString());
                    break;
                    } catch (Exception e) {
                        txtKQ.setText("Lỗi chia cho 0");
                    }


            }
        }



    }

