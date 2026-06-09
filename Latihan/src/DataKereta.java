import java.util.List;

public interface DataKereta {
    List<Kereta> getDaftarKereta();
    Kereta cariKodeKereta(String kodeKereta);
}
