package dk.hungarian;

public abstract class Genstand {
    String navn;
    String beskrivelse;
    int styrke;

    public Genstand()  {

    }

    public Genstand(String navn, String beskrivelse, int styrke) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.styrke = styrke;
    }


    public String getNavn() {
        return navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public int getStyrke() {
        return styrke;
    }
}
