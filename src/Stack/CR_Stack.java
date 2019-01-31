package Stack;

import java.util.Scanner;

public class CR_Stack extends RL_Stack{

    public static void main(String[] args){

        RL_Stack st = new RL_Stack();
        DATA data = new DATA();

        StackType stack = st.STinit();
        Scanner input = new Scanner(System.in);

        System.out.print("入栈操作：\n");
        System.out.print("输入姓名，年龄，开始入栈。\n");
        do{
            DATA stackdata = new DATA();
            stackdata.name = input.next();
            if(stackdata.name.equals("0")){
                break;
            }else{
                stackdata.age = input.nextInt();
                st.PushST(stack,stackdata);
            }
        }while (true);

        System.out.print("按任意非零键进行出栈：\n");
        String temp = " ";
        temp = input.next();
        while (!temp.equals("0")){
            data = st.PopST(stack);
            System.out.printf("出栈数据是：（%s,%d)\n",data.name,data.age);
            temp = input.next();
        }
        System.out.print("finished");
        st.STFree(stack);
    }
}
