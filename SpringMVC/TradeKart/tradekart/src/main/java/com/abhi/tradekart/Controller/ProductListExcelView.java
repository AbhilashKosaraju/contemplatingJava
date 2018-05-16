package com.abhi.tradekart.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.springframework.web.servlet.view.document.AbstractXlsView;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.abhi.tradekartserver.dao.ProductDAO;
import com.abhi.tradekartserver.daoimpl.CategoryDAOImpl;
import com.abhi.tradekartserver.daoimpl.ProductDAOImpl;
import com.abhi.tradekartserver.dto.Product;

public class ProductListExcelView<T> extends AbstractExcelView {

	private static final Logger logger = LoggerFactory.getLogger(ProductListExcelView.class);

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ProductDAOImpl pro = new ProductDAOImpl();

		HSSFSheet excelSheet = workbook.createSheet("ListOfProducts");
		setExcelHeader(excelSheet);

		@SuppressWarnings("unchecked")
		List<Product> producList = (List<Product>) model.get("productList");

		HSSFRow productRow = excelSheet.createRow(1);
		productRow.createCell(0).setCellValue("1");
		productRow.createCell(1).setCellValue("PRDABC123DEFX");
		productRow.createCell(2).setCellValue("iPhone 5s");
		productRow.createCell(3).setCellValue("apple");
		productRow.createCell(4).setCellValue("Iphone 7 used at best condtion with longer battery life!");
		productRow.createCell(5).setCellValue("6000");
		productRow.createCell(6).setCellValue("2");
		productRow.createCell(7).setCellValue("true");

		HSSFRow productRow2 = excelSheet.createRow(2);
		productRow2.createCell(0).setCellValue("2");
		productRow2.createCell(1).setCellValue("PRDDEF123DEFX");
		productRow2.createCell(2).setCellValue("Samsung Galaxy");
		productRow2.createCell(3).setCellValue("samsung");
		productRow2.createCell(4).setCellValue("Assembled samsung smart phone !");
		productRow2.createCell(5).setCellValue("6000");
		productRow2.createCell(6).setCellValue("2");
		productRow2.createCell(7).setCellValue("true");
		
		HSSFRow productRow3 = excelSheet.createRow(3);
		productRow3.createCell(0).setCellValue("3");
		productRow3.createCell(1).setCellValue("PRDPQR123WGTX");
		productRow3.createCell(2).setCellValue("AseusSlim");
		productRow3.createCell(3).setCellValue("Asus");
		productRow3.createCell(4).setCellValue("This is a used slim laptop!");
		productRow3.createCell(5).setCellValue("7000");
		productRow3.createCell(6).setCellValue("1");
		productRow3.createCell(7).setCellValue("true");
				
		HSSFRow productRow9 = excelSheet.createRow(4);
		productRow9.createCell(0).setCellValue("4");
		productRow9.createCell(1).setCellValue("PRDMNO123PQRX");
		productRow9.createCell(2).setCellValue("Macbook Pro");
		productRow9.createCell(3).setCellValue("apple");
		productRow9.createCell(4).setCellValue("Macbook Pro in good condition!");
		productRow9.createCell(5).setCellValue("6000");
		productRow9.createCell(6).setCellValue("1");
		productRow9.createCell(7).setCellValue("true");
				
		HSSFRow productRow4 = excelSheet.createRow(5);
		productRow4.createCell(0).setCellValue("5");
		productRow4.createCell(1).setCellValue("PRDABCXYZDEFX");
		productRow4.createCell(2).setCellValue("Dell Aspiron");
		productRow4.createCell(3).setCellValue("dell");
		productRow4.createCell(4).setCellValue("Dell laptop with no defects!");
		productRow4.createCell(5).setCellValue("6000");
		productRow4.createCell(6).setCellValue("0");
		productRow4.createCell(7).setCellValue("true");
		

