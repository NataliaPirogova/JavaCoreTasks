package Pirogova.Lesson4;

public class Task1 {
    public static void main(String[] args) {
        int d = 1; //количество дней
        int l = 10; //расстояние в первый день
        int s = 0; //суммарное расстояние
        do {
            s+=l;
            l*=1.1;
            d++;
        }while(d==7);
        System.out.println("За 7 дней спортсмен пробежал " + s + " километров");
    }
}
