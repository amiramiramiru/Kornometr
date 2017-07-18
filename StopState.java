package com.example.amirh.kornometr;

/**
 * Created by amirh on 10/07/2017.
 */

public class StopState extends StateKornometr
{
    public StopState(IKornometr k)
    {
        setKornometr(k);
        k.setStopEnabled(false);
        k.setPauseEnabled(false);
        k.setStartEnabled(true);
    }

    @Override
    public void start()
    {

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