		HSSFRow productRow5 = excelSheet.createRow(6);
		productRow5.createCell(0).setCellValue("6");
		productRow5.createCell(1).setCellValue("PRD9F71C6452D");
		productRow5.createCell(2).setCellValue("MiniCooper Car");
		productRow5.createCell(3).setCellValue("MiniCooper");
		productRow5.createCell(4).setCellValue("MiniCooper in Good Condition!");
		productRow5.createCell(5).setCellValue("6000");
		productRow5.createCell(6).setCellValue("3");
		productRow5.createCell(7).setCellValue("false");
		
		
		HSSFRow productRow6 = excelSheet.createRow(7);
		productRow6.createCell(0).setCellValue("7");
		productRow6.createCell(1).setCellValue("PRD2D8ED4D7D8");
		productRow6.createCell(2).setCellValue("MI3 mobile");
		productRow6.createCell(3).setCellValue("MI3");
		productRow6.createCell(4).setCellValue("MI3 mobile phone in good condition");
		productRow6.createCell(5).setCellValue("6000");
		productRow6.createCell(6).setCellValue("2");
		productRow6.createCell(7).setCellValue("true");
		
		
		HSSFRow productRow7 = excelSheet.createRow(8);
		productRow7.createCell(0).setCellValue("8");
		productRow7.createCell(1).setCellValue("PRD9D3F952209");
		productRow7.createCell(2).setCellValue("Sedan");
		productRow7.createCell(3).setCellValue("Mercedes");
		productRow7.createCell(4).setCellValue("Mercedes car in good condition");
		productRow7.createCell(5).setCellValue("6000");
		productRow7.createCell(6).setCellValue("2");
		productRow7.createCell(7).setCellValue("true");
		

		HSSFRow productRow8 = excelSheet.createRow(9);
		productRow8.createCell(0).setCellValue("9");
		productRow8.createCell(1).setCellValue("PRD0AAB384502");
		productRow8.createCell(2).setCellValue("philips");
		productRow8.createCell(3).setCellValue("Microwen");
		productRow8.createCell(4).setCellValue("Good one");
		productRow8.createCell(5).setCellValue("350");
		productRow8.createCell(6).setCellValue("1");
		productRow8.createCell(7).setCellValue("true");
		// setExcelRows(excelSheet, producList);
		
		HSSFRow productRow10 = excelSheet.createRow(10);
		productRow10.createCell(0).setCellValue("10");
		productRow10.createCell(1).setCellValue("PRD0AAB384502");
		productRow10.createCell(2).setCellValue("adiddas");
		productRow10.createCell(3).setCellValue("Juicer");
		productRow10.createCell(4).setCellValue("A very Good one");
		productRow10.createCell(5).setCellValue("150");
		productRow10.createCell(6).setCellValue("3");
		productRow10.createCell(7).setCellValue("true");
		
		
		

	
		

	}

	public void setExcelHeader(HSSFSheet exSheet) {

		HSSFRow excelHeader = exSheet.createRow(0);
		excelHeader.createCell(0).setCellValue("ID");
		excelHeader.createCell(1).setCellValue("Code");
		excelHeader.createCell(2).setCellValue("Name");
		excelHeader.createCell(3).setCellValue("Brand");
		excelHeader.createCell(4).setCellValue("Description");
		excelHeader.createCell(5).setCellValue("UnitPrice");
		excelHeader.createCell(6).setCellValue("Quantity");
		excelHeader.createCell(7).setCellValue("Availability");

	}

	public void setExcelRows(HSSFSheet xSheet, List<Product> pList) {
		int rowCount = 1;
		for (Product product : pList) {
			HSSFRow productRow = xSheet.createRow(rowCount++);
			productRow.createCell(0).setCellValue(product.getId());
			productRow.createCell(1).setCellValue(product.isActive());
			productRow.createCell(2).setCellValue(product.getBrand());
			productRow.createCell(3).setCellValue(product.getCategoryId());
			productRow.createCell(4).setCellValue(product.getCode());
			productRow.createCell(5).setCellValue(product.getDescription());
			productRow.createCell(6).setCellValue(product.getName());
			productRow.createCell(7).setCellValue(product.getPurchases());
			productRow.createCell(8).setCellValue(product.getQuantity());
			productRow.createCell(9).setCellValue(product.getSupplierId());
			productRow.createCell(10).setCellValue(product.getUnitPrice());
			productRow.createCell(11).setCellValue(product.getViews());
		}
	}

}

