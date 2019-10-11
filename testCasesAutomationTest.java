package scripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testCasesAutomationTest {
		
		//Dataprovider
		@DataProvider(name = "DP1")
		public Object[][] readExcel(){
			return new Object[][] {
				{"Navigate to Contract > Resume"}
			};
		}
		//Test
		@Test(dataProvider = "DP1")
		public void startTest(String data1) throws IOException {
			String testStep = data1;
			String menu,subMenu;
			fileCreator create = new fileCreator();
			testStepAnalyzer analyzer = new testStepAnalyzer();
			codeMaker maker = new codeMaker();
			
			create.createFile();
			create.writeInFile(maker.coder(analyzer.encodeStep(testStep))); 
		}
		
		@BeforeClass
		public void start() {
			System.out.println("Before test");
		}
		@AfterClass
		public void close() {
			System.out.println("After test");
		}
}
