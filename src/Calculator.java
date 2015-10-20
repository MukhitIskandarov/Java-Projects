/**
 * Created by ����� on 19.10.2015.
 */

/**����� ��������� �����������.
 */
public class Calculator {
    /** ��������� ����������*/
    private int result = 0;

    /**��������� ���������.
     *  @param params ��������� ������������.
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


    /**�������� ���������.
     @param params ��������� ������������.
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


    /**������� ���������.
     @param params ��������� ������������.
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

    /**����� ���������.
     @param params ��������� ������������.
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

    /**�������� ���������.
     @return ��������� ����������.
     */
    public int getResult(){
        return this.result;
    }

    /**�������� ��������� ����������.
     */
    public void cleanResult(){
        this.result = 0;
    }
}
