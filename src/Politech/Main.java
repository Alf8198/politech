package Politech;
//Напишите реализацию интерфейса:
//public interface Service
//{
//    int mcd(int x, int y);
//    int[] unigue (int[] array);
//    int days (int day, int month, int year);
//}
//    где методы должны решать следующие задачи:
//        a) метод mcd() должен возвращать наибольший общий делитель аргументов x и y;
//        b) метод unigue () из произвольного массива array, который он получает в качестве
//        аргумента, формирует и возвращает новый массив, в который включаются все элементы,
//        встречающиеся в исходном массиве array. При этом новый массив не должен содержать
//        повторяющихся значений.
//        Например, если исходный массив содержал значения {1, 1, 2, 3, 3, 5, 3, 4, 1}, то метод
//        должен возвратить массив, содержащий {1, 2, 3, 5, 4}
//        c) метод days() получает в качестве аргументов произвольную дату, заданную в виде
//        числа day, номера месяца month и года year. Метод должен вернуть число дней,
//        которые прошли с начала года до этой даты. Метод должен корректно учитывать
//        високосные года.
//        d) В реализацию интерфейса включите метод, демонстрирующий работу всех
//        вышеперечисленных методов

public class Main {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        Service taskA = new TaskA();
        taskA.num();
        Service taskb = new TaskB();
        taskb.list();
        Service taskC = new TaskC();
        taskC.uD();
        long after = System.currentTimeMillis();
        System.out.println(after - before);


    }

}


