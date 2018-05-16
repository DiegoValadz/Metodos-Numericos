package com.diego.radious.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.diego.radious.R;
import com.diego.radious.controllers.DiferenciacionNumerica;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiferenciacionResultsFragment extends Fragment {


    private TextView xi,h,xMenosH,xMasH,zero0,zero1,uno0,uno1,dos0,dos1,difDel,difAtras,difCen;



    private DiferenciacionNumerica aproxDif;


    public DiferenciacionResultsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_diferenciacion_results, container, false);
        bindUI(v);
        xi.setText(String.valueOf(aproxDif.getXi()));
        h.setText(String.valueOf(aproxDif.getH()));
        xMenosH.setText(String.valueOf(aproxDif.getXiMenosH()));
        xMasH.setText(String.valueOf(aproxDif.getXiMasH()));
        zero0.setText(String.valueOf(aproxDif.getXiMenosH()));
        zero1.setText(String.valueOf(aproxDif.getEvXmenosH()));
        uno0.setText(String.valueOf(aproxDif.getXi()));
        uno1.setText(String.valueOf(aproxDif.getEvX()));
        dos0.setText(String.valueOf(aproxDif.getXiMasH()));
        dos1.setText(String.valueOf(aproxDif.getEvXmasH()));
        difDel.setText(String.valueOf(aproxDif.getDifAdelante()));
        difAtras.setText(String.valueOf(aproxDif.getDifAtras()));
        difCen.setText(String.valueOf(aproxDif.getDifCentral()));


        return v;
    }

    private void bindUI(View v) {
        xi= v.findViewById(R.id.xi_r);
        h= v.findViewById(R.id.h_r);
        xMenosH = v.findViewById(R.id.xi_menos_h_r);
        xMasH = v.findViewById(R.id.xi_mas_h_r);
        zero0= v.findViewById(R.id.zero_0);
        zero1= v.findViewById(R.id.zero_1);
        uno0= v.findViewById(R.id.uno_0);
        uno1= v.findViewById(R.id.uno_1);
        dos0= v.findViewById(R.id.dos_0);
        dos1= v.findViewById(R.id.dos_1);
        difDel = v.findViewById(R.id.dif_adel);
        difAtras = v.findViewById(R.id.dif_atras);
        difCen = v.findViewById(R.id.dif_central);
    }

    public void setAproxDif(DiferenciacionNumerica aproxDif) {
        this.aproxDif = aproxDif;
    }
}
