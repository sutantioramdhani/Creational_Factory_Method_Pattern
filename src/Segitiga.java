public class Segitiga implements Bidang_Bangunan{
private String namaBangunan = Segitiga.class.getSimpleName();

@Override
public void titik() {
    System.out.println(namaBangunan+" : mempunyai 3 titik");
}      
}
