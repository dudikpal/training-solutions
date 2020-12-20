package iozip.transactions;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TransactionFileManager {

    public void saveTransactions(Path path, List<Transaction> transactions) {
        try (ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))){
            for (Transaction transaction: transactions) {
                zos.putNextEntry(new ZipEntry(Long.toString(transaction.getId())));
                zos.write(transaction.getTime().toString().getBytes());
                zos.write("\n".getBytes());
                zos.write(transaction.getAccount().getBytes());
                zos.write("\n".getBytes());
                zos.write(Double.toString(transaction.getAmount()).getBytes());
            }

        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file, ", ioe);
        }
    }
}
