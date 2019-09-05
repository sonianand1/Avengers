package util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	public static void main (String [] args) throws IOException{
		 //create an object of Workbook and pass the FileInputStream object into it to create a pipeline between the sheet and eclipse.
		 FileInputStream fis = new FileInputStream("C:\\Users\\User1\\Desktop\\Excel.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 
		 XSSFSheet sheet = workbook.getSheet("Sheet1");
		 
		 Row row = sheet.createRow(1);
		 Cell cell = row.createCell(1);
		 
		 //cell.setCellType(cell.CELL_TYPE_STRING);
		 cell.setCellValue("");
		 FileOutputStream fos = new FileOutputStream("C:\\Users\\User1\\Desktop\\Excel.xlsx");
		 workbook.write(fos);
		 fos.close();
		 System.out.println("END OF WRITING DATA IN EXCEL");
		 }
		}


