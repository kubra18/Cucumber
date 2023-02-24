import Base.BaseTest;
import Pages.AllPages;
import Pages.MainPage;
import org.testng.annotations.Test;

public class TC01 extends BaseTest {

    AllPages allPages = new AllPages();

    @Test
    public void test() {
        allPages.mainPage().go_To_Url("https://www.hepsiburada.com");


    }
}