package com.example.arwa_ahmed.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText amount1 = (EditText) findViewById(R.id.amount1);
        amount1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    Double firstAmountDb = Double.parseDouble(amount1.getText().toString());

                    EditText amount2 = (EditText) findViewById(R.id.amount2);
                    Double secondAmountDb= firstAmountDb * 0.6;

                    amount2.setText(secondAmountDb.toString());


                    handled = true;
                    setContentView(R.layout.activty_main);
                }
                return handled;
            }
        });



    }
}
