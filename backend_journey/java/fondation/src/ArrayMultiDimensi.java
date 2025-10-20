public class ArrayMultiDimensi {
    public static void main(String[] args) {
        // array multi 2 multi dimensi
        System.out.println("======================================");
        System.out.println("contoh array 2 dimensi");

        // bentuk 1
        int[][] nilai = {
            {100, 90, 80, 60},
            {10, 20, 30, 40}
        };

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println(); // pindah baris
            }

        for (int[] baris : nilai) {
            for (int kolom : baris) {
                System.out.print(kolom + " ");
            }
            System.out.println();
        }

        System.out.println(nilai[1][2]);

        // bentuk 2
        String[][] nama;
        nama = new String[3][4];

        nama[0][0] = "nama";
        nama[0][1] = "asal";
        nama[0][2] = "alamat";
        nama[0][3] = "job";

        nama[1][0] = "masrul";
        nama[1][1] = "aceh";
        nama[1][2] = "batoh";
        nama[1][3] = "asn";

        nama[2][0] = "ghaitsa";
        nama[2][1] = "medan";
        nama[2][2] = "johor";
        nama[2][3] = "pns";

        for (String[] nama1 : nama) {
            for (String nama2 : nama1) {
                System.out.print(nama2 + "\t|");
            }
            System.out.println();
        }
        System.out.println("======================================");

        // jagged array
        int[][] segitiga = new int[5][];
        segitiga[0] = new int[1];
        segitiga[1] = new int[2];
        segitiga[2] = new int[3];
        segitiga[3] = new int[4];
        segitiga[4] = new int[5];

        for (int i = 0; i < segitiga.length; i++) {
            for (int j = 0; j < segitiga[i].length; j++) {
                System.out.print(segitiga[i][j] + " ");
            }
            System.out.println();
        }
    }
}