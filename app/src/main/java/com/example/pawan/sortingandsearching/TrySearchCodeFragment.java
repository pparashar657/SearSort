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
                TextView resulttextView = (TextView) view1.findViewById(R.id.result);
                int q;
                for(q=0;q<strnum.length();q++){
                    if(strnum.charAt(q)==' ')
                        break;
                }
                strnum = strnum.substring(0,q);
                int p = 0;
                for(int i=0;i<inputarray.length();i++){
                    char temp = inputarray.charAt(i);
                    if(!Character.isDigit(temp)&&temp!=' ') {
                        p++;
                    }
                }
                for(int i=0;i<strnum.length();i++){
                    char temp = strnum.charAt(i);
                    if(!Character.isDigit(temp)&&temp!=' ') {
                        p++;
                    }
                }
                if(inputarray.length()==0||strnum.length()==0){
                    p=1;
                }
                if(p>0){
                    resulttextView.setText("");
                    Snackbar.make(view1,"BAD INPUT FOUND!!!!",Snackbar.LENGTH_LONG).show();
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
                    resulttextView.setText(result);
                }
            }
        });

        return view1;
    }
}
