/*
 * Copyright (C) 2012 CyanogenMod
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.warped;

import android.app.ActivityManagerNative;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.util.Log;
import android.view.IWindowManager;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.Utils;

public class WarpedSettings extends SettingsPreferenceFragment {
    private static final String TAG = "WarpedSettings";
	
    private static final String KEY_NOTIFICATION_DRAWER_POWER_WIDGET = "notification_drawer_power_widget";
    private static final String KEY_NOTIFICATION_DRAWER_TOGGLES = "notification_drawer_toggles";
    private static final String KEY_NOTIFICATION_DRAWER_TABLET = "notification_drawer_tablet";
    private static final String KEY_NAVIGATION_BAR = "navigation_bar";
    private static final String KEY_HARDWARE_KEYS = "hardware_keys";
	
    private PreferenceScreen mPhoneDrawer;
    private PreferenceScreen mPhoneToggles;
    private PreferenceScreen mTabletDrawer;
    private PreferenceScreen mHardwareKeys;
	
    private final Configuration mCurConfig = new Configuration();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.warped_settings);
	}	
}