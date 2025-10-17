import java.io.File;
import java.lang.classfile.ClassFile.Option;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Path;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.Scanner;
import java.util.UUID;

@SuppressWarnings("unused") // Menghindari peringatan untuk import yang tidak digunakan

public class DataTypes {
    
    @SuppressWarnings("resource") // Menghindari peringatan untuk Scanner yang tidak ditutup
    
    public static void main(String[] args) {
        
        // Tipe Data Primitif
        byte a = 100; // ukuran 8 bit/1 byte (-128 to 127)
        short b = 1000; // ukuran 16 bit/2 byte (-32,768 to 32,767)
        int c = 5; // ukuran 32 bit/4 byte (-2,147,483,648 to 2,147,483,647)
        long d = 100000L; // ukuran 64 bit/8 byte (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        float e = 3.14f; // ukuran 32 bit/4 byte
        double f = 10.5; // ukuran 64 bit/8 byte
        char g = 'A'; // ukuran 16 bit/2 byte
        boolean h = true; // ukuran 1 bit (true or false)

        // Tipe Data Non-Primitif
        String str = "This is a non-primitive data type"; // ukuran tidak terbatas
        String kota = new String("Jakarta"); // contoh pembuatan objek String menggunakan keyword new
        String[] cities = {"Jakarta", "Bandung", "Surabaya"}; // array of Strings
        enum Days { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY } // enum example
        Integer intObj = Integer.valueOf(a); // Wrapper class for int
        BigDecimal bigDecimal = new BigDecimal("12345.6789"); // arbitrary-precision decimal number
        Date sqlDate = Date.valueOf("2023-01-01"); // SQL Date
        LocalDate localDate = LocalDate.now(); // current date
        LocalDateTime localDateTime = LocalDateTime.now(); // current date and time
        LocalTime localTime = LocalTime.now(); // current time
        ZonedDateTime zonedDateTime = ZonedDateTime.now(); // date and time with timezone
        BigInteger bigInteger = new BigInteger("12345678901234567890"); // arbitrary-precision integer
        Optional<String> optionalStr = Optional.of("Optional String"); // Optional example
        UUID uuid = UUID.randomUUID(); // Universally Unique Identifier
        File file = new File("path/to/file.txt"); // File object
        Path path = Path.of("path/to/directory"); // Path object
        Scanner scanner = new Scanner(System.in); // Scanner for input

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}