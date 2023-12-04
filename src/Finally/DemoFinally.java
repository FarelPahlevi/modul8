package Finally;

public class DemoFinally {
    public static void main(String[] args) {
        int x = 3;
        int[] array = {10,11,12};
        try {
            System.out.println(array[x]);
            System.out.println("Tidak terjadi exeption");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi exception");
//            System.out.println(array[x-4]);
        }
        finally {
            System.out.println("Program selesai dijalankan");
        }
    }
}
