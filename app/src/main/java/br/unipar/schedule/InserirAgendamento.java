package br.unipar.schedule;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.ref.WeakReference;
import java.util.Date;

import br.unipar.schedule.database.AppDatabase;
import br.unipar.schedule.database.DatabaseClient;

import androidx.appcompat.app.AppCompatActivity;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.wdullaer.materialdatetimepicker.time.RadialPickerLayout;

import java.util.Calendar;

import br.unipar.schedule.entities.SchedulingEntity;

public class InserirAgendamento extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inseriragendamento);
    }

    public void btnSalvarAgendamento(View view) {
        SchedulingEntity scheduling = new SchedulingEntity();

        EditText nmPaciente = findViewById(R.id.nmPaciente);
        EditText dtAgendamento = findViewById(R.id.dtAgendamento);
        EditText hrAgendamento = findViewById(R.id.hrAgendamento);
        EditText medico = findViewById(R.id.medico);
        EditText telefone = findViewById(R.id.telefone);
        EditText email = findViewById(R.id.email);

        scheduling.setName(nmPaciente.toString());
        scheduling.setDoctorName(medico.toString());
        scheduling.setCellphone(telefone.toString());
        scheduling.setEmail(email.toString());
        try {
            AppDatabase appDatabase = DatabaseClient.getDatabase(new WeakReference<Context>(this));
            appDatabase.schedulingDAO().save(scheduling);
        } catch (Exception e){
            System.out.println("ERRO AO SALVAR: " + e.getMessage());
        }


        Intent intent = new Intent(InserirAgendamento.this, MainActivity.class);
        startActivity(intent);
    }

}
