package com.example.amirh.kornometr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IKornometr
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.state = new s0();
        state.setKornometr(this);
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

    }

    @Override
    public void setPauseEnabled(boolean pauseEnabled)
    {

    }

    @Override
    public void setStopEnabled(boolean stopEnabled)
    {

    }
}
