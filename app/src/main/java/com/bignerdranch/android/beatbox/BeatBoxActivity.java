package com.bignerdranch.android.beatbox;
import android.app.Fragment;

//import android.support.v4.app.Fragment; Not using this one
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BeatBoxActivity extends SingleFragmentActivity {

   @Override
    protected Fragment createFragment(){
       return BeatBoxFragment.newInstance();

    }
}
