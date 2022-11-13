package com.example.appcourier;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Ingresar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);
        Toolbar myToolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent intent1 = new Intent(Ingresar.this, Ingresar.class);
                startActivity(intent1);
                return true;
            case R.id.item2:
                Intent intent2 = new Intent(Ingresar.this, Registro.class);
                startActivity(intent2);
                return true;
            case R.id.item3:
                Intent intent3 = new Intent(Ingresar.this, RegistroProducto.class);
                startActivity(intent3);
                return true;
            case R.id.item4:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void irARegistroProducto(View view){
        Intent i = new Intent(this, RegistroProducto.class);
        startActivity(i);
    }
}