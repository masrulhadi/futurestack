public class Conditionals {
    public static void main(String[] args) {
        
        // penggunaan if else cocok untuk kondisi yang memiliki dua kemungkinan
        // switch case lebih cocok untuk kondisi dengan banyak cabang

        // simple if else
        boolean data = true;
        if (data) {
            System.out.println("validasi berhasil");
        } else {
            System.out.println("validasi gagal");
        }

        // if else if
        int nilai = 5;
        if (nilai >= 90) {
            System.out.println("anda lulus dengan  predikat A");
        } else if (nilai >= 80) {
            System.out.println("anda lulus dengan predikat B");
        } else {
            System.out.println("belajar lagi yaaa!");
        }

        // ternary operator
        String keterangan = (nilai < 80) ? "maaf!" : "selamat";
        System.out.println(keterangan);

        // logical conditions
        if (nilai >= 80 && data == true) {
            System.out.println("lulus dong, selamat yaaa!");
        } else {
            System.out.println("hahaha!");
        }

        // nested if
        double tinggi = 174.5;
        int umur = 20;
        if (tinggi >= 175.0) {
            if (umur >= 18) {
                System.out.println("anda memenuhi syarat pendaftaran");
            }
        } else {
            System.out.println("silahkan coba tahun depan");
        }

        // classic switch case
        String hari = "rabu";
        switch (hari) {
            case "senin": System.out.println("oke hari senin yaaa!");
                break;
            case "selasa": System.out.println("oke hari selasa yaaa!");
                break;
            case "rabu": System.out.println("oke hari rabu yaaa!");
                break;
            case "kamis": System.out.println("oke hari kamis yaaa!");
                break;
            case "juma'at": System.out.println("oke hari jum'at yaaa!");
                break;
            case "sabtu": System.out.println("oke hari sabtu yaaa!");
                break;
            default: System.out.println("ahh males aah, pergi sendiri ajaa!");
                break;
        }

        // enhanced switch
        switch (hari) {
            case "senin" -> System.out.println("okeee aman tuuu!");
            case "selasa" -> System.out.println("okeee aman tuuu!");
            case "rabu" -> System.out.println("okeee aman tuuu!");
            case "kamis" -> System.out.println("okeee aman tuuu!");
            case "jum'at" -> System.out.println("okeee aman tuuu!");
            case "sabtu" -> System.out.println("okeee aman tuuu!");
            case "minggu" -> System.out.println("males ahh, lain kali aja!");
        }
    }
}
