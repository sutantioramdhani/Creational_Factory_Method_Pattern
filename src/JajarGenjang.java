public class JajarGenjang implements Bidang_Bangunan{
private String namaBangunan = JajarGenjang.class.getSimpleName();

@Override
public void titik() {
    System.out.println(namaBangunan+" : mempunyai 4 titik");
}          
}
