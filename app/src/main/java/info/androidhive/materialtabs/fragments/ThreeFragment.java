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


public class ThreeFragment extends Fragment {

    EditText txta4;
    EditText txta5;
    Button btnhitung;
    TextView tv_hasil;
    float result;
    float angka4;
    float angka5;

    public ThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        txta4 = view.findViewById(R.id.txt_ang4);
        txta5 = view.findViewById(R.id.txt_ang5);
        btnhitung = view.findViewById(R.id.btn_hitung);
        tv_hasil = view.findViewById(R.id.tv_hassil);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txta4.getText().toString().isEmpty() || txta5.getText().toString().isEmpty()) {
                    tv_hasil.setText("Mohon Diisi Semua");
                } else {
                    angka5 = Float.parseFloat(txta5.getText().toString());
                    angka4 = Float.parseFloat(txta4.getText().toString());
                    result = angka4 * angka5;
                    tv_hasil.setText("Hasil: " + result + "");
                }
            }
        });

        return view;
    }
}
