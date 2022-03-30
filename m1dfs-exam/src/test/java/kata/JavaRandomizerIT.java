package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaRandomizerIT {


    @Test
    public void numbersAreNeverOutsideBoundsOf0And37() throws Exception {
        for(int n = 0; n<1000; n = n+1){
            JavaRandomizer u = new JavaRandomizer();
            int value =  u.getRouletteResult();
            if(value >37 || value < 0){
                assertEquals(false,true);
            }
        }
    }

    @Test
    public void allNumbersOccur() throws Exception {
        for(int n = 0; n<1000; n = n+1){
            JavaRandomizer u = new JavaRandomizer();
            int value =  u.getRouletteResult();
            //Vider un array list de chaque valeur, puis verifier
            //Si il reste quelque chose
        }
    }


}
