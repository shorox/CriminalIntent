package com.spark.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by sharov on 27.05.2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
