import java.util.Arrays;

public class Task2 {

    // 1 программа увечиливает количество каждого символа в n раз
    public static String repeat(String word, int n){
        String newWord = " ";
        for (int i = 0; i< word.length() ; i++){
            for (int j = 0; j<n; j++){
                newWord+= word.charAt(i); // Метод charAt() – возвращает символ, расположенный по указанному индексу строки.
            }
        }
        return newWord;
    }




    // 2 находит разницу между минимум и максимумом массива
    // сортируем массив по возрастанию
    // беру последний и вычитаю первый элемент массива
    //  Arrays.sort(mass);
//        return mass[mass.length-1] - mass[0];
    public static int differenceMaxMin(int [] mass){
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return mass[mass.length-1] - mass[0];
    }



    // 3 проверяет, является ли среднее значение всех элементов целым числом
    // суммируем все элементы массива
    // считаем количество элементов массива и находим среднее значение
    public static boolean isAvgWhole(int mass[]){
        double sum = 0;

        for(int i = 0; i < mass.length; i++){
            sum += mass[i];

        }
        return sum % mass.length == 0;

    }




    // 4 возвращает массив
    // в котором каждое целое число - сумма самого себя
    // и всех предыдущих чисел

    public static int[] cumulativeSum( int [] mass){

        for (int i = 1; i < mass.length; i++){
            mass[i] = mass[i] + mass[i-1];
        }
        return mass;
    }




    //5 считает число десятичных знаков
    // если в числе есть точка
    // возвращаем длинну числа - порядковый номер точки - 1
    // если точки нет - возвращаем 0

    public static int getDecimalPlaces(String number){
        if (number.indexOf('.')>0){ // Метод indexOf() ищет в строке заданный символ или строку, и их возвращает индекс (т.е. порядковый номер).
            return number.length() - number.indexOf('.') - 1;
        }
        else
            return 0;
    }




    //6 возвращается n-ое число Фибоначчи
    //Присвоим переменным fib1 и fib2 значения двух первых элементов ряда
    //Поскольку значения первых двух элементов ряда Фибоначчи нам уже известны и вычисления начинаем с третьего, количество проходов по телу цикла должно быть на 2 меньше значения n
    public static int Fibonacci (int n){
        int fib1 = 0, fib2 = 1;
        int i = 0;
        while (i < n - 2){
            int fib_sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib_sum;
            i+=1;
        }
        return  fib2;
    }




    // 7 проверяет , првильно ли введен индекс
    // если в введенном индексе есть буквы, пробелы или не 5 символов
    // то счетчик принимает не нулевое значение
    // в противном случае выводится true

    public static boolean isValid(String index){
        boolean buf = false;
        for (int i = 0; i < index.length(); i++) {
            if (!Character.isDigit(index.charAt(i))) // Метод Character.isDigit() – определяет, является ли указанное значение типа char цифрой.
                return  buf;

            else if (index.length() != 5)
                return  buf;
        }
        return true;
    }




    //8 странная пара
    // если первый символ первого слова и последний второго совпадают
    // и первый элемент второго слова совпадает с последним элементом первого
    // то вернется true

    public static boolean isStrangePair (String word1, String word2){
        if (word1.length() == 0 && word2.length() == 0)
            return  false;
        else if (word1.length() == 0 || word2.length() == 0) {
            return true;
        }
        return word1.charAt(0) == word2.charAt(word2.length() - 1) && word2.charAt(0) == word2.charAt(word1.length() - 1);

    }



    //9 проверяем является ли данный суффикс или префикс частью введенного слова
    //убираем из префикса/суффикса -
    // проверяем начинается/заканчивается ли введенное слово на суффикс/префикс

    public static boolean isPrefix(String word, String pref){
        pref =  pref.substring(0,  pref.length()-1);

        return word.startsWith(pref);
    }
    public static boolean isSuffix(String word, String suf){
        suf = suf.substring(1);
        return word.endsWith(suf);
    }




    // 10 Создайте функцию, которая принимает число (шаг) в качестве аргумента
    // и возвращает количество полей на этом шаге последовательности.
    // если шаг = 0 , возвращаем 0
    // создаем цикл, "делающий" шаги
    // если шаг четный, то к счетчику прибавляем 3
    // если шаг не четный, то из счетчика вычитается 1

    public static int boxSeq(int shag){
        if (shag == 0) return 0;
        int count = 0;
        for (int i = 0; i < shag; i++) {
            if (i % 2 != 0) count--;
            else count += 3;
        }
        return count;
    }




    public static void main(String[] args) {
        System.out.println("1/10");
        // Тест 1 - вернет  mmmiiiccceee
        System.out.println(repeat("mice", 3));

        System.out.println("2/10");
        // Тест 2 - вернет 82
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));

        System.out.println("3/10");
        // Тест 3 - вернет false
        System.out.println(isAvgWhole(new int[]{1, 2 , 3 , 4}));

        System.out.println("4/10");
        // Тест 4 - вернет [3, 6, 4, 412, 415, 418]
        System.out.println(Arrays.toString(cumulativeSum(new int[]{3, 3, -2, 408, 3, 3})));

        System.out.println("5/10");
        // Тест 5 - вернет 2
        System.out.println(getDecimalPlaces("43.20"));

        System.out.println("6/10");
        // Тест 6 - вернет 21
        System.out.println(Fibonacci(7));

        System.out.println("7/10");
        // Тест 7 - вернет true
        System.out.println(isValid("15006"));

        System.out.println("8/10");
        // Тест 8 - вернет false
        System.out.println(isStrangePair("bush", "hubris") );

        System.out.println("9/10");
        // Тест 9 - вернет true и true
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));

        System.out.println("10/10");
        // Тест 10 - вернет 5
        System.out.println(boxSeq(3));

    }



}