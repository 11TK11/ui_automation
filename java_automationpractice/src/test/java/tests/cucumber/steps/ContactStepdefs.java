package tests.cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.pageObjects.header.Contact;
import ui.pageObjects.header.MainHeader;

public class ContactStepdefs {
    private static MainHeader mainHeader;
    private Contact contact;
    @Given("navigate to contact page")
    public void navigateToContactPage() {
        mainHeader= new MainHeader();
    }

    @When("fill contact information with following data:")
    public void fillContactInformationWithFollowingData(DataTable dataTable) {
        //List<String> table = dataTable.asList();
        //List<ContactDto> table1 = dataTable.asList(ContactDto.class);
        //var a = dataTable.asMap();
        var a = dataTable.asMaps().get(0);
        //var ab=dataTable.asLists();
        //var setFields=contact.setContactForm(a);
        a.keySet().forEach(field -> contact.setContactForm(a).get(field).Fill());
    }

    @Given("Login to Page")
    public void loginToPage() {
    }

    @Then("^confirmation message '(is|is not)' displayed$")
    public void confirmationMessageIsDisplayed(String validationType) {
    }

    @When("On Contact page, click header")
    public void onContactPageClickHeader() {
        contact = mainHeader.clickOnContactLink();
    }

    @When("^click '(.*)' button$")
    public void clickButton(String buttonName) {
        MainHeader mainHeader;
        Contact contact;
        mainHeader = new MainHeader();
        contact = mainHeader.clickOnContactLink();
    }

    @When("^User Selects \"([^\"]*)\", \"([^\"]*)\", \"(\\d+)\" and \"([\\d+]*)\"$")
    public void user_selects(String origin, String destination, String date, String monthYear) {

    }
}
