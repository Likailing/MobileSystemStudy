package com.example.preferenceactivitydemo1;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

public class SettingOneFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //PreferenceManager.setDefaultValues(getActivity(), ,false);
        addPreferencesFromResource(R.xml.setting_one_fragment);
    }
}
