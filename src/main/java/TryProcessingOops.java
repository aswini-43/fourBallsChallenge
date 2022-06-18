import processing.core.PApplet;

class fourBallChallenge{
    PApplet p;
    int speed1=1,speed2=1,speed3=1,speed4=1;

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    fourBallChallenge(PApplet p1){
        p = p1;
    }
    public void drawBall1(){
        p.ellipse(a,1*HEIGHT/5,DIAMETER,DIAMETER);
        speed1+=1;
    }
    public void drawBall2(){
        p.ellipse(b,2*HEIGHT/5,DIAMETER,DIAMETER);
        speed2+=2;
    }
    public void drawBall3(){
        p.ellipse(c,3*HEIGHT/5,DIAMETER,DIAMETER);
        speed3+=3;
    }
    public void drawBall4(){
        p.ellipse(d,4*HEIGHT/5,DIAMETER,DIAMETER);
        speed4+=4;
    }
}

public class TryProcessingOops extends PApplet {

    fourBallChallenge obj = new fourBallChallenge(this);


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

        @Override
        public void settings() {
            super.settings();
            size(WIDTH, HEIGHT);
        }

        @Override
        public void draw() {
        obj.drawBall1();
        obj.drawBall2();
        obj.drawBall3();
        obj.drawBall4();
    }
    public static void main(String[] args) { PApplet.main("TryProcessing", args);}
}
