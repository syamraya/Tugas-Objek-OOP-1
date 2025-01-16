public class ObjekLaptop {

    public static void main(String[] args) {

        System.out.println("Pilih nomor untuk menampilkan spek laptop yang dipilih:");
        Laptop obj = new Laptop();
        for (String laptop : obj.laptops) {
            System.out.println(laptop);
        }
            obj.tampilSpeklaptop();
        
    }
}