import java.lang.*;
public class Main {
public static void main(String[] args){
        Bidang_Bangunan order = BidangFactory.getBidang(Jenis_bangunan.JAJARGENJANG);
        order.titik();
        order = BidangFactory.getBidang(Jenis_bangunan.SEGITIGA);
        order.titik();    
        order = BidangFactory.getBidang(Jenis_bangunan.SEGIENAM);
        order.titik();
        order = BidangFactory.getBidang(Jenis_bangunan.BINTANG);
        order.titik();
}
}
