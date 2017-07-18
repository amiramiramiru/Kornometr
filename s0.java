package com.example.amirh.kornometr;

import android.net.NetworkInfo;
import android.util.Log;

/**
 * Created by amirh on 10/07/2017.
 */

public class s0 extends StateKornometr
{
    public s0(IKornometr k)
    {
        setKornometr(k);
    }

    @Override
    public void start()
    {
        IKornometr k = getKornometr();
        StateKornometr s = new StartState(k);
        k.setState(s);
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
