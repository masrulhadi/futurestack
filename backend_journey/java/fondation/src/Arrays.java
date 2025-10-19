public class Arrays {
    public static void main(String[] args) {
        
        // contoh array deklarasi alokasi
        // deklarasi array dengan alokasi 5 elemen
        System.out.println("=================================================");
        System.out.println("contoh array deklarasi alokasi");
        int[] data = new int[5];

        System.out.println("Isinya Adalah: ");

        // looping untuk menampilkan isi array
        for (int i = 0; i < data.length; i++) {
            System.out.println("data[" + i + "] = " + data[i]);
        }
        
        // contoh penerapan sederhananya
        int[] nilai = new int[7];

        nilai[0] = 100;
        nilai[1] = 90;
        nilai[2] = 80;
        nilai[3] = 70;
        nilai[4] = 60;
        nilai[5] = 50;
        nilai[6] = 40;

        System.out.println("Nilai Andi Adalah: ");
        for (int j = 0; j < nilai.length; j++) {
            System.out.print(j + nilai[j] + ", ");
        }

        System.out.println();
        for (int j = 0; j < nilai.length; j++) {
            System.out.print(j + ":" + nilai[j] + ", ");
        }

        System.out.println();
        for (int j = 0; j < nilai.length; j++) {
        System.out.println("Index " + j + " = " + nilai[j]);
        }

        // contoh array inisiasi langsung
        System.out.println("=================================================");
        System.out.println("contoh array inisiasi langsung");

        String[] nama = {"masrul", "hadi"};
        for (int k = 0; k < nama.length; k++) {
            System.out.println("nama siswa: " + nama[k]);
        }

        // contoh array eksplisit
        System.out.println("=================================================");
        System.out.println("contoh array eksplisit");

        String[] hari = new String[] {"senin", "selasa", "rabu", "kamis", "jum'at", "sabtu", "minggu"};
        for (String days : hari) {
            System.out.println(days);
        }
    }
}