package org.apache.mushroom;

import java.io.IOException;
import java.util.concurrent.ConcurrentSkipListMap;

public class MushRoomBase implements MiniBase {
    private IMemStore memStore;

    public MiniBase open(){
        this.memStore = new SimMemStore();
        return this;
    }

    @Override
    public void put(byte[] key, byte[] value) throws IOException {
        this.memStore.add(KeyValue);
    }

    @Override
    public KeyValue get(byte[] key) throws IOException {
        return null;
    }

    @Override
    public void delete(byte[] key) throws IOException {

    }

    @Override
    public Iter<KeyValue> scan(byte[] startKey, byte[] stopKey) throws IOException {
        return null;
    }

    @Override
    public void close() throws IOException {

    }
}
