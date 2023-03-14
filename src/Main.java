
public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        System.out.println("\n" + " Задача 1 ");
        int[] array = generateRandomArray();
        long summ = 0;
        for (int n : array) {
            summ += n;
        } // System.out.println(Arrays.toString(array)); Все элементы массива выведем.
        System.out.println("\n " + " Сумма всех травт за месяц " + summ + " Рублей ");
    }

    public static void task2() {
        System.out.println("\n" + " Задача 2 ");

        int[] array = generateRandomArray();
        int min = Integer.MAX_VALUE; // Любое значение меньше MAX, сразу будет присвоено МИНИМУМ
        int max = Integer.MIN_VALUE;// Любое Значение больше MIN, Будет присвоен МАКСИМУМ.
        for (int i = 0; i < array.length; i++){
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) { // нашли этим способом максимум, и написали условие для поика.
                //Это же касаеться минимума.
                max = array[i];
            }
        }
        System.out.println("\n " + min);
        System.out.println("\n " + max);
    }

    public static void task3() {
        System.out.println("\n" + " Задача 3 ");
        int[] array = generateRandomArray();
        long summ = 0;
        for (int n : array) {
            summ += n;
            summ = summ / 30; // Считаем среднюю сумму трат за месяц. / на колличесвто дней в месяце.
        } // System.out.println(Arrays.toString(array)); Все элементы массива выведем.
        System.out.println("\n " + " Средняя сумма трат за месяц, составляет  " + summ + " Рублей");
    }

    public static void task4() {
        System.out.println("\n" + " Задача 4 ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) { // печатал цикл for с конца массива
            // далее,печатал текущий элемент и уменьшал индекс на 1 на каждой итерации.
            System.out.println("\n" + reverseFullName[i]);
        }
    }
}



