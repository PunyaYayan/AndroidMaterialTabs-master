package info.androidhive.materialtabs.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import info.androidhive.materialtabs.activity.IconTabsActivity;
import info.androidhive.materialtabs.activity.Login;
import info.androidhive.materialtabs.activity.MainActivity;

public class ControlClass extends AppCompatActivity {
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
        if (sharedPreferences.getString("userid","").isEmpty()){
            Intent in=new Intent(getApplicationContext(),Login.class);
            startActivity(in);
            finish();
        }else {
            Intent in=new Intent(getApplicationContext(),IconTabsActivity.class);
            startActivity(in);
            finish();
        }
    }
}