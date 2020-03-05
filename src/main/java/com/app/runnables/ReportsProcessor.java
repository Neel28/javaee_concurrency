package com.app.runnables;

import com.app.beans.BankAccount;
import com.app.beans.BankAccountTransaction;
import com.app.dao.BankAccountDao;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.concurrent.Callable;

/**
 *
 * @author neels
 */
public class ReportsProcessor implements Callable<Boolean> {

    private BankAccount account;
    private BankAccountDao dao;

    public ReportsProcessor(BankAccount account, BankAccountDao dao) {
        this.account = account;
        this.dao = dao;
    }

    @Override
    public Boolean call() throws Exception {
        boolean reportGenerated = false;
        List<BankAccountTransaction> transactions = dao.getTransactionsForAccount(account);
        File file = new File("/Users/neelshah/IdeaProjects/javaee_concurrency_1/reports/" + account.getAccNumber() + "_tx_report.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (BankAccountTransaction transaction : transactions) {

                writer.write("Account Number: " + transaction.getAccNumber());
                writer.write("Transaction type: " + transaction.getTxType());
                writer.write("Tx Id: " + transaction.getTxId());
                writer.write("Amount: " + transaction.getAmount());
                writer.write("Transaction Date: " + transaction.getTxDate());
                writer.newLine();

            }
            writer.flush();

        }
        reportGenerated = true;
        return reportGenerated;
    }

}
