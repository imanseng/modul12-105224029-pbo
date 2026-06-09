import java.util.ArrayList;
import java.util.List;

public class InitDataKereta implements DataKereta {
    private List<Kereta> daftarKereta;

    public InitDataKereta() {
        daftarKereta = new ArrayList<>();
        daftarKereta.add(new Kereta("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarKereta.add(new Kereta("K02", "Parahyangan", "JKT - BDG", 15));
    }

    @Override
    public List<Kereta> getDaftarKereta() {
        return daftarKereta;
    }

    @Override
    public Kereta cariKodeKereta(String kodeKereta) {
        for (Kereta k : daftarKereta) {
            if (k.getKodeKereta().equalsIgnoreCase(kodeKereta)) {
                return k;
            }
        }
        return null;
    }
}
