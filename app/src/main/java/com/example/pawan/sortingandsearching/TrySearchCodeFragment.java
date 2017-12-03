package com.example.pawan.sortingandsearching;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Pawan on 03-12-2017.
 */

public class TrySearchCodeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view1 = inflater.inflate(R.layout.search_code_layout,container,false);
        Button button = view1.findViewById(R.id.searchbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText inputtext = (EditText) view1.findViewById(R.id.input);
                EditText inputnum = (EditText) view1.findViewById(R.id.inputnumber);
                String strnum = inputnum.getEditableText().toString();
                String inputarray = inputtext.getEditableText().toString();
                if(inputarray.equals("")||strnum.equals("")){
                    Snackbar.make(view1,"Empty String Found!!!!",Snackbar.LENGTH_INDEFINITE).show();
                }else {
                    Scanner scanner = new Scanner(inputarray);
                    ArrayList<Integer> input = new ArrayList<>();
                    while (scanner.hasNext()) {
                        input.add(scanner.nextInt());
                    }
                    int num = Integer.parseInt(strnum);
                    int a[] = new int[input.size()];
                    for (int i = 0; i < a.length; i++) {
                        a[i] = input.get(i);
                    }
                    String result = "";
                    int c = -1;
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] == num) {
                            result = "Number " + num + " is found at Position = " + (i + 1);
                            c++;
                            break;
                        }
                    }
                    if (c == -1) {
                        result = "Number " + num + " is not found ";
                    }
                    TextView resulttextView = (TextView) view1.findViewById(R.id.result);
                    resulttextView.setText(result);
                }
            }
        });

        return view1;
    }
}
