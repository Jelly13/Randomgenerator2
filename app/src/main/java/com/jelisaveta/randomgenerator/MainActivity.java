package com.jelisaveta.randomgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText max_broj = (EditText)findViewById(R.id.unetibroj);
        final Button dugme = (Button)findViewById(R.id.dugmence);
        dugme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int max = 6;
                try {
                    max = parseInt(max_broj.getText().toString());
                }
                catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Invalid number", Toast.LENGTH_SHORT).show();
                }
                int MIN = 1;
                Random rand = new Random();
                int r_broj = rand.nextInt(max-MIN+1) + MIN;
                TextView izlaz = (TextView)findViewById(R.id.ekran);
                izlaz.setText(getResources().getString(R.string.random_broj_je, r_broj));
                //Toast t = Toast.makeText(MainActivity.this, r_broj+"", Toast.LENGTH_SHORT);
                //t.show();
                
            }
        });
    }
}
