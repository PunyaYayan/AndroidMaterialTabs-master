package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment {

    EditText txta1, txta2;
    Button btn_tambah, btn_kurang, btn_kali, btn_bagi;
    TextView tv_hasil;
    float result;
    float angka1, angka2;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_one, container, false);
        txta1      = view.findViewById(R.id.txt_ang1);
        txta2      = view.findViewById(R.id.txt_ang2);
        btn_tambah = view.findViewById(R.id.btnplus);
        btn_kurang = view.findViewById(R.id.btnmin);
        btn_kali   = view.findViewById(R.id.btnkali);
        btn_bagi   = view.findViewById(R.id.btnbagi);
        tv_hasil   = view.findViewById(R.id.tv_hasil);

        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txta1.getText().toString().isEmpty() || txta2.getText().toString().isEmpty()) {
                    tv_hasil.setText("Mohon Diisi Semua  ");}
                else {
                    angka1 = Float.parseFloat(txta1.getText().toString());
                    angka2 = Float.parseFloat(txta2.getText().toString());
                    result = angka1 + angka2;

                    tv_hasil.setText("Hasil: " + result + "");

                }}
        });

        btn_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txta1.getText().toString().isEmpty() || txta2.getText().toString().isEmpty()) {
                    tv_hasil.setText("Mohon Diisi Semua  ");}
                else {
                    angka1 = Float.parseFloat(txta1.getText().toString());
                    angka2 = Float.parseFloat(txta2.getText().toString());
                    result = angka1 - angka2;

                    tv_hasil.setText("Hasil: " + result + "");

                }}
        });

        btn_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txta1.getText().toString().isEmpty() || txta2.getText().toString().isEmpty()) {
                    tv_hasil.setText("Mohon Diisi Semua  ");}
                else {
                    angka1 = Float.parseFloat(txta1.getText().toString());
                    angka2 = Float.parseFloat(txta2.getText().toString());
                    result = angka1 * angka2;

                    tv_hasil.setText("Hasil: " + result + "");

                }}
        });

        btn_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txta1.getText().toString().isEmpty() || txta2.getText().toString().isEmpty()) {
                    tv_hasil.setText("Mohon Diisi Semua  ");}
                else {
                    angka1 = Float.parseFloat(txta1.getText().toString());
                    angka2 = Float.parseFloat(txta2.getText().toString());
                    result = angka1 / angka2;

                    tv_hasil.setText("Hasil: " + result + "");

                }}
        });
        return view;
    }

}
