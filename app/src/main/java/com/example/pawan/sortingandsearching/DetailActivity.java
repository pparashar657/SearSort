package com.example.pawan.sortingandsearching;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView mTextMessage;
    int index;
    String mode;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_code:
                    showcode();
                    return true;
                case R.id.navigation_trycode:
                    trycode();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        index = intent.getIntExtra("index",-1);
        mode = intent.getStringExtra("mode");
        setTitle(MainActivity.List.get(index).getTitle());
        showcode();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void showcode(){
        ShowCodeFragment codeFragment = new ShowCodeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("index",index);
        codeFragment.setArguments(bundle);
        setFragment(codeFragment);
    }

    public void trycode(){
        if (mode.equals("sort")){
            TrySortCodeFragment sortCodeFragment = new TrySortCodeFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("index",index);
            sortCodeFragment.setArguments(bundle);
            setFragment(sortCodeFragment);
        }else if(mode.equals("search")){
            TrySearchCodeFragment searchCodeFragment = new TrySearchCodeFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("index",index);
            searchCodeFragment.setArguments(bundle);
            setFragment(searchCodeFragment);
        }
    }

    public void setFragment(android.support.v4.app.Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.mycontainer,fragment);
        transaction.commit();
    }

}
