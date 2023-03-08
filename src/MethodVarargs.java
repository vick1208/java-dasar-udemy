public class MethodVarargs {
    public static void main(String[] args) {
        int[] values = {80, 90,80,20,90,90};
        sayCong("Eko", values);

        sayCong("Budi", 80, 90, 76, 80);

    }

    static void sayCong(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
