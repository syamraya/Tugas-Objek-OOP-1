import java.util.Scanner;

public class Laptop {
    String[] laptops = {
        "1. Dell XPS 13",
        "2. MacBook Pro",
        "3. HP Spectre x360",
        "4. Lenovo ThinkPad X1 Carbon",
        "5. Asus ZenBook 13"
};
    
    String[] specs = {
        "Dell XPS 13: Laptop warna light blue, Intel Core i7, 16GB RAM, 512GB SSD",
        "MacBook Pro: Laptop Apple M1 Warna Dark space, 16GB RAM, 512GB SSD",
        "HP Spectre x360: Laptop warna black asteroid, Intel Core i7, 16GB RAM, 1TB SSD",
        "Lenovo ThinkPad X1 Carbon: Laptop warna black carbon, Intel Core i7, 16GB RAM, 1TB SSD",
        "Asus ZenBook 13: Laptop warna silver light, Intel Core i5, 8GB RAM, 256GB SSD"
};
    void tampilSpeklaptop(){
        System.out.println("Pilih nomor untuk menampilkan spek laptop yang dipilih:");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        switch ( choice) {
            case 1 :
            System.out.println("Spesifikasi: ");
            System.out.println(specs[choice - 1]);
            case 2 :
            System.out.println("Spesifikasi: ");
            System.out.println(specs[choice - 1]);
            case 3 :
            System.out.println("Spesifikasi: ");
            System.out.println(specs[choice - 1]);
            case 4 :
            System.out.println("Spesifikasi: ");
            System.out.println(specs[choice - 1]);
            case 5 :
            System.out.println("Spesifikasi: ");
            System.out.println(specs[choice - 1]);
                break;
            default:
            System.out.println("Pilihan tidak valid.");
        break;
        
     }
    scanner.close();
   }
}
