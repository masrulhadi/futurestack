public class StringsandMethods {
    public static void main(String[] args) {
        // string objek bukan primitif
        String nama = "Masrul Hadi";
        System.out.println(nama.length());

        // String immutability/ tidak bisa diubah
        String bahasa = "java";
        bahasa.concat("golang");
        System.out.println(bahasa);
        // cara mengubahnya
        bahasa = bahasa.concat(" golang");
        System.out.println(bahasa);

        System.out.println("======================================");

        // String pool
        String fakultas = "saintek";
        String faculty = "saintek";
        System.out.println(fakultas == faculty);

        System.out.println("======================================");
        
        // contoh new String dan equals
        String jabatan = new String("manager");
        String posisi = new String("manager");
        System.out.println(jabatan == posisi);
        System.out.println(jabatan.equals(posisi));

        // contoh kasus
        String a = "bank";
        String b = "bank";
        String c = new String("bank");
        String d = c.intern();

        System.out.println("a == b      : " + (a == b));
        System.out.println("a == c      : " + (a == c));
        System.out.println("a == d      : " + (a == d));
        System.out.println("a.equals(c) : " + a.equals(c));
    }
}