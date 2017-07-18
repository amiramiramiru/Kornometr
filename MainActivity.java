package com.example.amirh.kornometr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements IKornometr
{
    Button btnStart;
    Button btnStop;
    Button btnReset;
    TextView txtTime;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.state = new s0(this);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
        btnReset = (Button) findViewById(R.id.btnReset);
        txtTime =(TextView)findViewById(R.id.editTextTime);
    }

    StateKornometr state;

    @Override
    public void setState(StateKornometr state)
    {
        this.state = state;
    }

    @Override
    public void setStartEnabled(boolean startEnabled)
    {
        btnStart.setEnabled(startEnabled);
    }

    @Override
    public void setPauseEnabled(boolean pauseEnabled)
    {
        btnStop.setEnabled(pauseEnabled);
    }

    @Override
    public void setStopEnabled(boolean stopEnabled)
    {
        btnStop.setEnabled(stopEnabled);
    }

    public void onClickStart(View v)
    {
        Log.i("start clicked","Start btn");
        state.start();
    }

    public void onClickStop(View v)
    {
        state.stop();
    }

    public void onClickReset(View v)
    {
        state.pause();
    }

    @Override
    public void setTime(String time)
    {
        txtTime.setText(time);
    }
}
