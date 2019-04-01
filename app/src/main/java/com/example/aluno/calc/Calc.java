package com.example.aluno.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calc extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private Button mais;
    private Button menos;
    private Button vezes;
    private Button ac;
    private Button igual;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        n1 = (EditText) findViewById(R.id.editTextn1);
        n2 = (EditText) findViewById(R.id.editTextn2);
        mais = (Button) findViewById(R.id.buttonmais);
        menos = (Button) findViewById(R.id.buttonmenos);
        vezes = (Button) findViewById(R.id.buttonvezes);
        ac = (Button) findViewById(R.id.buttonac);
        igual = (Button) findViewById(R.id.buttonigual);
        result = (TextView) findViewById(R.id.textViewresult);

        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                } catch (Exception E){

                }
            }
        });

    }
}
