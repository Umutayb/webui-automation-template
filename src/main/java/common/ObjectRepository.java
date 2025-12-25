package common;

import lombok.Getter;
import pages.*;
import pickleib.utilities.interfaces.repository.PageObjectRepository;
import pickleib.utilities.interfaces.repository.PageRepository;

@SuppressWarnings("unused")
public class ObjectRepository implements PageObjectRepository {

    @Getter
    public enum Environment {
        test("test-url"),
        dev("dev-url"),
        acceptance("acc-url");

        final String urlKey;

        Environment(String urlKey){
            this.urlKey = urlKey;
        }
    }

    public static Environment environment;

    //Pages
    PracticeFormPage practiceFormPage;
    BookDetailsPage bookDetailsPage;
    BookStorePage bookStorePage;
    LandingPage landingPage;
    ProfilePage profilePage;
    ToolsPage toolsPage;
    LoginPage loginPage;
}
