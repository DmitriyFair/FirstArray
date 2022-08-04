public class Main {
    /*  Создать первый массив от 100 до 1000
        Второй массив в обратном порядке
        Вывести второй через for each
    */
    public static void main(String[] args) {
        int [] array = new int[900];
        for (int i = 0; i< array.length; i++){
            array[i] = i + 100;
           // System.out.println(array[i]);
        }
        int [] secondArray = new int[array.length];
        for (int i = 0, j = array.length-1; i < array.length; i++, j--){
            secondArray[j] = array[i];
        }
        for (int i : secondArray) {
            System.out.println(i);
        }
    }
}
