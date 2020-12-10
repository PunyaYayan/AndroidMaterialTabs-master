package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.IconTabsActivity;
import info.androidhive.materialtabs.activity.Login;
import info.androidhive.materialtabs.activity.SimpleTabsActivity;


public class TwoFragment extends Fragment {

    EditText txta3;
    Button btnhitung;
    TextView tv_hasil;
    float result;
    float angka3;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        txta3 = view.findViewById(R.id.txt_ang3);
        btnhitung = view.findViewById(R.id.btn_hitung);
        tv_hasil = view.findViewById(R.id.tv_hassil);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txta3.getText().toString().isEmpty()) {
                    tv_hasil.setText("Mohon Diisi Semua  ");
                } else {
                    angka3 = Float.parseFloat(txta3.getText().toString());
                    result = angka3 * angka3;
                    tv_hasil.setText("Hasil: " + result + "");
                }
            }
        });

        return view;
    }
}
