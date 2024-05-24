public class Main {
    public static void main(String[] args) {
        Ulat U = new Ulat();
        Kepompong K = new Kepompong();
        KupuDewasa KD = new KupuDewasa();
        Data<Kupu> anu = new Data<>();
        anu.setIsi(U);
        anu.getIsi().gerak();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(KD);
        anu.getIsi().gerak();
    }
}