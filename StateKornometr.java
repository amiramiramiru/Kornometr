package com.example.amirh.kornometr;

/**
 * Created by amirh on 09/07/2017.
 */

public abstract class StateKornometr
{
    public abstract void start();
    public abstract void stop();
    public abstract void pause();

    private IKornometr kornometr;

    public IKornometr getKornometr()
    {
        return kornometr;
    }

    public void setKornometr(IKornometr kornometrUi)
    {
        this.kornometr = kornometrUi;
    }
}
