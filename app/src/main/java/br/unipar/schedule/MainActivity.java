package br.unipar.schedule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import br.unipar.schedule.entities.SchedulingEntity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnInserirAgendamento(View view) {
        Intent intent = new Intent(MainActivity.this, InserirAgendamento.class);
        startActivity(intent);
    }

    public void btnBuscarAgendamento(View view) {
        Intent intent = new Intent(MainActivity.this, ListarAgendamentos.class);
        startActivity(intent);
    }

}