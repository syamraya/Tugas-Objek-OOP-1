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
        for (String laptop : laptops) {
            System.out.println(laptop);
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
         if (choice > 0 && choice <= specs.length) {
            System.out.println("Spesifikasi: ");
            System.out.println(specs[choice - 1]);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        
        scanner.close();
    }
}
