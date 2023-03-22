package HW_4;


public class Program {
 
    public static void main(String[] args) {
        // Работаем с цифрами
        DynamicArray<Integer> intList = new DynamicArray<>();
        intList.add(37); // добавление элемента
        intList.add(47);
        intList.add(27);
        intList.add(55);
        intList.add(87);
        intList.add(12);
        intList.add(51);
        intList.add(12);
        intList.add(12);
        intList.add(12);
        intList.add(88);
        intList.add(2);
        intList.printArray(); // печать масива
        intList.remove(5); // удаление элемента по индексу
        intList.remove(5);
        intList.printArray();
        intList.removeData(12); // удаление элемента по значению
        intList.removeData(88);
        intList.printArray();
        System.out.println(intList.minData()); // Поиск минимального значения
        System.out.println(intList.maxData()); // Поиск максимального значения
        System.out.println(intList.sumData()); // Сумма элементов массива
        System.out.println(intList.multData()); // Произведение элементов массива
        System.out.println(intList.findIndex(87)); // Поиск элемента по индексу (если его нет то возвращает -1)
        System.out.println(intList.findData(874)); // Проверка наличия элемента в массиве. Возвращает true, если элемент
                                                   // в массиве есть, false – нет.
        try {
            intList.BubbleSort();
            System.out.print("Результат:"); // Пузырьковая сортировка
            intList.printArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        DynamicArray<String> stringList = new DynamicArray<>();
        stringList.add("Компьютер"); // добавление элемента
        stringList.add("Монитор");
        stringList.add("Мышка");
        stringList.add("Клавиатура");
        stringList.add("Колонка");
        stringList.add("Провод");
        stringList.add("Коврик");
        stringList.add("Флешка");
        stringList.add("Пульт");
        stringList.add("Планшет");
        stringList.add("Телефон");
        stringList.add("Очки");
        stringList.printArray(); // печать
        stringList.remove(1);
        stringList.printArray();


    }
}
