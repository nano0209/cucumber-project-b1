package io.loop.utilities.utilities;

public class TestExcel {
    public static void main(String[] args) {


        ExcelUtils excelUtils = new ExcelUtils("/Users/naima/OneDrive/Desktop/Book1.xlsx", "Sheet1");
        System.out.println("data from excel:" + excelUtils.getCellData(3, 1));

    }


}