package com.diego.radious.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.diego.radious.R;
import com.diego.radious.adapters.TrapezoidalAdapter;
import com.diego.radious.controllers.Parabolico;
import com.diego.radious.controllers.Trapezoidal;

public class TrapezoidalResultsFragment extends Fragment {

    private TextView a_edt, b_edt, delta_edt, result;
    private RecyclerView recyclerView;
    private TrapezoidalAdapter adapter;
    private Trapezoidal trapezoidal;
    private Parabolico parabolico;

    public void setParabolico(Parabolico parabolico) {
        this.parabolico = parabolico;
    }

    public TrapezoidalResultsFragment() {
        // Required empty public constructor
    }

    public static TrapezoidalResultsFragment newInstance(Bundle arguments){
        TrapezoidalResultsFragment aux = new TrapezoidalResultsFragment();
        if(arguments != null){
            aux.setArguments(arguments);
        }
        return aux;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_trapezoidal_results, container, false);
        bindUI(v);
        int aux = getArguments().getInt("res");
        delayValues(aux);
        recyclerView = v.findViewById(R.id.rv_trap);
        if(getArguments().getInt("res")==5)
        adapter = new TrapezoidalAdapter(parabolico.getEvList());
        else
            adapter = new TrapezoidalAdapter(trapezoidal.getEvList());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);


        return v;


    }

    private void delayValues(int s) {
        if(s==5){

            a_edt.setText(String.valueOf(parabolico.getA()));
            b_edt.setText(String.valueOf(parabolico.getB()));
            delta_edt.setText(String.valueOf(parabolico.getDeltaX()));
            result.setText(String.valueOf(parabolico.getIntegral()));
        }if(s==4) {


            a_edt.setText(String.valueOf(trapezoidal.getA()));
            b_edt.setText(String.valueOf(trapezoidal.getB()));
            delta_edt.setText(String.valueOf(trapezoidal.getDeltaX()));
            result.setText(String.valueOf(trapezoidal.getIntegral()));
        }
    }

    private void bindUI(View v) {
        a_edt = v.findViewById(R.id.a_r);
        b_edt = v.findViewById(R.id.b_r);
        delta_edt = v.findViewById(R.id.delta_r);
        result = v.findViewById(R.id.result);


    }

    public void setTrapezoidal(Trapezoidal trapezoidal) {
        this.trapezoidal = trapezoidal;
    }

}
