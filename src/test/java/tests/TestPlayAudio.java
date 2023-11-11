package tests;
import PageObjects.LoginPage;
import PageObjects.PlayAudioPage;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.annotations.Test;


public class TestPlayAudio extends BaseTest{
    @Test
    public void TestingPlayAudio() throws InterruptedException {
        ISettingsFile testdata = new JsonSettingsFile("testdata.json");
        logger.info("Navigated to  login page");
        LoginPage loginPage = new LoginPage();

        loginPage.setUsername(testdata.getValue("/username").toString());
        loginPage.setPassword(testdata.getValue("/password").toString());
        loginPage.setLogin();

        PlayAudioPage playAudio = new PlayAudioPage();
        playAudio.hoverOverProjectTitle();

        playAudio.setView();
        playAudio.setPlay();
        Thread.sleep(20000);
    }
}
