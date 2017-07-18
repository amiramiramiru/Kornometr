package com.example.amirh.kornometr;

import android.support.v4.view.animation.FastOutLinearInInterpolator;

/**
 * Created by amirh on 10/07/2017.
 */

public class PauseState extends StateKornometr
{
    int Seconds = 0;

    public void setSeconds(int seconds)
    {
        Seconds = seconds;
    }

    public PauseState(IKornometr k)
    {
        setKornometr(k);
        k.setPauseEnabled(false);
        k.setStartEnabled(true);
        k.setStopEnabled(true);
    }

    @Override
    public void start()
    {
        StateKornometr s = new StartState(getKornometr());
        ((StartState)s).setSeconds(this.Seconds);
        getKornometr().setState(s);
    }

    @Override
    public void stop()
    {
    }

    @Override
    public void pause()
    {

    }
}
