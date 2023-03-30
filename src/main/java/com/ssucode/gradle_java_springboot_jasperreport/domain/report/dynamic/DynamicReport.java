package com.ssucode.gradle_java_springboot_jasperreport.domain.report.dynamic;

import com.ssucode.gradle_java_springboot_jasperreport.domain.report.ExportType;
import com.ssucode.gradle_java_springboot_jasperreport.domain.report.Report;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;

public class DynamicReport extends Report {
  private final DynamicReportProperties dynamicReportProperties;

  public DynamicReport(
      InputStream inputStream,
      String title,
      ExportType exportType,
      HttpServletResponse response,
      DynamicReportProperties dynamicReportProperties) {
    super(inputStream, title, null, exportType, response);
    this.dynamicReportProperties = dynamicReportProperties;
  }

  public DynamicReportProperties getDynamicReportProperties() {
    return dynamicReportProperties;
  }
}
