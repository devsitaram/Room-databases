package com.example.roomdatabases.feature;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
@SuppressWarnings("AndroidUnresolvedRoomSqlReference")
@Dao
public interface StudentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public Completable insertAll(List<Student> student);

    @Query("Select * From student")
    public Single<List<Student>> getAllStudent();

    @Query("Select * from student where studentId in (:studentId)")
    public Single<List<Student>> getAllStudentId(String[] studentId);

    @Query("Select * From student Where student_name Like :studentName AND honors Like :honors")
    public Single<List<Student>> getAllName(String studentName, String honors);

    @Update
    public Completable updateStudent(Student student);

    @Delete
    public Completable deleteStudent(Student student);

}
