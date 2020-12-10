package info.androidhive.materialtabs.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.fragments.OneFragment;

public class Login extends AppCompatActivity {

    EditText txtusername;
    EditText txtpassword;
    Button btnlogin;

    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        pref = getSharedPreferences("login", MODE_PRIVATE);
        txtusername=findViewById(R.id.Edttxt_1);
        txtpassword=findViewById(R.id.Edttxt_2);
        btnlogin=findViewById(R.id.Btn_1);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtusername.getText().toString().equalsIgnoreCase("zayyan") ||
                        txtpassword.getText().toString().equalsIgnoreCase("cahya")){
                    Toast.makeText(Login.this, "Login sukses", Toast.LENGTH_SHORT).show();
                    editor = pref.edit();
                    editor.putString("userid", txtusername.getText().toString());
                    editor.apply();
                    Intent in=new Intent(Login.this, IconTabsActivity.class);
                    //bisa melempar nilai
                    in.putExtra("username", txtusername.getText().toString());
                    startActivity(in);
                    finish();
                }
            }
        });

    }
}