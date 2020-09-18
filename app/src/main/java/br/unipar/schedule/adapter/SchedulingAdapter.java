package br.unipar.schedule.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.List;

import br.unipar.schedule.R;
import br.unipar.schedule.entities.SchedulingEntity;

public class SchedulingAdapter extends BaseAdapter {

    private List<SchedulingEntity> schedulings;
    private LayoutInflater mInflater;

    public SchedulingAdapter(List<SchedulingEntity> schedulings, WeakReference<Context> weakReference) {
        this.schedulings = schedulings;

        this.mInflater = LayoutInflater.from(weakReference.get());
    }


    @Override
    public int getCount() {
        return schedulings.size();
    }

    @Override
    public Object getItem(int position) {
        return schedulings.get(position);
    }

    @Override
    public long getItemId(int position) {
        return schedulings.get(position).getUid();
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        SchedulingEntity scheduling = (SchedulingEntity) getItem(position);

        if (convertView == null) {

            //Cria a view nova
            convertView = mInflater.inflate(R.layout.activity_schedulingitem, null);

            //Inicia a viewHolder
            holder = new ViewHolder();

            //Inicializa os campos
            holder.textView1 = (TextView) convertView.findViewById(R.id.textView);
            holder.textView2 = (TextView) convertView.findViewById(R.id.textView2);

            //Seta a tag(para não recriar o layout N vezes..
            convertView.setTag(holder);

        } else {

            //Recupera a tag
            holder = (ViewHolder) convertView.getTag();
        }

        //Texts
        holder.textView1.setText(String.valueOf(scheduling.getUid()));
        holder.textView2.setText(scheduling.getName());

        return convertView;
    }


    static class ViewHolder {
        ImageView imageView;
        TextView textView1;
        TextView textView2;
    }
}