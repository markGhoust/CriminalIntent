package com.ma.fengping.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by android on 17-12-15.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
