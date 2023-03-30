package com.ssucode.gradle_java_springboot_jasperreport.controller.transaction;

import com.ssucode.gradle_java_springboot_jasperreport.model.transaction.Transaction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(path = "transactions")
public interface TransactionApi {

  @GetMapping
  ResponseEntity<List<Transaction>> getTransactionList();
}
