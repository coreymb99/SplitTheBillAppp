package com.example.splitthebillapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class billSplitPage extends AppCompatActivity {

    //Declaring Variables

    double totalBill;
    double finalBill;
    double tipBill;
    int numOfPeople;
    double tip = 0.18;
    String grpQuality;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_split_page);

        //Finalizing Variables

        final EditText bill = (EditText) findViewById(R.id.hntBill);
        final EditText grpNumber = (EditText) findViewById(R.id.hntGroup);

        //Finalize the Spinner

        final Spinner spnQuality = (Spinner) findViewById(R.id.spnQuality);

        //Calculate Button
        //toString totalBill

        final Button btnCalculate = (Button) findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {

            final TextView result = ((TextView)findViewById(R.id.txtBill));
            @Override
            public void onClick(View v) {
                //parse
                numOfPeople = Integer.parseInt(grpNumber.getText().toString());
                totalBill = Double.parseDouble(bill.getText().toString());
                tipBill = totalBill *tip;
                finalBill = (tipBill + totalBill) / numOfPeople;
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                grpQuality = spnQuality.getSelectedItem().toString();
                result.setText("Total Bill = " + totalBill + "\nTip amount: = " + currency.format(tipBill) + "\nIndividual Share is = " + currency.format(finalBill));


            }
        });
    }
}
//Corey Bartlett
//SPC ID 2374833
