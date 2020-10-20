package ru.mirea.pr6;

public class Student {
    private int id;
    private int grade;
    private String name;
    Student(int id, int grade){
        this.id=id;
        this.grade=grade;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public int getGrade(){
        return grade;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "name of student:"+name+", his/her id:"+id+", his/her grade:"+ grade;
    }
}
