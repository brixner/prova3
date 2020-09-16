package br.unipar.schedule.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.Date;
import java.util.List;

import br.unipar.schedule.entities.SchedulingEntity;

@Dao
public interface SchedulingDAO {

    @Query("SELECT * FROM scheduling")
    List<SchedulingEntity> getAll();

    @Query("SELECT * FROM scheduling WHERE uid = :id")
    List<SchedulingEntity> loadAllByIds(int[] id);

    @Query("SELECT * FROM scheduling WHERE name LIKE :name")
    SchedulingEntity findByName(String name);

    @Query("SELECT * FROM scheduling WHERE schedulingDate = :date")
    SchedulingEntity findBySchedulingDate(Date date);

    @Query("SELECT * FROM scheduling WHERE status = :status")
    SchedulingEntity findByStatus(Boolean status);

    @Insert
    void insert(SchedulingEntity schedule);

    @Delete
    void delete(SchedulingEntity schedule);
}