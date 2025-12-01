package seleniumwebdriveradvanced.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTest {

    @Test
    void iFrameTextShouldBeCorrect() {
        framesPage.open();
        framesPage.openIFrame();
        String text = framesPage.getParagraphText();

        assertEquals(text, "Your content goes here.");
    }
}
