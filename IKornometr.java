package com.example.amirh.kornometr;

/**
 * Created by amirh on 10/07/2017.
 */

public interface IKornometr
{
    public void setState(StateKornometr state);

    public void setStartEnabled(boolean startEnabled);

    public void setPauseEnabled(boolean pauseEnabled);

    public void setStopEnabled(boolean stopEnabled);
}
