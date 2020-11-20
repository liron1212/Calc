package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private double ANumber, BNumber, CNumber;
private TextView x1, x2;
private EditText AEdit, BEdit, CEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AEdit=findViewById(R.id.editTextNumber);
        BEdit=findViewById(R.id.editTextNumber3);
        CEdit=findViewById(R.id.editTextNumber2);
        x1=findViewById(R.id.textView);
        x2=findViewById(R.id.textView2);
        AEdit.addTextChangedListener(edittext);

    }

    public void calc(View view) {
        x1.setText("x1="+(-1*BNumber+Math.sqrt(BNumber*BNumber)-4*ANumber*CNumber)/(2*ANumber));
        x2.setText("x2="+(-1*BNumber-Math.sqrt(BNumber*BNumber)-4*ANumber*CNumber)/(2*ANumber));
    }
    private TextWatcher edittext = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            try {
                ANumber = Double.parseDouble(AEdit.getText().toString());
                BNumber = Double.parseDouble(BEdit.getText().toString());
                CNumber = Double.parseDouble(CEdit.getText().toString());
            }
            catch (NumberFormatException e){

            }

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}