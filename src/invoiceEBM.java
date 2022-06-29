public class invoiceEBM extends PatientDecorator{
    public invoiceEBM(Patient pat) {
        super(pat);
    }

    @Override
    public String startDiagnose() {
        return super.startDiagnose() + calculateInvoiceEBM();
    }

    public String calculateInvoiceEBM(){
        return "Alle EBM Ziffer werden verrechnet und an die KV versendet...";
    }
}
