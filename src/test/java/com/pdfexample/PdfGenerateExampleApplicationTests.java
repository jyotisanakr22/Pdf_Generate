package com.pdfexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.pdfexample.utility.ExcelReader;
import com.pdfexample.utility.PdfGenerator;

@SpringBootTest
class PdfGenerateExampleApplicationTests {

	@Test
	void contextLoads() {
//		PdfGenerator pdf = new PdfGenerator();
//		pdf.writeUsingIText();
		ExcelReader read = new ExcelReader();
		read.readExcel();
	}

}
