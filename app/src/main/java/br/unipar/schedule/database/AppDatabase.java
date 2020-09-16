package br.unipar.schedule.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import br.unipar.schedule.DAO.SchedulingDAO;
import br.unipar.schedule.entities.SchedulingEntity;

@Database(entities = {SchedulingEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SchedulingDAO schedulingDAO();
}

