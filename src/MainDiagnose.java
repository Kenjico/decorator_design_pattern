public class MainDiagnose extends PatientDecorator {
    public MainDiagnose(Patient pat) {
        super(pat);
    }

    @Override
    public String startDiagnose() {
       return super.startDiagnose() + addMainDiagnose();

    }

    public String addMainDiagnose(){
        return "Eine Hauptdiagnose wird hinzugefügt...";
    }
}
