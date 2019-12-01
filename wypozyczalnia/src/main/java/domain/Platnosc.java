package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Platnosc {

    @Id
    @GeneratedValue
    private long id_platnosci;
    private String typ;
    private boolean faktura;

    public long getId_platnosci() {
        return id_platnosci;
    }

    public void setId_platnosci(long id_platnosci) {
        this.id_platnosci = id_platnosci;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public boolean isFaktura() {
        return faktura;
    }

    public void setFaktura(boolean faktura) {
        this.faktura = faktura;
    }
}
