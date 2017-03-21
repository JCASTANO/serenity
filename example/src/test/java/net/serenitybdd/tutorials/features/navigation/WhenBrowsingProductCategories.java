package net.serenitybdd.tutorials.features.navigation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.tutorials.steps.NavigatingUser;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

/**
 * Created by john on 9/05/2016.
 */
@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {

    @Steps
    NavigatingUser mark;

    @Managed(driver="chrome")
    WebDriver browser;

    @Test
    public void shouldBeAbleToNavigateToTheMotorsCategory() {
        // Given
        mark.isOnTheHomePage();

        // When
        mark.click();

        // Then
        mark.hola();
    }
}
