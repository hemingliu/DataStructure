package C_LIST;

public class RL_Cl implements CL_List {
    @Override
    public CLType CLAddEnd(CLType head, DATA nodeData) {
        CLType node,htmep;
        if((node = new CLType()) == null){
            System.out.print("申请内存失败！\n");
            return null;
        }else{
            node.nodeData = nodeData;
            node.nextNode = null;
            if(head == null){
                head = node;
                return head;
            }
            htmep = head;
            while (htmep.nextNode != null){
                htmep = htmep.nextNode;
            }
            htmep.nextNode = node;
            return head;
        }
    }

    @Override
    public CLType CLAddFirst(CLType head, DATA nodeData) {
        CLType node;
        if((node = new CLType()) == null){
            System.out.print("申请内存失败!\n");
            return null;
        }else{
            node.nodeData = nodeData;
            node.nextNode = head;
            head = node;
            return head;
        }
    }

    @Override
    public CLType CLFindNode(CLType head, String key) {
        CLType htemp;
        htemp = head;
        while (htemp != null){
            //compareTo如果指定的数与参数相等返回0。
            //如果指定的数小于参数返回 -1。
            //如果指定的数大于参数返回 1
            if(htemp.nodeData.key.compareTo(key) == 0){
                return htemp;
            }
            htemp = htemp.nextNode;
        }
        return null;
    }

    @Override
    public CLType CLInsertNode(CLType head, String findkey, DATA nodeData) {
        CLType node,nodetemp;
        if((node = new CLType()) == null){
            System.out.print("申请内存失败!\n");
            return null;
        }
        node.nodeData = nodeData;
        nodetemp = CLFindNode(head,findkey);
        if(nodetemp != null){
            node.nextNode = nodetemp.nextNode;
            nodetemp.nextNode = node;
        }else{
            System.out.print("未找到插入位置！\n");
        }
        return head;
    }

    @Override
    public int CLDeleteNode(CLType head, String key) {
        CLType node,htemp;
        htemp =head;
        node= head;
        while (htemp != null){
            if(htemp.nodeData.key.compareTo(key) == 0){
                node.nextNode = htemp.nextNode;
                htemp = null;
                return 1;
            }else {
                node = htemp;
                htemp = htemp.nextNode;
            }
        }
        return 0;
    }

    @Override
    public int CLLength(CLType head) {
        int Lenth = 0;
        CLType htemp;
        htemp = head;
        while (htemp != null){
            Lenth++;
            htemp = htemp.nextNode;
        }
        return Lenth;
    }

    @Override
    public void CLShowAll(CLType head) {
        CLType htemp;
        DATA nodedata;
        htemp = head;
        System.out.printf("当前链表共有%d个节点。所有数据如下：\n",CLLength(head));
        while (htemp != null){
            nodedata = htemp.nodeData;
            System.out.printf("节点数据为：%s,%s,%d\n",nodedata.key,nodedata.name,nodedata.age);
            htemp = htemp.nextNode;
        }
    }
}
