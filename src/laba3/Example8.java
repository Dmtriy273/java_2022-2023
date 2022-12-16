package laba3;

public class Example8 {
    //Напишите программу, в которой создается символьный массив из
    //10 элементов. Массив заполнить большими (прописными) буквами
    //английского алфавита. Буквы берутся подряд, но только согласные (то есть
    //гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
    //нужно пропустить). Отобразите содержимое созданного массива в консольном
    //окне.
    public static void main(String[] args) {
        int n = 10;
        char[] chars = new char[n];
        char[] onlyChars = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'};
        char b = 'A';
        int i;
        int j;


        for(i = 0; i < n; i++) {
            int q = 1;
            for(j = 0; j < onlyChars.length; j++) {
                if(b == onlyChars[j]) {
                    i--;
                    q = 0;
                }
            }
            if(q == 1) {
                chars[i] = b;
            }
            b++;
        }
        for(int k = 0; k < n; k++){
            System.out.print(chars[k] + ", ");
        }
    }
}
