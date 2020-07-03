import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.System.out;

public class mergeArrays {
    private static int i;
    private static int j;
    private static int k;
    private static int LEN_a1;
    private static int LEN_a2;
    private static int LEN_REZ;

    public static int[] mergeArrays(int[] a1, int[] a2) {
        LEN_a1 = Array.getLength(a1);
        LEN_a2 = Array.getLength(a2);
        int[] rez = new int[LEN_a1 + LEN_a2];
        LEN_REZ = Array.getLength(rez);
        for (i = 0; i < LEN_REZ; i++) {

            if ((j < LEN_a1) && (k < LEN_a2)) { //если не конец обоих массивов
                if (a1[j] <= a2[k]) {
                    rez[i] = a1[j];
                    if (j<=(LEN_a1-1)){
                        j++;
                    }
                } else {
                    rez[i] = a2[k];
                    if (k<=(LEN_a2-1)){
                        k++;
                    }
                }
                continue;
            }

            if ((j < LEN_a1) && (k >= LEN_a2)) { //если конец массива k
                rez[i] = a1[j];
                if (j<(LEN_a1-1)){
                    j++;
                }
                continue;
            }

            if ((k < LEN_a1) && (j >= LEN_a2)) { //если конец массива j
                rez[i] = a2[k];
                if (k<(LEN_a2-1)){
                    k++;
                }
                continue;
            }

            if ((j > LEN_a1) && (k > LEN_a2)){ // если конец всего
                continue;
            }
        }
        out.println(Arrays.toString(rez));
        return rez;
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{1, 3};
        int[] a2 = new int[]{2, 4, 6};
        mergeArrays(a1, a2);
    }
}

    /*Создайте новый массив длиной как два других. Далее создайте цикл длиной нового массива.
        Проще всего добавлять по одному значению за итерацию в новый массив, брать которое мы
        будем при сравнении массивов. Взяли значение, засунули в новый массив и сразу вызвали инкремент.
        При этом важно в начале проверить ну закончился ли у нас уже один из двух массивов.*/