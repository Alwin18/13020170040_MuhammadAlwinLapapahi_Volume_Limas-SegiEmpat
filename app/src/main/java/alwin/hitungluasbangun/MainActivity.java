package alwin.hitungluasbangun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText sisi;
    private EditText tinggi;
    private Button hitung;
    private TextView volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        iniEvent();
    }

    private void iniEvent() {
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HitungVolume();
            }
        });
    }

    private void HitungVolume() {
        int S = Integer.parseInt(sisi.getText().toString());
        int T = Integer.parseInt(tinggi.getText().toString());
        double V = S*S*T*0.333;
        volume.setText("Volume Limas : "+V);
    }

    private void initUI() {
        sisi = (EditText)findViewById(R.id.sisi);
        tinggi = (EditText)findViewById(R.id.tinggi);
        volume = (TextView)findViewById(R.id.volume);
        hitung = (Button)findViewById(R.id.hitung);
    }
}
