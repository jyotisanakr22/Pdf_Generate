package com.pdfexample.utility;

import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGenerator {
	
	
	private static final String FILE_NAME = "C:\\Users\\PRANESH GHOSH\\Documents\\workspace-spring-tool-suite-4-4.8.1.RELEASE\\pdf_generate_example\\pdfdocs\\sample3.pdf";

    public void writeUsingIText() {

        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

            //open
            document.open();

            Paragraph p = new Paragraph();
            p.add("Ticket");
            p.setAlignment(Element.ALIGN_CENTER);

            document.add(p);

//            Paragraph p2 = new Paragraph();
//            p2.add("This is my paragraph 2"); //no alignment
//
//            document.add(p2);

            Font f = new Font();
            f.setStyle(Font.BOLD);
            f.setSize(8);

            document.add(new Paragraph("Ticket Details", f));

//            //close
//            document.close();
            
          //Create Table object, Here 2 specify the no. of columns
            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);
            
            //Create cells
            PdfPCell cell1 = new PdfPCell(new Paragraph("Cell 1"));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Cell 2"));
            cell1.setColspan(2);
     
            //Add cells to table
            table.addCell(cell1);
            table.addCell(cell2);
     
            //Add content to the document using Table objects.
            document.add(table);
     
            //Close document and outputStream.
            document.close();
            //outputStream.close();

            System.out.println("Done");
         
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}

