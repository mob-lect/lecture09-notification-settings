package edu.uw.notsetdemo;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by joelross on 4/24/17.
 */

public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);
    }

}
