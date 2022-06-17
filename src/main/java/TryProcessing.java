import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int position=0;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for(int ball = 1; ball <= 4; ball++){
            drawAllBalls(ball*position,(ball*HEIGHT)/5);
        }
        position++;
    }

    private void drawAllBalls(int position, int height){
        ellipse(position,height,DIAMETER,DIAMETER);
    }

    public static void main(String[] args) { PApplet.main("TryProcessing", args); }
}
