package S_LIST;

import java.util.Scanner;

public class CR_SL extends RL_Sequential {

    public static void main(String[] args){

        SLTYPE SL = new SLTYPE();

        RL_Sequential RL = new RL_Sequential();

        System.out.print("顺序表操作示范\n");

        RL.SLinit(SL);
        System.out.print("初始化完成\n");

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("按顺序输入学号，姓名，年龄\n");
            DATA data = new DATA();
            data.key = input.next();
            data.name =input.next();
            data.age =input.nextInt();

            if(data.age != 0){
                if(RL.SLAdd(SL,data) == 0){
                    break;
                }
            }else {
                break;
            }
        }while (true);

        System.out.print("表中节点：\n");
        RL.SLShowAll(SL);
    }
}
