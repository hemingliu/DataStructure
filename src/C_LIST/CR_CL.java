package C_LIST;

import java.util.Scanner;

public class CR_CL extends RL_Cl {
    public static void main(String[] args){
        RL_Cl RL = new RL_Cl();
        CLType node , head = null;
        String key , findKey;
        Scanner input = new Scanner(System.in);

        System.out.print("链表测试。\n");
        do{
            System.out.println("先输入链表中的数据：关键字，姓名，年龄\n");
            DATA nodedata = new DATA();
            nodedata.key = input.next();
            if(nodedata.key.equals("0")){
                break;
            }else{
                nodedata.name = input.next();
                nodedata.age = input.nextInt();
                head = RL.CLAddEnd(head,nodedata);
            }
        }while(true);

        RL.CLShowAll(head);

        System.out.print("\n演示插入节点，输入插入节点的关键字：");
        findKey = input.next();
        System.out.print("输入插入节点的数据：关键字，姓名，年龄\n");
        DATA nodedata = new DATA();
        nodedata.key = input.next();
        nodedata.name = input.next();
        nodedata.age = input.nextInt();
        head = RL.CLInsertNode(head,findKey,nodedata);
        RL.CLShowAll(head);

        System.out.print("\n演示删除节点，输入要删除节点的关键字");
        key = input.next();
        RL.CLDeleteNode(head,key);
        RL.CLShowAll(head);

        System.out.print("\n演示查找节点，输入查找节点的关键字");
        key = input.next();
        node = RL.CLFindNode(head,key);
        if(node != null){
            nodedata = node.nodeData;
            System.out.printf("关键字%s对应的节点的为：%s,%s,%d\n",key,nodedata.key,nodedata.name,nodedata.age);
        }else {
            System.out.print("未找到节点！");
        }
    }
}
