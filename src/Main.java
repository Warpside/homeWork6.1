import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        float sum = 0;
        for (int index : arr) {
            sum += index;
        }
        System.out.println(" Сумма трат за месяц составила " + sum + " рублей ");

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(" Минимальная сумма трат за день составила - " + arr[0] +  " рублей.Максимальная сумма трат за день - составила " + arr[29] + " рублей ");

        float middleSalary = sum / arr.length;
        System.out.println(" Средняя сумма трат за месяц составила " + middleSalary + " рублей ");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int z = reverseFullName.length -1; z > -1 ; z--) {
            System.out.print(reverseFullName[z]);
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
