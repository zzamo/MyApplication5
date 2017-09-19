package juma.strathmore.com.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class create extends AppCompatActivity {

    Button login, register;
    EditText uname, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_create);

        Button login = (Button) findViewById(R.id.Login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginintent = new Intent(create.this, create.class);
                startActivity(createintent);
            }

        });

        Button BtnSignup = (Button) findViewById(R.id.register);
        BtnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signupintent = new Intent(create.this, create.class);
                startActivity(registerintent);
            }

            EditText Username = (EditText) findViewById(R.id.name);
            EditText Password = (EditText) findViewById(R.id.pass);

        });
};}
