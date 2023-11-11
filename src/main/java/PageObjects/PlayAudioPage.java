package PageObjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElement;
import frameworks.BaseForm;
import org.openqa.selenium.By;

public class PlayAudioPage extends BaseForm {
    public PlayAudioPage(){
        super(By.id("add-btn"), "DashBoard Page is not open");
    }
    private final IButton play = getElementFactory().getButton(By.id("btn-play-icon"),"Play Audio");
    private final IButton view = getElementFactory().getButton(By.id("8a254d61-89c4-48dc-9062-117494c16fb6_view"),"View Audio");
    private final IElement projectTitle = getElementFactory().getLabel(By.linkText("sample.wav"), "Project Title");
    public void hoverOverProjectTitle() {
        projectTitle.getMouseActions().moveMouseToElement();
    }
    public void setView(){
        view.clickAndWait();
    }
    public void setPlay(){
        play.clickAndWait();
    }
}
