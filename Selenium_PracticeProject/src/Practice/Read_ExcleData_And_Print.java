package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Read_ExcleData_And_Print {

	public static void main(String[] args) throws FileNotFoundException     {
		// Read Excle Data And Print It On Console
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+".//ProjectData\\Practicesheet.xls");
		Workbook wb = null;
		try {
			wb = Workbook.getWorkbook(file);
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Sheet st=wb.getSheet(0);

		int row=st.getRows();  // Count the Number Of Rows In Excel File ;
		int colm=st.getColumns();  //Count the Number Of Coloums In Excel File ;

		String sheetname= st.getName();         //To print Sheet Name
		System.out.println("Sheet Name is- "+sheetname); 
		System.out.println("Total Rows are :- "+ row); 
		System.out.println("Total Coloums are:- "+ colm);

		// #1 Retrieving the data from excel first rows
		String Empid =st.getCell(1,1).getContents();
		String dept = st.getCell(2, 1).getContents();
		String EmpName=st.getCell(3,1).getContents();
		String email =st.getCell(4,1).getContents();
		String cno= st.getCell(5,1).getContents();
		System.out.println(Empid+"\t"+dept+"\t"+EmpName+"\t"+email+"\t"+cno+"\n");

		System.out.println("****First Row Printed***");

		//#2 Retrieve All Excel Sheet Data and Print on Console

		for(int i=0;i<row;i++) {

			for(int j=0;j<colm;j++) {
				String value=st.getCell(j, i).getContents();
				System.out.print(value +"\t");

			} 
			System.out.println();
		}


		//#3 Check Value of "Naresh IT" Where it Present ;
		for(int k=0;k<row;k++) {

			for(int n=0;n<colm;n++) {
				String data=st.getCell(n,k).getContents();

				if(data.equals("IT")) {
					System.out.println("Cell Number is- "+n+" "+k);

				}
			}
		}

		wb.close();
		System.out.println("***Test Passed***");
	}


}

