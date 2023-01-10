package allTest;

import baseClass.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/features/SignUp.feature"},
				 glue = {"allTest"}, plugin = {"pretty"}, monochrome = true)
public class CucumberRunner extends BaseClass
{

}
