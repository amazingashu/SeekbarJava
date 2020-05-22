package com.acrony.seekbarjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
SeekBar sbbar;
TextView tbvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbbar=(SeekBar)findViewById(R.id.seekbar);
        tbvalue=(TextView) findViewById(R.id.textView);

        sbbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(getApplicationContext(),"Seekbar Progress"+progress,
                        Toast.LENGTH_SHORT).show();
                tbvalue.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Seekbar Touch Start",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Seekbar touch Stoppped",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
