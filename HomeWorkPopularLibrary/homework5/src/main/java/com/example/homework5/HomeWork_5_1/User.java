package com.example.homework5.HomeWork_5_1;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_users")
public class User {

    @PrimaryKey(autoGenerate = true)
    public int id;
    public String name;
    public String surname;
    public int age;

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age + '\'' +
                '}';
    }
}