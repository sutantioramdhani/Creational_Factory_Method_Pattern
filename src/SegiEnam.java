public class SegiEnam implements Bidang_Bangunan {
private String namaBangunan = SegiEnam.class.getSimpleName();

@Override
public void titik() {
    System.out.println(namaBangunan+" : mempunyai 6 titik");
}          
}
