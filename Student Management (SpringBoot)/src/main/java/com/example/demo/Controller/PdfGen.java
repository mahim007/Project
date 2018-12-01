package com.example.demo.Controller;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PdfGen {

    public void m1(){
        Document document=new Document();
            String dest="result/mydoc.pdf";
            try {
                PdfWriter.getInstance(document, new FileOutputStream(dest));
                document.open();
                document.setPageSize(PageSize.A4);

                Paragraph paragraph=new Paragraph(new Phrase("Hello World"));
                document.add(paragraph);

                document.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (DocumentException e) {
                e.printStackTrace();
            }
    }
}
