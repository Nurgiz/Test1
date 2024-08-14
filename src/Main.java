//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         test1 t = new test1();// создаём бъект класса Test1

        System.out.println(t.sum(32,12,44));
        System.out.println(t.sredee(20,30,40));
    }
}

class test1 {// объявление класса должно быть с большой буквы
    int sum(int a, int b, int c){
        int result = a + b + c;
        return result;
    }

    int sredee(int a, int b, int c){
        int result = sum(a,b,c) / 3;//метод может вызвать вышеописанный метод - стек
        return result;
    }
}