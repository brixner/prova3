package br.unipar.schedule.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "scheduling")
public class SchedulingEntity {

    @PrimaryKey
    private int uid;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "schedulingDate")
    private String schedulingDate;

    @ColumnInfo(name = "doctorName")
    private String doctorName;

    @ColumnInfo(name = "cellphone")
    private String cellphone;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "status")
    private Boolean status = false;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedulingDate() {
        return schedulingDate;
    }

    public void setSchedulingDate(String schedulingDate) {
        this.schedulingDate = schedulingDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}

