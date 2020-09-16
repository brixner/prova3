package br.unipar.schedule;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import br.unipar.schedule.entities.SchedulingEntity;

public class InserirAgendamento extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inseriragendamento);
    }

    public void btnSalvarAgendamento() {
        SchedulingEntity scheduling = new SchedulingEntity();


    }
}
