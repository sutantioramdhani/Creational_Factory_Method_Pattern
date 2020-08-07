public abstract class BidangFactory {
public static Bidang_Bangunan getBidang (String jenisBidang){
       if(jenisBidang.equals(Jenis_bangunan.JAJARGENJANG)){
           return new JajarGenjang();
       }
       else if(jenisBidang.equals(Jenis_bangunan.SEGITIGA)){
           return new Segitiga();
       }
       else if(jenisBidang.equals(Jenis_bangunan.SEGIENAM)){
           return new SegiEnam();
       }
       else if(jenisBidang.equals(Jenis_bangunan.BINTANG)){
           return new Bintang();
       }
       return null;
}
}