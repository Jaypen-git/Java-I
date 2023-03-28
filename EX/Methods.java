public class Methods {
    public static void main (String[] args) {
        String[] names = {"Ceres Fauna", "Hakos Baelz", "Nanashi Mumei", "Ouro Kronii", "Tsukumo Sana"};
        System.out.println(searchArray("Shishiro Botan", names));
    }
    public static boolean searchArray(String target, String[] array) {
        boolean result = false;
        for (String item: array) {
            if (item == target) {
                result = true;
                break;
            }
        }
        return result;
    }
    public static boolean searchArray(int target, int[] array) {
        boolean result = false;
        for (int item: array) {
            if (item == target) {
                result = true;
                break;
            }
        }
        return result;
    }
}
