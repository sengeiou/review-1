package com.review.fragment.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.review.fragment.R;

/**
 * @author zhangquan
 */
public class AdapterAct extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
    }

    public void pagerAdapter(View view) {
        startActivity(new Intent(this, FragmentPagerAdapterAct.class));
    }

    public void statePagerAdapter(View view) {
        startActivity(new Intent(this, FragmentStatePagerAdapterAct.class));
    }

    public void tabActivity(View view) {
        startActivity(new Intent(this, TabAct.class));
    }
}
