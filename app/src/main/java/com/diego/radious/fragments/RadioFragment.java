package com.diego.radious.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import com.diego.radious.R;
import com.diego.radious.adapters.RadioAdapter;
import com.diego.radious.controllers.Punto;
import com.diego.radious.controllers.Recta;
import java.util.ArrayList;
import java.util.List;

public class RadioFragment extends Fragment {

    private List<Recta> rectas = new ArrayList<>();
    private List<Punto> punto= new ArrayList<>();
    private FloatingActionButton fab;
    private RecyclerView recyclerView;

    public RadioFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_radio, container, false);
        asignarValores();
        recyclerView = v.findViewById(R.id.radio_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RadioAdapter radioAdapter = new RadioAdapter(rectas);
        recyclerView.setAdapter(radioAdapter);
        fab = v.findViewById(R.id.float_btn);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crearAlertDialog();
            }
        });
        return v;
    }
    private void crearAlertDialog(){
        View v = LayoutInflater.from(getContext()).inflate(R.layout.alert_dialog,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setView(v);
        builder.setTitle("Agregar nuevo punto");
        builder.setMessage("Introduce nuevas coordenadas para X y Y");
        final EditText xEdt = v.findViewById(R.id.x_txt);
        final EditText yEdt = v.findViewById(R.id.y_txt);
        builder.setPositiveButton("Crear", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                try{
                    double x = Double.parseDouble(xEdt.getText().toString().trim());
                    double y = Double.parseDouble(yEdt.getText().toString().trim());
                    agregarNuevo(x,y);
                }catch (Exception e){
                    Toast.makeText(getContext(),"Introduce valores validos",Toast.LENGTH_SHORT).show();
                }
            }
        });
        builder.create();
        builder.show();
    }

    private void agregarNuevo(double x,double y) {
        Punto puntoAux= new Punto(x,y);
        Recta rectaAux = new Recta(puntoAux);
        rectas.add(rectaAux);
    }

    private void asignarValores(){
       /* Punto[] punto= new Punto[9];
        punto[0] = new Punto(1,0);
        punto[1] = new Punto(1,1);
        punto[2] = new Punto(0,1);
        punto[3] = new Punto(-1,1);
        punto[4] = new Punto(-1,0);
        punto[5] = new Punto(-1,-1);
        punto[6] = new Punto(0,-1);
        punto[7] = new Punto(1,-1);
        punto[8] = new Punto(0,0);

        for(int i=0; i<punto.length;i++)
        rectas.add(new Recta(punto[i]));*/

        punto.add(new Punto(1,0));
        punto.add(new Punto(1,1));
        punto.add(new Punto(0,1));
        punto.add(new Punto(-1,1));
        punto.add(new Punto(-1,0));
        punto.add(new Punto(-1,-1));
        punto.add(new Punto(0,-1));
        punto.add(new Punto(1,-1));
        punto.add(new Punto(0,0));

        for(int i=0; i<punto.size();i++)
            rectas.add(new Recta(punto.get(i)));
    }
}
