package com.example.a660252397.memefragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/*********************************************
 * A simple {@link Fragment} subclass.
 *********************************************/
public class topSectionFragment extends Fragment {

    /********************************************************
     * Define the variables for your top section fragment
     ********************************************************/
    private static EditText topEditText;
    private static EditText bottomEditText;

    public topSectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top_section, container, false);
        //get reference to the widget
        topEditText = (EditText) view.findViewById(R.id.topEditText);
        bottomEditText = (EditText) view.findViewById(R.id.bottomEditText);
        final Button button = (Button) view.findViewById(R.id.button);

        // set the listener (anonymous inner class)
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }

}
