//Nama		: Raden Rico Dwianda
//NIM		: 24060122140184
//Tanggal	: 6 Maret 2024
//Deskripsi	: Class yang berisi program utama untuk class ExceptionOnArray

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[4] = 21;
            arrayInteger[5] = 20;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Clean up code...");
        }
    }
}
