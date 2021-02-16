package com.minhdurbin.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    //reference variables for text boxes
    private EditText totalAmount;
    private EditText taxAmount;
    private TextView tipAmount;
    private TextView grandTotal;

    //reference variables for RadioGroup and RadioButton
    private RadioGroup radioGroup;
    private RadioButton zeroRadio;
    private RadioButton fiveRadio;
    private RadioButton tenRadio;
    private RadioButton twentyRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reference for text boxes
        totalAmount = findViewById(R.id.totalAmountTextBox);
        taxAmount = findViewById(R.id.taxAmountTextBox);
        tipAmount = findViewById(R.id.tipAmountTextBox);
        grandTotal = findViewById(R.id.grandTotalTextBox);

        //reference for radio group and radio button
        radioGroup = findViewById(R.id.radioGroup);
        zeroRadio = findViewById(R.id.zeroRadio);
        fiveRadio = findViewById(R.id.fiveRadio);
        tenRadio = findViewById(R.id.tenRadio);
        twentyRadio = findViewById(R.id.twentyRadio);

    }

    public void clear(View view) {
        totalAmount.setText("");
        taxAmount.setText("");
        tipAmount.setText("");
        grandTotal.setText("");
        zeroRadio.setChecked(true);
    }

    public void submit(View view) {
        double totAmount;
        double taAmount;
        double tiAmount = 0;
        double gTotal = 0;

        try {
            totAmount = Double.parseDouble(totalAmount.getText().toString());
        }
        catch (NumberFormatException e)
        {
            totAmount = 0;
        }
        try {
            taAmount = Double.parseDouble(taxAmount.getText().toString());
        }
        catch (NumberFormatException e)
        {
            taAmount = 0;
        }

        taAmount = Double.parseDouble(taxAmount.getText().toString());

        if(zeroRadio.isChecked()){
            tiAmount = 0 * totAmount;
        }
        else if(fiveRadio.isChecked()){
            tiAmount = 0.05 * totAmount;
        }
        else if(tenRadio.isChecked()){
            tiAmount = 0.10 * totAmount;
        }
        else if(twentyRadio.isChecked()){
            tiAmount = 0.20 * totAmount;
        }
        //format number of decimal places
        DecimalFormat df = new DecimalFormat("#,###.00");
        //currency format
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        //grand total
        gTotal = tiAmount + taAmount + totAmount;

        tipAmount.setText(cf.format(tiAmount));
        grandTotal.setText(cf.format(gTotal));





    }
}