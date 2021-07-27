import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData 
{
	public static void main(String[] args) throws Exception {
		String path = "E:\\ReadData.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowCount = sh.getPhysicalNumberOfRows();
		int ColCount = sh.getRow(0).getLastCellNum();
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; i < ColCount; j++) 
			{
				Cell cl = sh.getRow(i).getCell(j);
				System.out.println(cl);
			}
		}
	}
}
