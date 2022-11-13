package com.example.appcourier;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class RegistroProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_producto);
        Toolbar myToolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent intent1 = new Intent(RegistroProducto.this, Ingresar.class);
                startActivity(intent1);
                return true;
            case R.id.item2:
                Intent intent2 = new Intent(RegistroProducto.this, Registro.class);
                startActivity(intent2);
                return true;
            case R.id.item3:
                Intent intent3 = new Intent(RegistroProducto.this, RegistroProducto.class);
                startActivity(intent3);
                return true;
            case R.id.item4:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void irARegistro(View view){
        Intent i = new Intent(this, Registro.class);
        startActivity(i);
    }
}