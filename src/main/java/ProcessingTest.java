import processing.core.PApplet;

import static processing.core.PApplet.sort;

public class ProcessingTest extends PApplet {

    float[] values;

    public void settings() {
        size(600, 400);
        values = new float[width];
        for (int i = 0; i < values.length; i++) {
            values[i] = random(height);
        }
//        sort();
    }

    public void sort() {
        values = sort(values);
    }

    public void draw() {
        background(0);
        for (int i = 0; i < values.length; i++) {
            stroke(255);
            line(i, height, i, height - values[i]);
        }
    }

    public static void main(String... args) {
        PApplet.main("ProcessingTest");
    }

}
