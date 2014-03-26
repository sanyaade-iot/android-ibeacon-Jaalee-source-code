 package com.jaalee.ibeacon;
 
 import android.content.Context;

import com.jaalee.proximity.ibeacon.data.CloudIBeaconDataFactory;
import com.jaalee.proximity.licensing.LicenseManager;
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
 public class IBeaconDataFactorySetter
 {
   public IBeaconDataFactorySetter(LicenseManager licenseManager, Context context)
   {
     IBeacon.iBeaconDataFactory = new CloudIBeaconDataFactory(licenseManager, context, CloudIBeaconDataFactory.PROXIMITY_KIT_BACKEND);
   }
 }

