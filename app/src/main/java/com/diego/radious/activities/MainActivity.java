package com.diego.radious.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.diego.radious.R;
import com.diego.radious.fragments.MainFragment;
import com.diego.radious.utilities.MyAppUtilities;


public class MainActivity extends AppCompatActivity {
    private MainFragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = new MainFragment();
        if (savedInstanceState == null)
            MyAppUtilities.changeFragment(R.id.container_main, mainFragment, this, MyAppUtilities.ADD, "Main_Fragment");
    }
}
