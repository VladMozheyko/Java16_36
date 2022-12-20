import java.util.Scanner;

public class Main {

    /*
    План занятия
    1) Исключения
     */

    /*
    Исключения - ситуации, которые возникают непреднамеренно, в случае каких-либо непредвиденных действий.
    Исключения бывают двух типов: при компиляции и при исполнении.

    Чтобы обработать исключение есть два способа:
   1) try{
    код, которые генерирует исключение
    }
    catch(Тип исключения){
    Действия в случае возникновения исключения
    }
    finally{
    То что будет выполненно в любом случае
    }

   2) добавить throws в сигнатуру метода и передать обработку тому, кто его вызовет

   Можно сделать свое исключение. Для этого нужно создать класс исключения и унаследоваться от класса Exception.
   Чтобы отреагировать на какую-то логически неправильную ситуацию, можно сгенерировать исключение, для этого используется
   оператор throw

     */

    /*
    Заметки
    Использование throws считается хорошим тоном(Кей Хорстман)
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {

//        try {
//            int a = scanner.nextInt();
//        }
//        catch (Exception ex){
//            System.out.println("Произошла ошибка");
//        }
//
//        System.out.println("Hello");
//
//       // System.out.println(div(12, 0));  Вызывает ошибку
//        try {
//            double res = div(12, 0);
//        }
//        catch (ArithmeticException ex){
//            System.out.println("Неправильное деление");
//        }
//        finally {
//            System.out.println("Расчеты закончены");
//        }
//
//        try {
//            print(1);
//        } catch (MyException e) {
//            e.printStackTrace();
//        }

//        Dog dog = new Dog("Жуля");
//        dog.putCollar();
//        dog.putMuzzle();
//        dog.putLeash();
//
//        try {
//            dog.walk();
//        } catch (DogIsNotReadyException e) {
//            e.printStackTrace();
//        }
//
//        Dog dog1 = new Dog("Рик");
//
//        dog1.putLeash();
//
//        try {
//            dog1.walk();
//        } catch (DogIsNotReadyException e) {
//            e.printStackTrace();
//        }

        Plane plane = new Plane();

        plane.checkChassis();
        plane.fillOil();
        plane.noFrost();
        try {
            plane.fly();
        } catch (PlaneException e) {
            e.printStackTrace();
        }

    }

    private static double div (int i, int i1) throws ArithmeticException {
        return i/i1;
    }

    public static void print(int i) throws MyException{
        if(i == 1){
            throw new MyException("Неправильный ввод");
        }
    }

    /*
    ДЗ
    1) Создать класс
    2) Создать свое исключение.
    3) Сгенерировать исключение и обработать его
    4) Перехватить системное исключение
     */


}
