package org.apache.mushroom;

public class KeyValue implements Comparable<KeyValue> {
    private byte[] key;
    private byte[] value;
    private Op op;

    // 在类中定义枚举类型
    public enum Op {

    }

    private long sequenceId;



    @Override
    public int compareTo(KeyValue o) {
        return 0;
    }

}
