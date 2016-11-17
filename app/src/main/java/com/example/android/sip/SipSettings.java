/*
 * Copyright (C) 2010 The Android Open Source Project
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

package com.example.android.sip;

import android.app.FragmentManager;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

/**
 * Handles SIP authentication settings for the Walkie Talkie app.
 */
public class SipSettings extends AppCompatActivity {

    private FragmentManager fragmentManager;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        // Note that none of the preferences are actually defined here.
        // They're all in the XML file res/xml/preferences.xml.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sipsettings);
        SipSettingsFragment sipSettingsFragment = new SipSettingsFragment();
        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent, new SipSettingsFragment()).commit();

    }

    public static class SipSettingsFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences);
        }
    }
}
