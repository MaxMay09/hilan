package wf;

import models.Card;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CardHelper extends HelperBase {
    public CardHelper(WebDriver wd) {
        super();
    }
    public void addNewCard(){
        Click(By.xpath("(//span[@class='icon-sm icon-add'])[1]"));
    }
    public void fillForm(Card card){
        //String color = "//div[@aria-label='Color:"+ card.getColor() +", title: none']";
        type(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[1]/div/textarea"), card.getName());
        Click(By.xpath("//div[@class='cc-controls-section mod-right']"));
        Click(By.cssSelector(".js-label-selector"));
        Click(By.cssSelector("[data-color="+ card.getColor() +"]"));
        Click(By.xpath("//a[contains(@class,'pop-over-header-close-btn icon-sm icon-close')]"));
    }

}
