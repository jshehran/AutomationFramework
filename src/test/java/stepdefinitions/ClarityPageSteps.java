package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.ClarityTestPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClarityPageSteps {

	private ClarityTestPage clarityPage = new ClarityTestPage(DriverFactory.getDriver());
	
	@Given("Navigate to the page: {string}")
	public void navigate_to_the_page(String url) {
		clarityPage.openBrowserUrl(url);
	}

	@When("Click on the button {string}")
	@And("click on the button {string}")
	public void click_on_the_button(String buttonName) {
		clarityPage.doClickButton(buttonName);
	}
	
	@When("Double Click on the button {string}")
	public void double_click_on_the_button(String buttonName) {
		clarityPage.doDoubleClickButton(buttonName);
	}
	
	@When("Move the mouse over the button {string}")
	public void move_the_mouse_over_the_button(String buttonName) {
		clarityPage.doMouseOver(buttonName);
	}

	@Then("Validate that the message {string} is displayed for Button Click")
	public void validate_that_the_message_is_displayed_for_click(String displayMessage) {
		String webMessage = clarityPage.getDisplayMessage(By.id("buttonClickMsg"));
		Assert.assertEquals(displayMessage, webMessage);
	}
	
	@Then("Validate that the message {string} is displayed for Double Button Click")
	public void validate_that_the_message_is_displayed_for_dbl_click(String displayMessage) {
		String webMessage = clarityPage.getDisplayMessage(By.id("buttonDblClickMsg"));
		Assert.assertEquals(displayMessage, webMessage);
	}
	
	@Then("Validate that the message {string} is displayed for Mouse Over")
	public void validate_that_the_message_is_displayed_for_mouse_over(String displayMessage) {
		String webMessage = clarityPage.getDisplayMessage(By.id("buttonMouseOverMsg"));
		Assert.assertEquals(displayMessage, webMessage);
	}
	
	@When("Insert {string} value in the Input1 text field")
	public void insert_value_in_the_input1_text_field(String textToEnter) {
		clarityPage.enterText(textToEnter);
	}

	@Then("Validate that all other input fields contain the {string} inserted initially")
	public void validate_that_all_other_input_fields_contain_the_inserted_initially(String textToValidate) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 20);
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("input_text2"), textToValidate));
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("input_text3"), textToValidate));
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("input_text4"), textToValidate));
	}

	@When("Validate that all the four input fields are empty")
	public void validate_that_all_the_four_input_fields_are_empty() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 20);
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("input_text1"), ""));
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("input_text2"), ""));
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("input_text3"), ""));
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("input_text4"), ""));
	}
}
