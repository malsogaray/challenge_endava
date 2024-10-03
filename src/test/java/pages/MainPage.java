package pages;

public class MainPage extends BasePage {

    public MainPage() {
        super(driver);
    }

    //Navigate to main page
    public void navigateToThinkingContactList() {
        navigateTo("https://thinking-tester-contact-list.herokuapp.com/");
    }

}
