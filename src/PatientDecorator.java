public class PatientDecorator implements Patient {
    protected Patient pat;

    public PatientDecorator(Patient pat){
        this.pat = pat;
    }

    @Override
    public String startDiagnose() {
        return this.pat.startDiagnose();
    }
}
