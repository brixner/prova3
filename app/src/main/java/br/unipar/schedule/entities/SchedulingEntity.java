package br.unipar.schedule.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "scheduling")
public class SchedulingEntity {

    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "schedulingDate")
    public Date schedulingDate;

    @ColumnInfo(name = "doctorName")
    public String doctorName;

    @ColumnInfo(name = "cellphone")
    public String cellphone;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "status")
    public Boolean status = false;

}

