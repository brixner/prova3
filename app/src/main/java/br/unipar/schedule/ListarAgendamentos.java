package br.unipar.schedule;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import br.unipar.schedule.entities.SchedulingEntity;

public class ListarAgendamentos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listaragendamentos);
        inTheActivityListarAgendamentos();
    }

    public void inTheActivityListarAgendamentos() {
        SchedulingEntity scheduling = new SchedulingEntity();

    }
}
