package com.jaalee.ibeacon;
/**
 * This project is for developers to make a reference, 
 * but not for commercial purposes. If you have any questions when you use the codes, 
 * or you need the source codes which can be used for commercial purposes, please contact us directly.
 * 
 * @author Alvin.Bert
 * 
 * Technology Support: Alvin.Bert.hu@gmail.com
 * 
 * International Sales: Service@jaalee.com
 * 
 * Jaalee, Inc.
 * 
 * http://www.jaalee.com/
 */
public abstract interface MonitorNotifier
{
  public static final int INSIDE = 1;
  public static final int OUTSIDE = 0;

  public abstract void didEnterRegion(Region paramRegion);

  public abstract void didExitRegion(Region paramRegion);

  public abstract void didDetermineStateForRegion(int paramInt, Region paramRegion);
}

