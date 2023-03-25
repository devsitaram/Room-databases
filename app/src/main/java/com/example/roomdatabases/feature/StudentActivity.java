package com.example.roomdatabases.feature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.roomdatabases.R;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

public class StudentActivity extends AppCompatActivity {

    private Databases databases;
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    List<Student> student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        databases = Databases.getInstance(this);

    }

    private Completable insertStudent() {
        student = new ArrayList<>();
        student.add(new Student(1010, "Manjil", "MAD","ram1010@gmail.com","Melamchi","9801837465",20));
        student.add(new Student(5555, "Manjil", "MAD","manjil5555@gmail.com","Kathmandu","9801837465",20));
        student.add(new Student(1111, "Sitaram", "MAD","sitaram1111@gmail.com","Duwachour","9801837465",21));
        student.add(new Student(9876, "Paurakh", "MAD","paurakh9876@gmail.com","Kailali","9801837465",21));
        student.add(new Student(1234, "Chirayu", "MAD","chirayu1234@gmail.com","Kathmandu","9801837465",20));
        student.add(new Student(9999, "Abinash", "MAD","abinash9999@gmail.com","Pokhara","9801837465",19));

        return databases.studentDao().insertAll(student);
    }

    private Completable updateStudent(){
//        List<Student> student = new ArrayList<>();
//        student.add(new Student(5555, "Manjil", "MAD","manjil5555@gmail.com","Kathmandu","9801837465",20));

        return databases.studentDao().updateStudent(Student student);
    }
}