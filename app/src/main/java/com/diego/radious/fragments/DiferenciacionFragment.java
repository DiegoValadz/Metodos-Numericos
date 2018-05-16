package com.diego.radious.fragments;

import android.animation.Animator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.diego.radious.R;
import com.diego.radious.controllers.DiferenciacionNumerica;
import com.diego.radious.utilities.MyAppUtilities;

public class DiferenciacionFragment extends Fragment implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    private Spinner spinner;
    private TextView ind_txt, x1_txt, x2_txt, x3_txt, x4_txt, x5_txt, x6_txt, x7_txt;
    private EditText ind_edt, x1_edt, x2_edt, x3_edt, x4_edt, x5_edt, x6_edt, x7_edt, xi_edt, h_edt;
    private Button calcular;

    public DiferenciacionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_diferenciacion, container, false);
        bindUI(v);
        return v;
    }

    private void bindUI(View v) {
        spinner = v.findViewById(R.id.spinner_aprox);
        ind_txt = v.findViewById(R.id.ind_txt2);
        x1_txt = v.findViewById(R.id.x_txt2);
        x2_txt = v.findViewById(R.id.x2_txt2);
        x3_txt = v.findViewById(R.id.x3_txt2);
        x4_txt = v.findViewById(R.id.x4_txt2);
        x5_txt = v.findViewById(R.id.x5_txt2);
        x6_txt = v.findViewById(R.id.x6_txt2);
        x7_txt = v.findViewById(R.id.x7_txt2);

        ind_edt = v.findViewById(R.id.ind_edt2);
        x1_edt = v.findViewById(R.id.x_edt2);
        x2_edt = v.findViewById(R.id.x2_edt2);
        x3_edt = v.findViewById(R.id.x3_edt2);
        x4_edt = v.findViewById(R.id.x4_edt2);
        x5_edt = v.findViewById(R.id.x5_edt2);
        x6_edt = v.findViewById(R.id.x6_edt2);
        x7_edt = v.findViewById(R.id.x7_edt2);

        xi_edt = v.findViewById(R.id.xi_edt);
        h_edt = v.findViewById(R.id.h_edt);

        calcular = v.findViewById(R.id.btn_aprox);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        calcular.setOnClickListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Animator anim;
        switch (position) {
            case 0:
                ind_txt.setVisibility(View.GONE);
                ind_edt.setVisibility(View.GONE);
                x1_txt.setVisibility(View.GONE);
                x1_edt.setVisibility(View.GONE);
                x2_txt.setVisibility(View.GONE);
                x2_edt.setVisibility(View.GONE);
                x3_txt.setVisibility(View.GONE);
                x3_edt.setVisibility(View.GONE);
                x4_txt.setVisibility(View.GONE);
                x4_edt.setVisibility(View.GONE);
                x5_txt.setVisibility(View.GONE);
                x5_edt.setVisibility(View.GONE);
                x6_txt.setVisibility(View.GONE);
                x6_edt.setVisibility(View.GONE);
                x7_txt.setVisibility(View.GONE);
                x7_edt.setVisibility(View.GONE);
                calcular.setVisibility(View.GONE);
                break;
            case 1:
                ind_txt.setVisibility(View.VISIBLE);
                ind_edt.setVisibility(View.VISIBLE);
                x1_txt.setVisibility(View.VISIBLE);
                x1_edt.setVisibility(View.VISIBLE);
                x2_txt.setVisibility(View.GONE);
                x2_edt.setVisibility(View.GONE);
                x3_txt.setVisibility(View.GONE);
                x3_edt.setVisibility(View.GONE);
                x4_txt.setVisibility(View.GONE);
                x4_edt.setVisibility(View.GONE);
                x5_txt.setVisibility(View.GONE);
                x5_edt.setVisibility(View.GONE);
                x6_txt.setVisibility(View.GONE);
                x6_edt.setVisibility(View.GONE);
                x7_txt.setVisibility(View.GONE);
                x7_edt.setVisibility(View.GONE);
                anim = animarBoton();
                calcular.setVisibility(View.VISIBLE);
                anim.start();

                break;
            case 2:
                ind_txt.setVisibility(View.VISIBLE);
                ind_edt.setVisibility(View.VISIBLE);
                x1_txt.setVisibility(View.VISIBLE);
                x1_edt.setVisibility(View.VISIBLE);
                x2_txt.setVisibility(View.VISIBLE);
                x2_edt.setVisibility(View.VISIBLE);
                x3_txt.setVisibility(View.GONE);
                x3_edt.setVisibility(View.GONE);
                x4_txt.setVisibility(View.GONE);
                x4_edt.setVisibility(View.GONE);
                x5_txt.setVisibility(View.GONE);
                x5_edt.setVisibility(View.GONE);
                x6_txt.setVisibility(View.GONE);
                x6_edt.setVisibility(View.GONE);
                x7_txt.setVisibility(View.GONE);
                x7_edt.setVisibility(View.GONE);
                anim = animarBoton();
                calcular.setVisibility(View.VISIBLE);
                anim.start();
                break;
            case 3:
                ind_txt.setVisibility(View.VISIBLE);
                ind_edt.setVisibility(View.VISIBLE);
                x1_txt.setVisibility(View.VISIBLE);
                x1_edt.setVisibility(View.VISIBLE);
                x2_txt.setVisibility(View.VISIBLE);
                x2_edt.setVisibility(View.VISIBLE);
                x3_txt.setVisibility(View.VISIBLE);
                x3_edt.setVisibility(View.VISIBLE);
                x4_txt.setVisibility(View.GONE);
                x4_edt.setVisibility(View.GONE);
                x5_txt.setVisibility(View.GONE);
                x5_edt.setVisibility(View.GONE);
                x6_txt.setVisibility(View.GONE);
                x6_edt.setVisibility(View.GONE);
                x7_txt.setVisibility(View.GONE);
                x7_edt.setVisibility(View.GONE);
                anim = animarBoton();
                calcular.setVisibility(View.VISIBLE);
                anim.start();

                break;
            case 4:
                ind_txt.setVisibility(View.VISIBLE);
                ind_edt.setVisibility(View.VISIBLE);
                x1_txt.setVisibility(View.VISIBLE);
                x1_edt.setVisibility(View.VISIBLE);
                x2_txt.setVisibility(View.VISIBLE);
                x2_edt.setVisibility(View.VISIBLE);
                x3_txt.setVisibility(View.VISIBLE);
                x3_edt.setVisibility(View.VISIBLE);
                x4_txt.setVisibility(View.VISIBLE);
                x4_edt.setVisibility(View.VISIBLE);
                x5_txt.setVisibility(View.GONE);
                x5_edt.setVisibility(View.GONE);
                x6_txt.setVisibility(View.GONE);
                x6_edt.setVisibility(View.GONE);
                x7_txt.setVisibility(View.GONE);
                x7_edt.setVisibility(View.GONE);
                anim = animarBoton();
                calcular.setVisibility(View.VISIBLE);
                anim.start();


                break;
            case 5:
                ind_txt.setVisibility(View.VISIBLE);
                ind_edt.setVisibility(View.VISIBLE);
                x1_txt.setVisibility(View.VISIBLE);
                x1_edt.setVisibility(View.VISIBLE);
                x2_txt.setVisibility(View.VISIBLE);
                x2_edt.setVisibility(View.VISIBLE);
                x3_txt.setVisibility(View.VISIBLE);
                x3_edt.setVisibility(View.VISIBLE);
                x4_txt.setVisibility(View.VISIBLE);
                x4_edt.setVisibility(View.VISIBLE);
                x5_txt.setVisibility(View.VISIBLE);
                x5_edt.setVisibility(View.VISIBLE);
                x6_txt.setVisibility(View.GONE);
                x6_edt.setVisibility(View.GONE);
                x7_txt.setVisibility(View.GONE);
                x7_edt.setVisibility(View.GONE);
                anim = animarBoton();
                calcular.setVisibility(View.VISIBLE);
                anim.start();

                break;
            case 6:
                ind_txt.setVisibility(View.VISIBLE);
                ind_edt.setVisibility(View.VISIBLE);
                x1_txt.setVisibility(View.VISIBLE);
                x1_edt.setVisibility(View.VISIBLE);
                x2_txt.setVisibility(View.VISIBLE);
                x2_edt.setVisibility(View.VISIBLE);
                x3_txt.setVisibility(View.VISIBLE);
                x3_edt.setVisibility(View.VISIBLE);
                x4_txt.setVisibility(View.VISIBLE);
                x4_edt.setVisibility(View.VISIBLE);
                x5_txt.setVisibility(View.VISIBLE);
                x5_edt.setVisibility(View.VISIBLE);
                x6_txt.setVisibility(View.VISIBLE);
                x6_edt.setVisibility(View.VISIBLE);
                x7_txt.setVisibility(View.GONE);
                x7_edt.setVisibility(View.GONE);
                anim = animarBoton();
                calcular.setVisibility(View.VISIBLE);
                anim.start();
                break;
            case 7:
                ind_txt.setVisibility(View.VISIBLE);
                ind_edt.setVisibility(View.VISIBLE);
                x1_txt.setVisibility(View.VISIBLE);
                x1_edt.setVisibility(View.VISIBLE);
                x2_txt.setVisibility(View.VISIBLE);
                x2_edt.setVisibility(View.VISIBLE);
                x3_txt.setVisibility(View.VISIBLE);
                x3_edt.setVisibility(View.VISIBLE);
                x4_txt.setVisibility(View.VISIBLE);
                x4_edt.setVisibility(View.VISIBLE);
                x5_txt.setVisibility(View.VISIBLE);
                x5_edt.setVisibility(View.VISIBLE);
                x6_txt.setVisibility(View.VISIBLE);
                x6_edt.setVisibility(View.VISIBLE);
                x7_txt.setVisibility(View.VISIBLE);
                x7_edt.setVisibility(View.VISIBLE);
                anim = animarBoton();
                calcular.setVisibility(View.VISIBLE);
                anim.start();
                break;
        }
    }

    private Animator animarBoton() {
        int cx = (calcular.getLeft() + calcular.getRight()) / 2;
        int cy = (calcular.getTop() + calcular.getBottom()) / 2;
        int finalRadius = Math.max(calcular.getWidth(), calcular.getHeight());
        return ViewAnimationUtils.createCircularReveal(calcular, cx, cy, 0, finalRadius);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {}

    @Override
    public void onClick(View v) {
        obtenerInput();
    }

    private void obtenerInput() {
        double ind = 0, x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, x6 = 0, x7 = 0, xi, h;

        try {
            if (ind_edt.getVisibility() == View.VISIBLE && ind_edt.getText() != null)
                ind = Double.parseDouble(ind_edt.getText().toString());
            if (x1_edt.getVisibility() == View.VISIBLE && x1_edt.getText() != null)
                x1 = Double.parseDouble(x1_edt.getText().toString());
            if (x2_edt.getVisibility() == View.VISIBLE && x2_edt.getText() != null)
                x2 = Double.parseDouble(x2_edt.getText().toString());
            if (x3_edt.getVisibility() == View.VISIBLE && x3_edt.getText() != null)
                x3 = Double.parseDouble(x3_edt.getText().toString());
            if (x4_edt.getVisibility() == View.VISIBLE && x4_edt.getText() != null)
                x4 = Double.parseDouble(x4_edt.getText().toString());
            if (x5_edt.getVisibility() == View.VISIBLE && x5_edt.getText() != null)
                x5 = Double.parseDouble(x5_edt.getText().toString());
            if (x6_edt.getVisibility() == View.VISIBLE && x6_edt.getText() != null)
                x6 = Double.parseDouble(x6_edt.getText().toString());
            if (x7_edt.getVisibility() == View.VISIBLE && x7_edt.getText() != null)
                x7 = Double.parseDouble(x7_edt.getText().toString());

            xi = Double.parseDouble(xi_edt.getText().toString());
            h = Double.parseDouble(h_edt.getText().toString());

            /*Toast.makeText(getContext(), "ind= " + ind + "\nx1= " + x1 + "\nx2= " + x2 + "\nx3= " + x3
                    + "\nx4= " + x4 + "\nx5= " + x5 + "\nx6= " + x6 +"\nx7= " + x7 +
                    "\na=" + a + "\nb=" + b, Toast.LENGTH_LONG).show();*/

            Toast.makeText(getContext(), "Valor calculado", Toast.LENGTH_LONG).show();
            double terminos[] = {ind, x1, x2, x3, x4, x5, x6, x7};
            DiferenciacionNumerica apDiferenciales = new DiferenciacionNumerica(xi, terminos, h);

            DiferenciacionResultsFragment adrf = new DiferenciacionResultsFragment();
            adrf.setAproxDif(apDiferenciales);
            MyAppUtilities.changeFragment(R.id.container_main,adrf,getContext(),MyAppUtilities.REPLACE,"Main_Fragment");

        } catch (Exception e) {
            Toast.makeText(getContext(), "Llena los campos vacios con \"0\" o utiliza menos campos \nNo olvides introducir un " +
                    "intervalo valido", Toast.LENGTH_LONG).show();
        }
    }
}
