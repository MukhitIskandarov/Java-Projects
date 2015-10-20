/**
 * Created by ����� on 19.10.2015.
 */

/**����� ��������� �����������.
 */
public class Calculator {
    /** ��������� ����������*/
    private int result = 0;

    /**��������� ���������.
     */
    public void add(int first, int second){
        this.result = first + second;
    }


    /**�������� ���������.
     */
    public void sub(int first, int second){
        this.result = first - second;
    }


    /**������� ���������.
     */
    public void mul(int first, int second){
        this.result = first * second;
    }

    /**����� ���������.
     */
    public void div(int first, int second){
        if (second != 0)
            this.result = first / second;
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
