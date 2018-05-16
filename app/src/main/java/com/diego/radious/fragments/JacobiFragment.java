package com.diego.radious.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.diego.radious.R;
import com.diego.radious.controllers.Jacobi;
import com.diego.radious.utilities.MyAppUtilities;

public class JacobiFragment extends Fragment implements View.OnClickListener {

    private EditText x1Ini, x2Ini, x3Ini;
    private EditText sol1, sol2, sol3;
    private EditText x2Uno, x3Uno, x1Uno;
    private EditText x1Dos, x3Dos, x2Dos;
    private EditText x1Tres, x2Tres, x3Tres;
    private Button calcular;
    private Jacobi jacobi;

    public JacobiFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_jacobi, container, false);
        bindUI(v);
        calcular.setOnClickListener(this);
        return v;
    }

    private void bindUI(View v) {
        x1Ini = v.findViewById(R.id.val_ini_1);
        x2Ini = v.findViewById(R.id.val_ini_2);
        x3Ini = v.findViewById(R.id.val_ini_3);
        sol1 = v.findViewById(R.id.sol_1);
        sol2 = v.findViewById(R.id.sol_2);
        sol3 = v.findViewById(R.id.sol_3);
        x2Uno = v.findViewById(R.id.x2_1);
        x3Uno = v.findViewById(R.id.x3_1);
        x1Uno = v.findViewById(R.id.x1_1);
        x1Dos = v.findViewById(R.id.x1_2);
        x3Dos = v.findViewById(R.id.x3_2);
        x2Dos = v.findViewById(R.id.x2_2);
        x1Tres = v.findViewById(R.id.x1_3);
        x2Tres = v.findViewById(R.id.x2_3);
        x3Tres = v.findViewById(R.id.x3_3);
        calcular = v.findViewById(R.id.calcular_jacobi);
    }

    @Override
    public void onClick(View v) {
        try {
            double arrayAux[][] = new double[3][3];
            double solAux[] = new double[3];
            double x1, x2, x3;
            //Matriz de ecuaciones
            arrayAux[0][0] = Double.parseDouble(x1Uno.getText().toString().trim());
            arrayAux[0][1] = Double.parseDouble(x2Uno.getText().toString().trim());
            arrayAux[0][2] = Double.parseDouble(x3Uno.getText().toString().trim());
            arrayAux[1][0] = Double.parseDouble(x1Dos.getText().toString().trim());
            arrayAux[1][1] = Double.parseDouble(x2Dos.getText().toString().trim());
            arrayAux[1][2] = Double.parseDouble(x3Dos.getText().toString().trim());
            arrayAux[2][0] = Double.parseDouble(x1Tres.getText().toString().trim());
            arrayAux[2][1] = Double.parseDouble(x2Tres.getText().toString().trim());
            arrayAux[2][2] = Double.parseDouble(x3Tres.getText().toString().trim());
            //Matriz de soluciones
            solAux[0] = Double.parseDouble(sol1.getText().toString().trim());
            solAux[1] = Double.parseDouble(sol2.getText().toString().trim());
            solAux[2] = Double.parseDouble(sol3.getText().toString().trim());
            //Valores iniciales
            x1 = Double.parseDouble(x1Ini.getText().toString().trim());
            x2 = Double.parseDouble(x2Ini.getText().toString().trim());
            x3 = Double.parseDouble(x3Ini.getText().toString().trim());

            jacobi = new Jacobi(arrayAux, solAux, x1, x2, x3);
            JacobiResultsFragment jrf = new JacobiResultsFragment();
            jrf.setJacobi(jacobi);
            MyAppUtilities.changeFragment(R.id.container_main,jrf,getContext(),MyAppUtilities.REPLACE,"Main_Fragment");
        } catch (Exception e) {
            Toast.makeText(getContext(), "Asegurate de llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }
}
