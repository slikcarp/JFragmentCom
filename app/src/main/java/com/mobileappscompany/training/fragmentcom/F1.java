package com.mobileappscompany.training.fragmentcom;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class F1 extends Fragment {
    EditText eT1;
    Button bttn1;
    CheckBox chB;

    public F1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_f1, container, false);


        eT1 = (EditText) v.findViewById(R.id.eT1);
        bttn1 = (Button) v.findViewById(R.id.b1);
        chB = (CheckBox) v.findViewById(R.id.chB);

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMyText();
            }
        });


        return v;
    }

    private void sendMyText() {
        if(chB.isChecked()){
            sendWithInterface();
        }else{
            sendNoInterface();
        }

    }


    private void sendNoInterface() {
        MainActivity mA = (MainActivity) getActivity();
        mA.send22(eT1.getText().toString());
    }


    private void sendWithInterface() {
        F1Interface mA = (F1Interface) getActivity();
        mA.iSend22(eT1.getText().toString());
    }

    public void setMyEt(String s){
        eT1.setText(s);
    }


    public  interface F1Interface{
        public void iSend22(String s);
    }

}
