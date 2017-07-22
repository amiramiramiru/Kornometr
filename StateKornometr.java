package com.example.amirh.kornometr;

/**
 * Created by amirh on 09/07/2017.
 */

public abstract class StateKornometr
{

	public void setSeconds(int seconds)
	{
		this.seconds = seconds;
	}

	public int getSeconds()
	{
		return seconds;
	}
    public abstract void start();
    public abstract void stop();
    public abstract void reset();

    private IKornometr kornometr;
	private int seconds
	
	

    public IKornometr getKornometr()
    {
        return kornometr;
    }

    public void setKornometr(IKornometr kornometrUi)
    {
        this.kornometr = kornometrUi;
    }
}
