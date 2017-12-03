package com.example.pawan.sortingandsearching;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by Pawan on 02-12-2017.
 */

public class ShowCodeFragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.show_code_layout,container,false);
        TextView view1 = view.findViewById(R.id.showcode);
        Bundle bundle = getArguments();
        int index = bundle.getInt("index");
        String code = MainActivity.List.get(index).getCode();
        view1.setMovementMethod(new ScrollingMovementMethod());
        view1.setText(code);
        return view;
    }
}
