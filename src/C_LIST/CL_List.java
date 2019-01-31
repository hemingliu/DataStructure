package C_LIST;

public interface CL_List {

    class DATA{
        String key;
        String name;
        int age;
    }

    class CLType{
        DATA nodeData = new DATA();
        CLType nextNode;
    }

    public CLType CLAddEnd(CLType head,DATA nodeData);

    public CLType CLAddFirst(CLType head,DATA nodeData);

    public CLType CLFindNode(CLType head,String key);

    public CLType CLInsertNode(CLType head,String findkey,DATA nodeData);

    public int CLDeleteNode(CLType head,String key);

    public int CLLength(CLType head);

    public void CLShowAll(CLType head);
}
