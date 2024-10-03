package steps;

import io.cucumber.java.en.Given;
import pages.MainPage;

public class ThinkingContactListSteps {

    MainPage landingPage = new MainPage();
    

    /**
     * Given step definition
     */
    @Given("I navigate to Thinking Contact List page")
    public void navigateToThinkingContactList(){
        landingPage.navigateToThinkingContactList();
        
    }
}
