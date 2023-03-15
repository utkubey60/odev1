public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150};
        int max = numbers[0]; // ilk elemanı en büyük sayı olarak atıyoruz
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // eğer bir sonraki eleman mevcut maksimumdan büyükse, yeni maksimumu güncelliyoruz
            }
        }
        System.out.println("En büyük sayı: " + max);
        // Buradaki Big O değeri O(n) dir.
    }
}





