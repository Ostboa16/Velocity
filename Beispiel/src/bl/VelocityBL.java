/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class VelocityBL {
    private final LocalDate datum;
    private final LocalTime uhrzeit;
    private final String kennzeichen;
    private final int gemessen, erlaubt, uebertretung;

    public VelocityBL(LocalDate datum, LocalTime uhrzeit, String kennzeichen, int gemessen, int erlaubt, int uebertretung) {
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.kennzeichen = kennzeichen;
        this.gemessen = gemessen;
        this.erlaubt = erlaubt;
        this.uebertretung = uebertretung;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public LocalTime getUhrzeit() {
        return uhrzeit;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getGemessen() {
        return gemessen;
    }

    public int getErlaubt() {
        return erlaubt;
    }

    public int getUebertretung() {
        return uebertretung;
    }
    
    
}
