package wf;

import models.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListHelper extends HelperBase {

    public ListHelper(WebDriver wd) {
        super();
    }
    public void addNew(){
        Click(By.xpath("//span[@class='placeholder']"));
    }
    public void typeName(List list){
        type(By.cssSelector(".list-name-input"), list.getName());

    }
    public void saveEdit(){
        Click(By.xpath("//input[@value='Add list']"));
    }
}

