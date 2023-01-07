package laba6;
/* Напишите программу со статическим методом, аргументом которому передается
одномерный символьный массив. В результате вызова метода элементы массива попарно
меняются местами: первый — с последним, второй — с предпоследним и так далее*/

public class Example9 {
    public static void main(String[] args) {
        char[] charArray = {'а', 'б', 'в', 'г', 'д', 'е', 'ё',
                'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п',
                'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        Example_9.RCharArray(charArray);
        Example_9.viewReverseChArray();
    }
    private static class Example_9 {
        private static char[] reverseCharArray;

        private static char[] RCharArray(char ChArray[]){
            char changeChar;
            int l = ChArray.length-1;
            reverseCharArray = new char[ChArray.length];
            for (int i = 0; i<ChArray.length; i++){
            changeChar = ChArray[i];
            reverseCharArray[i] = ChArray[l-i];
            reverseCharArray[l-i] = changeChar;
        }
        return reverseCharArray;
    }
    private static void viewReverseChArray(){
            for (int i = 0; i < reverseCharArray.length; i++){
                System.out.println("reverseCharArray["+i+"]="+reverseCharArray[i]);
            }
        }
    }
}
