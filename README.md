# Jasper Report using Spring Boot (Java 11, Gradle)
## Requirements
### Let's create Spring Boot Project from Spring Initializer site [https://start.spring.io/](https://start.spring.io/)
  - Project : Gradle - Groovy
  - Language : Java
  - Project Metadata ...
  - Spring Boot : 2.7.10
  - Packaging : War
  - Java : 11

### Version as :
* Java : [java-11-openjdk-11.0.15.9-1.windows.ojdkbuild.x86_64.zip](https://github.com/ojdkbuild/ojdkbuild/releases/download/java-11-openjdk-11.0.15.9-1/java-11-openjdk-11.0.15.9-1.windows.ojdkbuild.x86_64.zip)
* JasperReports : [net.sf.jasperreports:jasperreports:6.16.0](https://mvnrepository.com/artifact/net.sf.jasperreports/jasperreports/6.16.0)
* itext : [itext-2.1.7.js4.jar](https://jasperreports.sourceforge.net/maven2/com/lowagie/itext/2.1.7.js4/itext-2.1.7.js4.jar) (download include libs folder)
## Export (PDF, EXCEL, CSV, DOCX)
### Reference Documentation
Run the application.
Then, Export:
* PDF: [http://localhost:8080/reports/transactions/download?exportType=PDF](http://localhost:8080/reports/transactions/download?exportType=PDF)
* EXCEL: [http://localhost:8080/reports/transactions/download?exportType=EXCEL](http://localhost:8080/reports/transactions/download?exportType=EXCEL)
* CSV: [http://localhost:8080/reports/transactions/download?exportType=CSV](http://localhost:8080/reports/transactions/download?exportType=CSV)
* DOCX: [http://localhost:8080/reports/transactions/download?exportType=DOCX](http://localhost:8080/reports/transactions/download?exportType=DOCX)

### Download [Jaspersoft Studio](https://community.jaspersoft.com/project/jaspersoft-studio) to modify the template (file with .jrxml extension) as you like.
#### Templates are: 
* PDF: transaction_report_pdf.jrxml
* EXCEL: transaction_report_excel.jrxml
* CSV: transaction_report_csv.jrxml
* DOCX: transaction_report_docx.jrxml

### Credits:
* https://github.com/jamilxt/java_spring-boot_japser-report