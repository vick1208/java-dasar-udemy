public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Eko";
        stringArray[1] = "Kurniawan";
        stringArray[2] = "Khannedy";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        stringArray[0] = "Vicky";
        System.out.println(stringArray[0]);
//      Alternatif membuat array
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Mercedes";
        System.out.println(stringArray2[0]);


        long[] arrayLong = {
                10L, 20L, 30L
        };
        arrayLong[0] = 0;

        System.out.println(arrayLong[0]);

        String[][] members = {
                {"Eko", "Kurniawan"},
                {"Budi", "Nugraha"},
                {"Joko", "Nugroho"},
                {"Richard", "Stefani"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }

}

