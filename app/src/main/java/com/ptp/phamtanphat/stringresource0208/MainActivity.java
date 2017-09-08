package com.ptp.phamtanphat.stringresource0208;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edttennguoidung,edtsodienthoai;
    Button btnxacnhan;
    TextView txtthongtin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        btnxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ten = edttennguoidung.getText().toString();
                String sodienthoai = edtsodienthoai.getText().toString().trim();

                String hovaten = getResources().getString(R.string.text_thongtin_hovaten);
                String sodt= getResources().getString(R.string.text_number);

                txtthongtin.setText(hovaten + " :" + ten + "\n" + sodt + " :" + sodienthoai);
            }
        });
    }

    private void anhxa() {
        edtsodienthoai = (EditText) findViewById(R.id.edittextsodienthoai);
        edttennguoidung = (EditText) findViewById(R.id.edittextten);
        btnxacnhan = (Button) findViewById(R.id.buttonxacnhan);
        txtthongtin = (TextView) findViewById(R.id.textviewthongtin);
    }
}
