public class Medication extends PatientDecorator {
    public Medication(Patient pat) {
        super(pat);
    }

    @Override
    public String startDiagnose() {
        return super.startDiagnose() + addMedication();
    }

    public String addMedication(){
        return "Medikationen werden ausgeschrieben...";
    }
}
