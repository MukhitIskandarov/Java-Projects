/**
 * Created by Мухит on 19.10.2015.
 */

/**Класс реализует калькулятор.
 */
public class Calculator {
    /** Результат вычисления*/
    private int result = 0;

    /**Суммируем аргументы.
     */
    public void add(int first, int second){
        this.result = first + second;
    }


    /**Вычитаем аргументы.
     */
    public void sub(int first, int second){
        this.result = first - second;
    }


    /**Умножим аргументы.
     */
    public void mul(int first, int second){
        this.result = first * second;
    }

    /**Делим аргументы.
     */
    public void div(int first, int second){
        if (second != 0)
            this.result = first / second;
    }

    /**Получить результат.
     @return результат вычисления.
     */
    public int getResult(){
        return this.result;
    }

    /**Очистить результат вычисления.
     */
    public void cleanResult(){
        this.result = 0;
    }
}
