import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;

import java.util.concurrent.TimeUnit;

public class HomePageImp extends BaseSetup{

    @Step("izin kabul")
    public void acceptPermission() {
        MobileElement el1 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
        el1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Step("cookie kabul")
    public void acceptCookie(){
        MobileElement el2 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frPrivacy_btnAccept");
        el2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Step("bilet yerine geçis")
    public void findTicket(){
        MobileElement el1 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/acMain_btnBooking");
        el1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
