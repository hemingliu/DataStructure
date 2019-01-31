package Queen;

import java.util.Scanner;

public class CR_Queen extends RL_Queen{
    public static void main(String[] args){
        RL_Queen st = new RL_Queen();

        DATA data = new DATA();

        Scanner input = new Scanner(System.in);
        SQType stack = st.SQInit();
        System.out.print("入队，请输入年龄，姓名：\n");
        do{
            DATA inputdata = new DATA();
            inputdata.age = input.nextInt();
            if(inputdata.age != 0){
                inputdata.name = input.next();
                st.InSQ(stack,inputdata);
            }else {
                break;
            }
        }while (true);

        System.out.print("点击任意非零键进行出队操作：\n");
        String temp = "";
        temp = input.next();
        while (!temp.equals("0")){
            if((data = st.OutSQ(stack)) != null)
            {
                System.out.printf("出队数据为：%s,%d",data.name,data.age);
                temp = input.next();
            }else {
                break;
            }
        }
        System.out.print("test finished");
        st.SQFree(stack);
    }
}
