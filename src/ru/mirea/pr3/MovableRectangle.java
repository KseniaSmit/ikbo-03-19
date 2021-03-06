package ru.mirea.pr3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1,int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft= new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight= new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    @Override
    public String toString(){
        return "MovableRectangle with topLeft="+topLeft+" and bottomRight="+bottomRight;
    }
    public void moveUp(){
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }
    public void moveDown(){
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }
    public void moveLeft(){
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }
    public void moveRight(){
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }
}
