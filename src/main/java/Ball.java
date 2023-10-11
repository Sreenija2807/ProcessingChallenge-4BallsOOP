import processing.core.PApplet;
public class Ball extends PApplet  {
    float x;
    float y;
    int speed;

    Ball(float x, float y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    void display(FourBalls sketch) {
        sketch.ellipse(x, y, 10, 10);
        x += speed;
    }
}
