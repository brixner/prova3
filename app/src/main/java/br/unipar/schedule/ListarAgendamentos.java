package br.unipar.schedule;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.ref.WeakReference;

import br.unipar.schedule.adapter.SchedulingAdapter;
import br.unipar.schedule.database.DatabaseClient;

public class ListarAgendamentos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listaragendamentos);
        try{
            inTheActivityListarAgendamentos();
        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public void inTheActivityListarAgendamentos() {
        ListView list = (ListView) findViewById(R.id.lstItens);
        final WeakReference<Context> weakReference = new WeakReference<>(getBaseContext());

        SchedulingAdapter schedulingAdapter = new SchedulingAdapter(DatabaseClient.getDatabase(new WeakReference<>(this)).schedulingDAO().getAll(), weakReference);

        list.setAdapter(schedulingAdapter);
    }
}
