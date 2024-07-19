//package Practice;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.apache.poi.xssf.usermodel.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
////public class MultipleLogin {
//
//	public static void main(String[] args) throws FileNotFoundException, Exception {
//
//
//		XSSFWorkbook excleworkbook= null;
//		XSSFSheet exclesheet;
//		XSSFRow row;
//		XSSFCell cell;
//
//		//Create Object For Open File Excle 	
//
//		File path = new File("C:\\Users\\SONY\\OneDrive\\Desktop\\TestDataSauce.xlsx");
//
//		FileInputStream fis = new FileInputStream(path);
//
//
//		try {
//			excleworkbook =new XSSFWorkbook(fis);
//		} catch (IOException e1) {
//
//			e1.printStackTrace();
//		}
//
//		exclesheet =excleworkbook.getSheetAt(0);
//		int totalrow = exclesheet.getLastRowNum();
//		int totalcell =exclesheet.getRow(0).getLastCellNum();  //Count Number of cell/coloum 
//
//		System.out.println("Total Rows "+ totalrow);
//		System.out.println("Total Cell/coloumn " +totalcell);
//		int i=0;
//		for(int currentrow=1; currentrow <totalrow; currentrow++ ) {
//			//	for(int currentcell=0;currentcell< totalcell ; currentcell++){
//			//String value = exclesheet.getRow(currentrow).getCell(currentcell).getStringCellValue();
//
//
//
//			WebDriver driver =new ChromeDriver();
//			driver.get("https://www.saucedemo.com/");
//			driver.manage().window().maximize();
//			driver.findElement(By.id("user-name")).sendKeys(exclesheet.getRow(currentrow).getCell(0).toString());
//
//			driver.findElement(By.id("password")).sendKeys(exclesheet.getRow(currentrow).getCell(1).toString());
//			Thread.sleep(3000);
//			driver.findElement(By.id("login-button")).click();
//
//			i++;
//			//System.out.print(value +"\t");
//			System.out.println("Done "+ i);
//
//
//			driver.quit();
//		}
//		System.out.println();
//
//		try {
//			excleworkbook.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//}
