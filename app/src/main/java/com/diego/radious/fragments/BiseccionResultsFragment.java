package com.diego.radious.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.diego.radious.R;
import com.diego.radious.adapters.BiseccionAdapter;
import com.diego.radious.controllers.Biseccion;

public class BiseccionResultsFragment extends Fragment {

    private Biseccion biseccion;
    private RecyclerView recyclerView;
    private BiseccionAdapter adapter;

    public BiseccionResultsFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_biseccion_results, container, false);
        recyclerView = v.findViewById(R.id.rv_biseccion);
        adapter = new BiseccionAdapter(biseccion);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(llm);
        return v;
    }

    public void setBiseccion(Biseccion biseccion) {
        this.biseccion = biseccion;
    }
}
