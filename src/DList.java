public class DList {

    protected DNode header;
    protected DNode trailler;

    protected long size;

    public DList() {
        header = new DNode("",null,null);
        trailler = new DNode("",null,null);
        size = 0;
    }

    public String toString() {
        String s;
        DNode p = header.next;

        s = "[";
        while (p != trailler && p != null) {
            s += p.getElement();
            s += ",";
            p = p.getNext();
        }
        if (s.length() > 1)
            s = s.substring(0, s.length() - 1);
        return s + "]";
    }

    public void addLast(DNode z) {
        if(header.next == null && trailler.prev == null){
            trailler.prev = z;
            header.next = z;
            z.next = trailler;
            z.prev = header;
        }
        else{
            trailler.prev.next = z;
            z.prev = trailler.getPrev();
            z.next = trailler;
            trailler.prev = z;
        }
        size +=1;
    }

    public void addFirst(DNode z) {
        if(header.next == null && trailler.prev == null){
            trailler.prev = z;
            header.next = z;
            z.next = trailler;
            z.prev = header;
        }
        else{
            z.next = header.getNext();
            z.prev = header;
            header.next = z;
        }
        size +=1;
    }

    public DNode getLast() {
        return trailler.getPrev();
    }

    public void addBefore(DNode v, DNode z) {
        v.prev.next = z;
        z.prev = v.getPrev();
        z.next = v;
        v.prev = z;

        size += 1;
    }
}
