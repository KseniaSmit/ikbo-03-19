package ru.mirea.pr10.FirstTask;

public class Complex {
    public int real;
    public int image;
    public Complex(int real, int image){
        this.real=real;
        this.image=image;
    }
    public void setReal(int real){
        this.real=real;
    }
    public void setImage(int image){
        this.image=image;
    }
    public int getReal(){
        return real;
    }
    public int getImage(){
        return image;
    }
    public String toString(){
        return "real= "+ real+", image="+image;
    }
}
