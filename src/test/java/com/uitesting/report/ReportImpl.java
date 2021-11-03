package com.uitesting.report;

public class ReportImpl extends Report{

    @Override
    public void convertToFormat(String formatType) {
        switch (formatType){
            case "html":
                generateHtmlReport();
                break;
            case "excel":
                // generateExcelReport();
                break;
            default:
                break;
        }
    }

    private void generateHtmlReport() {
        String pageTitle = resultsMap.get("title");
        System.out.println("<html><title> " +pageTitle+"</title><html>");
    }
}
