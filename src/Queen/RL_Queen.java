package Queen;

public class RL_Queen implements Queen_interface{
    @Override
    public SQType SQInit() {
        SQType q;
        if((q = new SQType()) != null){
            q.head = 0;
            q.tail = 0;
            return q;
        }else {
            System.out.print("内存不足，初始化失败！\n");
            return null;
        }
    }

    @Override
    public int SQIsFull(SQType q) {
        if(q.tail == QUEUELEN){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public int SQIsEmpty(SQType q) {
        if(q.head == q.tail){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public void SQClear(SQType q) {
        q.head = 0;
        q.tail = 0;
    }

    @Override
    public void SQFree(SQType q) {
        if(q != null){
            q = null;
        }
    }

    @Override
    public int InSQ(SQType q, DATA data) {
        if(q.tail == QUEUELEN){
            System.out.print("入队失败，队列已满！\n");
            return 0;
        }else{
            q.tail++;
            q.data[q.tail] = data;
            return 1;
        }
    }

    @Override
    public DATA OutSQ(SQType q) {
        if(q.head == q.tail){
            System.out.print("队列为空，出队失败！\n");
            return null;
        }else {
            q.head++;
            return q.data[q.head];
        }
    }

    @Override
    public DATA PeekSQ(SQType q) {
        if(SQIsEmpty(q) == 1){
            System.out.print("队列空!\n");
            System.exit(0);
        }else {
            return q.data[q.head];
        }
        return null;
    }

    @Override
    public int SQLen(SQType q) {
        return (q.tail - q.head);
    }
}
