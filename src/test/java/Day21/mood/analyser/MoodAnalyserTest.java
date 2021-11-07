package Day21.mood.analyser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void givenMessage_IsProper_ShouldReturnSad() {
        moodAnalyser.setMessage("I am in Sad Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", actualResult);
    }

    @Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() {
        moodAnalyser.setMessage("I am in Any Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }

    @Test
    public void givenMessage_Null_ShouldReturnExceptionHandled() {
        moodAnalyser.setMessage(null);
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("Exception Handled", actualResult);
    }
}