package com.diego.radious.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.diego.radious.R;
import com.diego.radious.adapters.MainAdapter;
import com.diego.radious.models.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Element> elements;
    private MainAdapter adapter;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_main, container, false);
        fillElementsList();
        recyclerView = v.findViewById(R.id.main_rv);
        adapter = new MainAdapter(getContext(),elements);
        GridLayoutManager glm = new GridLayoutManager(getContext(),2);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(glm);

        return v;
    }

    private void fillElementsList() {
        elements = new ArrayList<>();
        elements.add(new Element("Programa N°1","Calculo de radios"));
        elements.add(new Element("Programa N°2","Método de Bisección"));
        elements.add(new Element("Programa N°3","Método de Jacobi"));
        elements.add(new Element("Programa N°4","Método de Diferenciación numérica"));
        elements.add(new Element("Programa N°5","Método trapezoidal"));
        elements.add(new Element("Programa N°6","Método de Simpson"));
        elements.add(new Element("Programa N°7","Método rectangular "));
        elements.add(new Element("Programa N°8","Método parabolico"));


    }


}
