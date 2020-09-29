package ru.mirea.pr3;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius=radius;
        this.center=new MovablePoint(x, y, xSpeed, ySpeed);
    }
    @Override
    public String toString(){
        return "MovableCircle with radius="+radius+" and center="+center;
    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveRight();
    }
}
