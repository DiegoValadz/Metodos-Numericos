package com.diego.radious.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.diego.radious.R;
import com.diego.radious.controllers.LaGrange;

import java.text.DecimalFormat;

/**
 * A simple {@link Fragment} subclass.
 */
public class LaGrangeFragment extends Fragment {
    private EditText x_0,x_1,x_2,x_3,fx_0,fx_1,fx_2,fx_3,x;
    private TextView lo,l1,l2,l3,fev;
    private Button button;
    private LaGrange laGrange;


    public LaGrangeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_la_grange, container, false);
        bindUI(v);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    getInput();
                    setOutPut();
                }catch (Exception e){
                    Toast.makeText(getContext(),"Asegurate de llenar todos los campos",Toast.LENGTH_SHORT).show();
                }
            }
        });


        return v;
    }

    private void setOutPut() {
        DecimalFormat fmt = new DecimalFormat("#.0000");
        lo.setText(String.valueOf(fmt.format(laGrange.getLo())));
        l1.setText(String.valueOf(fmt.format(laGrange.getL1())));
        l2.setText(String.valueOf(fmt.format(laGrange.getL2())));
        l3.setText(String.valueOf(fmt.format(laGrange.getL3())));
        fev.setText(String.valueOf(fmt.format(laGrange.getFev())));
    }

    private void getInput() {
        double [] xAux = new double[4];
        double [] fxAux = new double[4];
        double xAuxVar;


        xAux[0] = Double.parseDouble(x_0.getText().toString().trim());
        xAux[1] = Double.parseDouble(x_1.getText().toString().trim());
        xAux[2] = Double.parseDouble(x_2.getText().toString().trim());
        xAux[3] = Double.parseDouble(x_3.getText().toString().trim());

        fxAux[0] = Double.parseDouble(fx_0.getText().toString().trim());
        fxAux[1] = Double.parseDouble(fx_1.getText().toString().trim());
        fxAux[2] = Double.parseDouble(fx_2.getText().toString().trim());
        fxAux[3] = Double.parseDouble(fx_3.getText().toString().trim());
        xAuxVar = Double.parseDouble(x.getText().toString().trim());

        laGrange = new LaGrange(xAux,fxAux,xAuxVar);


    }

    private void bindUI(View v) {
        //EditText
        x = v.findViewById(R.id.x);
        x_0 = v.findViewById(R.id.x_0);
        x_1 = v.findViewById(R.id.x_1);
        x_2 = v.findViewById(R.id.x_2);
        x_3 = v.findViewById(R.id.x_3);

        fx_0 = v.findViewById(R.id.fx_0);
        fx_1 = v.findViewById(R.id.fx_1);
        fx_2 = v.findViewById(R.id.fx_2);
        fx_3 = v.findViewById(R.id.fx_3);
        //TextView
        lo = v.findViewById(R.id.l0);
        l1 = v.findViewById(R.id.l1);
        l2 = v.findViewById(R.id.l2);
        l3 = v.findViewById(R.id.l3);
        fev = v.findViewById(R.id.fev);
        //Button
        button = v.findViewById(R.id.calcLaG);
    }

}
