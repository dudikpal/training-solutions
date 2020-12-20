package iodatastream.bank;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class BankAccountManager {

    public void saveAccount(BankAccount bankAccount, Path path) {
        Path file = path.resolve(bankAccount.getAccountNumber());
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(file)))){
            dos.writeUTF(bankAccount.getAccountNumber());
            dos.writeUTF(bankAccount.getOwner());
            dos.writeDouble(bankAccount.getBalance());
        } catch (IOException ex) {
            throw new IllegalStateException("Cannot write file, ", ex);
        }
    }

    public BankAccount loadAccount(InputStream is) {

        try (DataInputStream dis = new DataInputStream(is)){
            return new BankAccount(dis.readUTF(), dis.readUTF(), dis.readDouble());
        } catch (IOException ex) {
            throw new IllegalStateException("Cannot read file, ", ex);
        }
    }
}
