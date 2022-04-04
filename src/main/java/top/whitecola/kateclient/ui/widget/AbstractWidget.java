package top.whitecola.kateclient.ui.widget;

public class AbstractWidget {
    protected float x;
    protected float y;
    protected float width;
    protected float height;

    public AbstractWidget(float x,float y, float width,float height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }



        public void drawWidget(){

    }




    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }
}
