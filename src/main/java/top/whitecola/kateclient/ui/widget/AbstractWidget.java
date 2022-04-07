package top.whitecola.kateclient.ui.widget;

import java.awt.*;

public class AbstractWidget {
    protected float x;
    protected float y;
    protected float width;
    protected float height;
    public float dragX;
    public float dragY;
    public boolean draged;
    protected String text;

    protected Color color = new Color(237, 235, 233);
    protected Color backgroundColor = null;

    public AbstractWidget(){


    }



        public void drawWidget(){

    }




    public AbstractWidget setX(float x) {
        this.x = x;
        return this;
    }

    public AbstractWidget setY(float y) {
        this.y = y;
        return this;
    }

    public AbstractWidget setHeight(float height) {
        this.height = height;
        return this;
    }


    public AbstractWidget setWidth(float width) {
        this.width = width;
        return this;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public String getWidgetName(){
        return this.getClass().getSimpleName();
    }


    public Color getColor() {
        return color;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setPos(float x,float y){
        setX(x);
        setY(y);
    }

    public boolean isHovered(int mouseX,int mouseY){
        return mouseX >= this.getX() && mouseY >= this.getY() && mouseX < this.getX() + this.width && mouseY < this.getY() + this.height;
    }


    public AbstractWidget setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return text;
    }
}
