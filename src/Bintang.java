public class Bintang implements Bidang_Bangunan {
private String namaBangunan = Bintang.class.getSimpleName();

@Override
public void titik() {
    System.out.println(namaBangunan+" : mempunyai 5 titik");
}          
}
