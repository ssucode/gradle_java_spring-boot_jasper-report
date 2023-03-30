package com.ssucode.gradle_java_springboot_jasperreport.controller.report;

import com.ssucode.gradle_java_springboot_jasperreport.domain.report.ExportType;
import com.ssucode.gradle_java_springboot_jasperreport.service.report.ReportService;
import com.ssucode.gradle_java_springboot_jasperreport.service.transaction.TransactionService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
public class ReportController implements ReportApi {

  private final ReportService reportService;
  private final TransactionService transactionService;

  public ReportController(ReportService reportService, TransactionService transactionService) {
    this.reportService = reportService;
    this.transactionService = transactionService;
  }

  @Override
  public ResponseEntity<Void> downloadTransactionReport(ExportType exportType,
                                                        HttpServletResponse response) throws IOException, JRException {
    reportService.downloadTransactionReport(exportType, response);
    return ResponseEntity.ok().build();
  }

  @Override
  public ResponseEntity<Void> exportDynamicTransactionReport(ExportType exportType, HttpServletResponse response) throws IOException, JRException {
    transactionService.exportTransactionReport(exportType, response);
    return ResponseEntity.ok().build();
  }
}
