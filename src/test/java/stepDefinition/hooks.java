package stepDefinition;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

    @Before("@MobileTest")
    public void beforevalidation(){
        System.out.println("Hooks for mobiletest before test");

    }
    @After("@MobileTest")
    public void Aftervalidation(){
        System.out.println("Hooks for mobiletest after test");

    }
    @Before("@WebTest")
    public void beforewebtest(){
        System.out.println("Hooks for webtest before test");

    }
    @After("@WebTest")
    public void Afterwebtest(){
        System.out.println("Hooks for webtest after test");

    }

}
