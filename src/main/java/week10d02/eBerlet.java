package week10d02;

import java.time.LocalDateTime;

public class eBerlet {

    private int megallo;
    private LocalDateTime time;
    private String berletId;
    private BerletTipus berletTipusa;
    private String atmeneti;

    public eBerlet(int megallo, LocalDateTime time, String berletId, BerletTipus berletTipusa, String atmeneti) {
        this.megallo = megallo;
        this.time = time;
        this.berletId = berletId;
        this.berletTipusa = berletTipusa;
        this.atmeneti = atmeneti;
    }

    public int getMegallo() {
        return megallo;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getBerletId() {
        return berletId;
    }

    public BerletTipus getBerletTipusa() {
        return berletTipusa;
    }

    public String getAtmeneti() {
        return atmeneti;
    }
}
