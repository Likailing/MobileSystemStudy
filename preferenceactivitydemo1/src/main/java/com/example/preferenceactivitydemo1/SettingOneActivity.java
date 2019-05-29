package com.example.preferenceactivitydemo1;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.annotation.Nullable;

import java.util.List;


public class SettingOneActivity extends PreferenceActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        * 如果要加上布局，布局里面必须有个ListView,且id必须命名为：@android:id/list
        * 不然会报错：RuntimeException: Your content must have a ListView whose id attribute is 'android.R.id.list'
        * */
        setContentView(R.layout.activity_setting_one);
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
