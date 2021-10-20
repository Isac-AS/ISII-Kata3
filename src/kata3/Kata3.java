package kata3;

import java.util.Random;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        Random rand = new Random();
        for (int i = 0; i < rand.nextInt(50) + 10; i++) {
            if (rand.nextBoolean()) histogram.increment("gmail.com");
            if (rand.nextBoolean()) histogram.increment("ulpgc.es");
            if (rand.nextBoolean()) histogram.increment("ull.es");
            if (rand.nextBoolean()) histogram.increment("hotmail.com");
        }
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
