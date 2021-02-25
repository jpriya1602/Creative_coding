import processing.core.PApplet;
public class Ball {
    private PApplet sketch;
    private int x1 = 0;
    private int s1;
    public Ball(PApplet sketch){
        this.sketch = sketch;
        this.s1 = s1;

    }
    public void render(int s1){
        sketch.ellipse(x1,sketch.height*s1/5,20,20);
        x1 = x1+s1;
    }
}
