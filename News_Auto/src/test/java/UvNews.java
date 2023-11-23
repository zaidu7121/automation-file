import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.edge.EdgeDriver;

public class UvNews {
    WebDriver d;
    @Before
    public void testOpenWebPage()
    {
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.edgedriver().setup();
        d = new ChromeDriver();
//        d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        d.manage().window().maximize();
        //d = new EdgeDriver();

    }

    @Test
    public void newslogin() {


        d.get("https://www.overlandescape.com/flight");
        d.findElement(By.xpath("//div[normalize-space()='Where From ?']")).click();
        d.findElement(By.xpath("(//div[@class='item selected'])[1]")).click();
        d.findElement(By.xpath("//div[@class='item selected']")).click();
        d.get("https://www.easemytrip.com/");
       d.findElement(By.xpath("//input[@id='FromSector_show']")).click();
        d.findElement(By.xpath("//div[@id='showOWRT']//div[@class='fss_flex depcity_colm sechver']//li[1]//div[1]//div[1]")).click();
       d.findElement(By.xpath("//body/form[@id='frmHome']/div[@class='top_bg_ofr']/div[@id='divNewSearchEngine']/div[@class='innerwrapSE']/div[@id='showOWRT']/div[@class='nwsearch_wrap']/div[@class='fss_flex arrcity_colm sechver']/div[@id='toautoFill_in']/div[@id='toautoFill']/ul[@class='ausuggest']/li[3]/div[1]")).click();
        d.findElement(By.xpath(" ")).click();
        d.findElement(By.xpath("//button[normalize-space()='Search']")).click();
        d.findElement(By.xpath("//input[@placeholder='firstname']")).click();

        d.get("https://www.overlandescape.com/");
       d.findElement(By.xpath("//div[@class='select_from_wrap']//input[@class='search']")).sendKeys("Kolkata", Keys.ENTER);
          d.get("http://uvindianews.com/admin");
        d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin@uvindianews.com");
        d.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("uvindia@2022");
 d.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
       d.findElement(By.xpath("/html/body/div/aside/section/ul/li[4]/a")).click();
       d.findElement(By.xpath("/html/body/div/aside/section/ul/li[4]/ul/li[1]/a")).click();
        d.findElement(By.xpath("/html/body/div/div/section[1]/h1/span/a")).click();

   // For updating Tittle
       d.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("Hello this is the title");
     d.findElement(By.xpath("//*[@id=\"hindi_title\"]")).sendKeys("This is the hindi title");
        d.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("Hello this is the title");
d.findElement(By.xpath("//*[@id=\"parent_id\"]")).click();
 WebElement select = d.findElement(By.xpath("//*[@id=\"parent_id\"]"));
        Select selectObject = new Select(select);
        selectObject.selectByVisibleText("India News");
                WebElement selecttwo = d.findElement(By.xpath("//span[@class='placeholder']"));
        selecttwo.click();
     d.findElement(By.xpath("//*[@id=\"add_form\"]/div[1]/div[4]/div[2]/div/div/div/ul/li[7]/label")).click();
     d.findElement(By.xpath("//*[@id=\"add_form\"]/div[1]/div[4]/div[2]/div/div/div/ul/li[6]/label")).click();
     d.findElement(By.xpath("body > p")).sendKeys("Lorem");
        WebElement selectth = d.findElement(By.xpath("/html/body/p"));
       selectth.click();
        selectth.sendKeys("loremipsumloremipsumloremipsumloremipsum");

        List<WebElement> checkboxes = d.findElements(By.xpath("//span[@class='placeholder']"));
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(checkboxes.size());
           WebElement checkbox = checkboxes.get(randomIndex);
           checkbox.click();
        }


     WebElement de= d.findElement(By.xpath("//span[@class='placeholder']"));
        Select s=new Select(de);
        List t =s.getOptions();
        System.out.println("Options are: ");
       for (Object i: t){
           s.selectByVisibleText("LEGAL");
        }


       List z=s.getOptions();
       System.out.println("//input[@placeholder='firstname']");
       z.stream().toArray();
         //WebElement selectd = d.findElement("LEGAL").click();
         testOpenWebPage();
         d.manage();
         d.findElement(By.xpath("legalise"));
         //System.out.println(z);


       //return true if multi-select dropdown
        //Boolean b=s.isMultiple();

        System.out.println("Boolen value for drodown: "+ b);


        WebElement selectone = d.findElement(By.xpath("//span[@class='placeholder']"));
       selectone.click();
        Select selectdrp= new Select(selectone);
        selectdrp.selectByVisibleText("LEGAL");


int size = AllCheckboxes.size();
         System.out.println(size);
       for(int i = 0; i<size; i++) {
          AllCheckboxes.get(i).click();

    }


    d.findElement(By.xpath("//span[@class='placeholder']")).click();
    selectdrop.getOptions();
    System.out.println(selectdrop.getOptions());

     List<WebElement> options= selectdrop.getOptions();
    System.out.println(options.size());

      for (WebElement e: options)
    {
    System.out.println("The dropdown are"+e.getText());
    }


     d.findElement(By.xpath("")).click();


     d.findElement(By.xpath("//*[@class='SumoSelect sumo_additional_categories open']")).getText().contains("ESI News");


     WebElement select0 = d.findElement(By.xpath("//*[@title='Select Company']"));
    Select selectObject0 = new Select(select0);
    selectObject0.selectByVisibleText("LEGAL");


}
}

