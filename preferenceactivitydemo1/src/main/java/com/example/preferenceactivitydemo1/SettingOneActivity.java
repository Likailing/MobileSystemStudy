package com.example.preferenceactivitydemo1;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.annotation.Nullable;

import java.util.List;


public class SettingOneActivity extends PreferenceActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onBuildHeaders(List<Header> target) {
        super.onBuildHeaders(target);
        //加载选项列表布局
        loadHeadersFromResource(R.xml.setting_one_pref_headers,target);
    }

    /**
    * 验证Preference是否有效
     * @param fragmentName
     * @return
    * */
    @Override
    protected boolean isValidFragment(String fragmentName) {
        return true;
    }
}
