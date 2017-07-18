package com.example.amirh.kornometr;

import android.os.Handler;
import android.util.Log;

/**
 * Created by amirh on 10/07/2017.
 */

public class StartState extends StateKornometr
{
    int Seconds = 0;

    public void setSeconds(int seconds)
    {
        Seconds = seconds;
    }

    boolean stop;

    public StartState(IKornometr k)
    {
        setKornometr(k);
        k.setStartEnabled(false);
        k.setPauseEnabled(true);
        k.setStopEnabled(true);
        runTimer();
    }

    private void runTimer()
    {
        final Handler h = new Handler();
        h.post(new Runnable()
        {
            @Override
            public void run()
            {
                Seconds++;

                int hours = Seconds/3600;
                int minutes = (Seconds%3600)/60;
                int secs = Seconds%60;
                String time = String.format("%d:%02d:%02d",
                        hours, minutes, secs);

                if (getKornometr() == null)
                    Log.i("k","null ast");

                getKornometr().setTime(time);
                if (!stop)
                h.postDelayed(this,1000);
            }
        });
    }

    @Override
    public void start()
    {

    }

    @Override
    public void stop()
    {
        stop = true;
        IKornometr k = getKornometr();
        StateKornometr s = new StopState(k);
        k.setState(s);
    }

    @Override
    public void pause()
    {
        stop = true;
        IKornometr k = getKornometr();
        StateKornometr s = new PauseState(k);
        ((PauseState)s).setSeconds(this.Seconds);
        k.setState(s);
    }
}
