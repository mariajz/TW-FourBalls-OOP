import processing.core.PApplet;

public class FourBallsOOP extends PApplet {
    public static final int X_DIM = 500;
    public static final int Y_DIM = 500;
    public static final int ball_radius = 12;
    public static final int ball_count = 4;
    public static final int divisions = ball_count+1;
    //int X_POS[] = new int[divisions];
    int x_pos = 0;
    public Ball myBall;

    public FourBallsOOP() {
        myBall = new Ball(this, X_DIM, Y_DIM, ball_radius, ball_count);
    }

    public static void main(String[] args){
        PApplet.main("FourBallsOOP",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(X_DIM,Y_DIM);
    }


    @Override
    public void draw() {
        myBall.drawBall();
    }


}
