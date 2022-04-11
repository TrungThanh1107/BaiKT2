package NguyenTrungThanh.BaiKT2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton rd13=(RadioButton) findViewById(R.id.radio1);
    RadioButton rd15=(RadioButton) findViewById(R.id.radio2);
    RadioButton rd18=(RadioButton) findViewById(R.id.radio3);
    Button btn =(Button) findViewById(R.id.btn);
    TextView ketqua=(TextView) findViewById(R.id.ketqua);
    EditText edit =(EditText) findViewById(R.id.edit);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}