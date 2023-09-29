package glue;

import io.cucumber.java.en.Given;
import page.TestPage;

public class TestGlue {
    TestPage page= new TestPage();

    @Given("^how are you$")
    public void howareyou() {
        page.print();
    }

}
