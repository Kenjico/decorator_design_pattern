public class Main {
    public static void main(String[] args) {

        //Fall 1 kompletter Durchlauf
        Patient test = new invoiceEBM(new Medication( new SideDiagnose( new MainDiagnose( new PatientImpl()))));
        System.out.println( test.startDiagnose());

        //Fall 2 Nur Medikation abgeholt
        Patient medi = new Medication(new PatientImpl());
       System.out.println(medi.startDiagnose());
    }
}
