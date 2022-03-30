package kata;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ResultTest {

    @Test
    public void the37CorrespondsTo00() {
        String expected = "00";
        assertEquals(Result.calculateNumber(37),expected);
    }

    @Test()
    public void theResultIsAlwaysBetween00and36() throws Exception {
        try {
            new Result(37);
        }
        catch(Exception e){
            assertThrows(RouletteException.class, () -> new Result(-1));
        }

    }

    @Test
    public void theColorOf0and00IsGreen() throws Exception {
        assertEquals(Result.calculateColor(0),Color.GREEN);

    }

    @Test
    public void theColorOfEvenNumbersIsBlack() throws Exception {
        for(int n=0; n<37;n = n +2){
            assertEquals(Result.calculateColor(n),Color.BLACK);
        }

    }

    @Test
    public void theColorOfOddNumbersIsRed() throws Exception {
        for(int n=1; n<37;n = n +2){
            assertEquals(Result.calculateColor(n),Color.RED);
        }
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsGreaterThan37()
            throws Exception {

    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsLesserThan0()
            throws Exception {

    }

    private void assertColorResult(int randomizerValue, Result.Color expectedColor) {


    }

    private void assertNumberResult(int randomizerValue, String expectedNumber) {
    }
}