package br.unipar.schedule.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.unipar.schedule.entities.SchedulingEntity;

@Dao
public interface SchedulingDAO {

    @Query("SELECT * FROM scheduling")
    List<SchedulingEntity> getAll();

    @Query("SELECT * FROM scheduling WHERE name LIKE :name")
    SchedulingEntity findByName(String name);

    @Query("SELECT * FROM scheduling WHERE schedulingDate = :data")
    List<SchedulingEntity> findBySchedulingDate(String data);

    @Query("SELECT * FROM scheduling WHERE status = :status")
    List<SchedulingEntity> findByStatus(Boolean status);

    @Insert
    void save(SchedulingEntity schedule);

    @Delete
    void delete(SchedulingEntity schedule);
}