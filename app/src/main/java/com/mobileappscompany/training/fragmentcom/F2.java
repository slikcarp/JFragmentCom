package com.mobileappscompany.training.fragmentcom;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class F2 extends Fragment {
    EditText eT2;
    Button bttn2;


    public F2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_f2, container, false);


        eT2 = (EditText) v.findViewById(R.id.eT2);
        bttn2 = (Button) v.findViewById(R.id.b2);

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMyText();
            }
        });


        return v;
    }

    private void sendMyText() {
        sendNoInterface();
//        sendWithInterface();
    }

    private void sendNoInterface() {
        MainActivity mA = (MainActivity) getActivity();
        mA.send21(eT2.getText().toString());
    }


    private void sendWithInterface() {
        F2.F2Interface mA = (F2.F2Interface) getActivity();
        mA.send21(eT2.getText().toString());
    }


    public void setMyEt(String s){
        eT2.setText(s);
    }

    public  interface F2Interface{
        public void send21(String s);
    }

}
