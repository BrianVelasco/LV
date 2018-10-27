package com.brianvp.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listadias;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listadias = (ListView) findViewById(R.id.lista1);
        text = (TextView) findViewById(R.id.texto);

        final ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.arraydias,
                android.R.layout.simple_list_item_1);

        listadias.setAdapter(adaptador);

        listadias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(), "Seleccionado: " +
                        adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_LONG).show();
                text.setText("Seleccionado: " + adapterView.getItemAtPosition(i).toString());
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                Bundle bundle = new Bundle();
                bundle.putString("clave", adapterView.getItemAtPosition(i).toString());
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }
}