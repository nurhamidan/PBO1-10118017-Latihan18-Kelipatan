package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menampilkan bilangan kelipatan 3,5 dimulai dari 3,5 sampai 35.
 * 
 */
public class Main {
    //Konstanta
    public static final String FOOTER = "\n(Developed by : Agung Nurhamidan)";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Menampilkan nilai kelipatan
        for (double i = 3.5; i < 35; i = i + 3.5) {
            System.out.println(i);
        }
        
        System.out.println(FOOTER);
    }
    
}
