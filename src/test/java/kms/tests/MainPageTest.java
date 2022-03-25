package kms.tests;

import com.codeborne.selenide.Condition;
import kms.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPageTest extends TestBase {
    @Test
    @Description("Main UI checks")
    @DisplayName("Call Center title check")
    void callCenterTest() {
        step("Open https://www.kmslh.com/", () -> {
            open("https://www.kmslh.com/");
        });

        step("Set cursor on the 'Products' title", () -> {
            $("#sf-menu .menu-item-147 > a", 1).hover();
        });

        step("Click 'Call Center'", () -> {
            $(".menu-item-147 .menu-item-4107 .menu-item-458", 1).click();
        });

        step("Verify 'Call Center' title", () -> {
            $("#single_product_hero .left h1").shouldHave(Condition.text("Provide agents real-time on-the-spot knowledge"));
        });
    }

    @Test
    @Description("Main UI checks")
    @DisplayName("Self Service title check")
    void selfServiceTest() {
        step("Open https://www.kmslh.com/", () -> {
            open("https://www.kmslh.com/");
        });

        step("Set cursor on the 'Products' title", () -> {
            $("#sf-menu .menu-item-147 > a", 1).hover();
        });

        step("Click 'Self Service'", () -> {
            $(".menu-item-147 .menu-item-4107 .menu-item-462", 1).click();
        });

        step("Verify 'Self Service' title", () -> {
            $("#single_product_hero .left h1").shouldHave(Condition.text("Empower digital transformation"));
        });
    }

    @Test
    @Description("Main UI checks")
    @DisplayName("Branches & Stores title check")
    void branchesStoresTest() {
        step("Open https://www.kmslh.com/", () -> {
            open("https://www.kmslh.com/");
        });

        step("Set cursor on the 'Products' title", () -> {
            $("#sf-menu .menu-item-147 > a", 1).hover();
        });

        step("Click 'Branches & Stores'", () -> {
            $(".menu-item-147 .menu-item-4107 .menu-item-459", 1).click();
        });

        step("Verify 'Self Service' title", () -> {
            $("#single_product_hero .left h1").shouldHave(Condition.text("Meet your customers where it matters most"));
        });
    }

    @Test
    @Description("Main UI checks")
    @DisplayName("Tech Support title check")
    void techSupportTest() {
        step("Open https://www.kmslh.com/", () -> {
            open("https://www.kmslh.com/");
        });

        step("Set cursor on the 'Products' title", () -> {
            $("#sf-menu .menu-item-147 > a", 1).hover();
        });

        step("Click 'Tech Support'", () -> {
            $(".menu-item-147 .menu-item-4107 .menu-item-463", 1).click();
        });

        step("Verify 'ech Support' title", () -> {
            $("#single_product_hero .left h1").shouldHave(Condition.text("Illuminate the way to knowledge for tech support"));
        });
    }

    @Test
    @Description("Main UI checks")
    @DisplayName("Video search test")
    void videoSearchTest() {
        step("Open https://www.kmslh.com/", () -> {
            open("https://www.kmslh.com/");
        });

        step("Set cursor on the 'Resources' title", () -> {
            $("#sf-menu .menu-item-145", 1).click();
        });

        step("Open Type dropdown", () -> {
            $("div > div.right > div > div").click();
        });

        step("Set Video type", () -> {
            $("div.right div ul li:nth-child(6) a").click();
        });

        step("Check the search results", () -> {
            $(".section-title").shouldHave(Condition.text("Video"));
        });
    }

    @Test
    @Description("Main UI checks")
    @DisplayName("Article search test")
    void articleSearchTest() {
        step("Open https://www.kmslh.com/", () -> {
            open("https://www.kmslh.com/");
        });

        step("Set cursor on the 'Resources' title", () -> {
            $("#sf-menu .menu-item-145", 1).click();
        });

        step("Open Type dropdown", () -> {
            $("div > div.right > div > div").click();
        });

        step("Set Article type", () -> {
            $("div.right div ul li:nth-child(1) a").click();
        });

        step("Check the search results", () -> {
            $(".section-title").shouldHave(Condition.text("Article"));
        });
    }

    @Test
    @Description("Main UI checks")
    @DisplayName("Blog search test")
    void blogSearchTest() {
        step("Open https://www.kmslh.com/", () -> {
            open("https://www.kmslh.com/");
        });

        step("Set cursor on the 'Resources' title", () -> {
            $("#sf-menu .menu-item-145", 1).click();
        });

        step("Open Type dropdown", () -> {
            $("div > div.right > div > div").click();
        });

        step("Set Blog type", () -> {
            $("div.right div ul li:nth-child(2) a").click();
        });

        step("Check the search results", () -> {
            $(".section-title").shouldHave(Condition.text("Blog"));
        });
    }

    @Test
    @Description("Main UI checks")
    @DisplayName("eBook search test")
    void ebookSearchTest() {
        step("Open https://www.kmslh.com/", () -> {
            open("https://www.kmslh.com/");
        });

        step("Set cursor on the 'Resources' title", () -> {
            $("#sf-menu .menu-item-145", 1).click();
        });

        step("Open Type dropdown", () -> {
            $("div > div.right > div > div").click();
        });

        step("Set eBook type", () -> {
            $("div.right div ul li:nth-child(3) a").click();
        });

        step("Check the search results", () -> {
            $(".section-title").shouldHave(Condition.text("eBook"));
        });
    }


    @Test
    @Description("Page title test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.kmslh.com/'", () ->
            open("https://www.kmslh.com/"));

        step("Page title should have text 'Knowledge Management System | KMS lighthouse'", () -> {
            String expectedTitle = "Knowledge Management System | KMS lighthouse";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Page console test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.kmslh.com/'", () ->
            open("https://www.kmslh.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}