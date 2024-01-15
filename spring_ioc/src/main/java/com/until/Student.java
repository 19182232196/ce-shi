package com.until;

import java.util.Arrays;
import java.util.Map;

public class Student implements  Person{
    private Integer sid;
    private String sname;
    private Integer age;
    private String gender;
    private Clazz clazz;
    private String[] hobby;
    private Map<String,Teacher> teachers;

    public Student(Integer sid, String sname, Integer age, String gender, Clazz clazz, String[] hobby, Map<String, Teacher> teachers) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.clazz = clazz;
        this.hobby = hobby;
        this.teachers = teachers;
    }

    public Student() {
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Map<String, Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Map<String, Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", clazz=" + clazz +
                ", hobby=" + Arrays.toString(hobby) +
                ", teachers=" + teachers +
                '}';
    }
}
