/**
 * Created by Мухит on 19.10.2015.
 */

/**Класс реализует калькулятор.
 */
public class Calculator {
    /** Результат вычисления*/
    private int result = 0;

    /**Суммируем аргументы.
     *  @param params Аргументы суммирования.
     */
    public void add(int ... params){
        if (params.length > 0){
            this.result = params[0];
            for (int i = 1; i != params.length; ++i)
                this.result += params[i];
        }
        else {
            System.out.println("Error. You should enter minimum two params!");
        }
    }


    /**Вычитаем аргументы.
     @param params Аргументы суммирования.
     */
    public void sub(int ... params){
        if (params.length > 0){
            this.result = params[0];
            for (int i = 1; i != params.length; ++i)
                this.result -= params[i];
        }
        else {
            System.out.println("Error. You should enter minimum two params!");
        }
    }


    /**Умножим аргументы.
     @param params Аргументы суммирования.
     */
    public void mul(int ... params){
        if (params.length > 0){
            this.result = params[0];
            for (int i = 1; i != params.length; ++i)
                this.result *= params[i];
        }
        else {
            System.out.println("Error. You should enter minimum two params!");
        }
    }

    /**Делим аргументы.
     @param params Аргументы суммирования.
     */
    public void div(int ... params){
        if (params.length > 0){
            this.result = params[0];
            for (int i = 1; i != params.length; ++i){
                if (params[i] != 0){
                    this.result /= params[i];
                }
                else {
                    System.out.println("Error, You try to div on 0");
                }
            }
        }
        else {
            System.out.println("Error. You should enter minimum two params!");
        }
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
