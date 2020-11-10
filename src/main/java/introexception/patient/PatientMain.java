package introexception.patient;

public class PatientMain {

    public static void main(String[] args) {

        SsnValidator ssnValidator = new SsnValidator();
        Patient patient = new Patient("Káka János", "176070861", 1976);
        ssnValidator.isValidSsn(patient.getSocialSecurityNumber());

        Patient patient1 = new Patient("Pikó Gáza", "12345678", 1955);
        ssnValidator.isValidSsn(patient1.getSocialSecurityNumber());

        Patient patient2 = new Patient("Krimó Gertrúd", ssnValidator.validSsnGenerator(), 1980);
        ssnValidator.isValidSsn(patient2.getSocialSecurityNumber());
    }
}
