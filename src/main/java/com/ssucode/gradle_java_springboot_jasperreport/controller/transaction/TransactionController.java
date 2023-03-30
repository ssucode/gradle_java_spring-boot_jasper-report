package com.ssucode.gradle_java_springboot_jasperreport.controller.transaction;

import com.ssucode.gradle_java_springboot_jasperreport.model.transaction.Transaction;
import com.ssucode.gradle_java_springboot_jasperreport.service.transaction.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController implements TransactionApi {

  private final TransactionService transactionService;

  public TransactionController(TransactionService transactionService) {
    this.transactionService = transactionService;
  }

  @Override
  public ResponseEntity<List<Transaction>> getTransactionList() {
    return ResponseEntity.ok(transactionService.getTransactionList());
  }
}
