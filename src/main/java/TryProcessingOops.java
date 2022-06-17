import processing.core.PApplet;

class fourBallChallenge{
    PApplet p;
    int a=1,b=1,c=1,d=1;

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    fourBallChallenge(PApplet p1){
        p = p1;
    }
    public void drawBall1(){
        p.ellipse(a,1*HEIGHT/5,DIAMETER,DIAMETER);
        a+=1;
    }
    public void drawBall2(){
        p.ellipse(b,2*HEIGHT/5,DIAMETER,DIAMETER);
        b+=2;
    }
    public void drawBall3(){
        p.ellipse(c,3*HEIGHT/5,DIAMETER,DIAMETER);
        c+=3;
    }
    public void drawBall4(){
        p.ellipse(d,4*HEIGHT/5,DIAMETER,DIAMETER);
        d+=4;
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
