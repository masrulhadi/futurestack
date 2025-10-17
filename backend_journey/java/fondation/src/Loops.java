public class Loops {
    public static void main(String[] args) {
        
        // for = cek di awal, jumlah iterasi biasanya diketahui
        // while = melakukan pengecekan di awal dan akan looping sampai kondisi terpenuhi
        // do-while = jalankan dulu baru nanti di cek di akhir (minimal jalan sekali)

        // for loop
        System.out.println("berhitung hitung dimulai:");
        for (int i = 1; i <=100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // while loop
        int j = 1;
        while (j <=10) {
            System.out.println("getsa");
            j++;
        }

        // do-while loop
        int k = 10;
        do {
            System.out.println("okeee " + k);
            k++;
        } while (k <= 12);

        // enhance loop
        String[] nama = {"masrul", "hadi"};
        for (String name : nama) {
            System.out.println("members: " + name);
        }
    }
}
