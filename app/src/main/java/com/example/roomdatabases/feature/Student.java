package com.example.roomdatabases.feature;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student")
public class Student {
//    @PrimaryKey(autoGenerate = true)
    @PrimaryKey()
    public int studentId;

    @ColumnInfo(name = "student_name")
    public String studentName;

    @ColumnInfo(name = "honors")
    public String honors;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "address")
    public String address;

    @ColumnInfo(name = "phone")
    public String phone;

    @ColumnInfo(name = "age")
    public int age;

    public Student(int studentId, String studentName, String honors, String email, String address, String phone, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.honors = honors;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getHonors() {
        return honors;
    }

    public void setHonors(String honors) {
        this.honors = honors;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
