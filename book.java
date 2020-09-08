package ru.mirea.pr1;

public class book {
    private String name;
    private int page;
    public book(String n, int p){
        name=n;
        page=p;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPage(int page){
        this.page=page;
    }
    public String getName(){
        return name;
    }
    public int getPage(){
        return page;
    }
    public String toString(){
        return "the "+this.name+" has "+this.page+" pages";
    }
    public void weight (){
        System.out.println(name+" weighs "+page*2);
    }
}
