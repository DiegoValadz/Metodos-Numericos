package com.diego.radious.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.diego.radious.R;
import com.diego.radious.adapters.JacobiAdapter;
import com.diego.radious.adapters.JacobiEasAdapter;
import com.diego.radious.controllers.Jacobi;

public class JacobiResultsFragment extends Fragment {

    private Jacobi jacobi;
    private RecyclerView recyclerView, recyclerViewEas;
    private JacobiAdapter adapter;
    private JacobiEasAdapter easAdapter;

    public JacobiResultsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_jacobi_results, container, false);
        recyclerView = v.findViewById(R.id.rv_jacobi);
        recyclerViewEas = v.findViewById(R.id.rv_jacobi_eas);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        LinearLayoutManager llm2 = new LinearLayoutManager(getContext());

        adapter = new JacobiAdapter(jacobi);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(llm);

        easAdapter = new JacobiEasAdapter(jacobi);
        recyclerViewEas.setAdapter(easAdapter);
        recyclerViewEas.setLayoutManager(llm2);
        return v;
    }

    public void setJacobi(Jacobi jacobi) {
        this.jacobi = jacobi;
    }
}
