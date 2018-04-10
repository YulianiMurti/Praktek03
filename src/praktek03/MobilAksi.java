package praktek03;

public class MobilAksi {
    public static void main(String[] args) {
        Mobil s = new Mobil();

        s.setMerk("Honda");
        s.setWarna("Biru");
        s.setHarga(1900);
        
        s.cetakInfo();
        
        System.out.print("Merknya \t:");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t:");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t:");
        System.out.println(s.getHarga());
    }
    

}
