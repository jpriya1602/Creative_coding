import processing.core.PApplet;

import java.util.ArrayList;

public class FourBalls extends PApplet{
    int s1 = 1;
    ArrayList<Ball> b = new ArrayList<>();

    public static void main(String[] args)
    {
        PApplet.main("FourBalls",args);
    }

    public void settings(){

        size(640,480);
        for(int i =0;i<4;i++)
            b.add(new Ball(this));
    }
    
    public void draw(){
        int count = 1;
        for(Ball bs : b){
            bs.render(count);
            count += 1;}
    }

}
