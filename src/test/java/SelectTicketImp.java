import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;

import java.util.concurrent.TimeUnit;

public class SelectTicketImp extends BaseSetup{
    @Step("tek yön seçilir")
    public void  oneWay(){
        MobileElement el1 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
        el1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Step("kalkıs yeri sec <key> ")
    public  void destinationFrom(String kalkıs){
        MobileElement el1 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvFromCode");
        el1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement el2 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
        el2.click();
        el2.sendKeys(kalkıs);
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
        el3.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Step("varış yerini seç <key>")
    public void destinationTo(String varis){
        MobileElement el1 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvToCode");
        el1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement el2 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
        el2.click();
        el2.sendKeys(varis);
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
        el3.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Step("tarih tıkla")
    public void Date(){
        MobileElement el6 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_rlDeparture");
        el6.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
        el7.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement el8 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnDone");
        el8.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Step("yetiskin sayısı arttır")
    public void addPasengerAdult(){
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
        el1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Step("ucus ara")
    public void searchFlight(){
        MobileElement el1 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnSearch");
        el1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Step("en üst bilet ekonomik olarak seçilir")
    public void selectEcoTicket(){
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
        el3.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup");
        el4.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement el5 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");
        el5.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
