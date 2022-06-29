public class SideDiagnose extends PatientDecorator {
    public SideDiagnose(Patient pat) {
        super(pat);
    }

    @Override
    public String startDiagnose() {
        return super.startDiagnose() + addSideDiagnose();
    }

    public String addSideDiagnose(){
        return "Eine Nebendiagnose wird hinzugefügt...";
    }
}
