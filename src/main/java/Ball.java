
import processing.core.PApplet;

public class Ball {
    int X_DIM;
    int Y_DIM;
    int ball_radius;
    int ball_count;
    int X_POS[];
    int divisions;
    private PApplet applet;

    public Ball(PApplet applet, int xDim, int yDim, int ball_radius, int ball_count) {
        this.applet = applet;
        this.X_DIM = xDim;
        this.Y_DIM = yDim;
        this.ball_radius = ball_radius;
        this.ball_count = ball_count;
        this.divisions = ball_count+1;
        this.X_POS = new int[ball_count+1];
    }
    void drawBall() {
        for(int ball_number = 0; ball_number<ball_count;ball_number++){
            int x_cord = X_POS[ball_number];
            int y_cord = Y_DIM/divisions;
            int speed_factor = ball_number+1;
            applet.ellipse( x_cord, y_cord*speed_factor, ball_radius, ball_radius);
            X_POS[ball_number] += speed_factor;
        }
    }
}
