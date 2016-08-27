package com.ramos.matias.tpcategorias.listacategoria;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ramos.matias.tpcategorias.R;

import java.util.ArrayList;
import java.util.List;

public class ListaCategoriaActivity extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_categoria);

        ActionBar actionBar = super.getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Lista de categorias");

        rv = (RecyclerView)findViewById(R.id.rv);

        ListaCategoriaController categoriaController = new ListaCategoriaController(this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(categoriaController);


        RecyclerView.LayoutManager layout = new LinearLayoutManager(this);
        rv.setLayoutManager(layout);
        List<Categoria> c = new ArrayList<Categoria>();
        c.add(new Categoria());
        c.add(new Categoria());c.add(new Categoria());c.add(new Categoria());
        c.add(new Categoria());c.add(new Categoria());c.add(new Categoria());
        c.add(new Categoria());c.add(new Categoria());c.add(new Categoria());

        CategoriaAdapter adapter = new CategoriaAdapter(c);
        rv.setAdapter(adapter);

        registerForContextMenu(rv);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        this.finish();

        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
       int position = ((CategoriaAdapter)rv.getAdapter()).getPosition();
        Log.d("dsadsasad","Item id:"+position+". "+item.getTitle());
        return true;
    }
}
