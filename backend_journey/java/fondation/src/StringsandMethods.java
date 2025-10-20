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

        // contoh implementasi lainnya
        String teks = "Java Developer";
        System.out.println(teks.toUpperCase());
        System.out.println(teks.substring(0, 4));
        System.out.println(teks.replace("Java", "Kotlin"));
        System.out.println(teks.contains("Dev"));
        System.out.println(teks.charAt(2));
    }
}