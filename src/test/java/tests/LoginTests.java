package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{



    @Test
    public void loginSuccess(){

        app.user().initLogin();
        app.user().fillLoginForm("gizmonikus20@yandex.ru","Gordan910117");
        app.user().submitLogin();

    }
}
