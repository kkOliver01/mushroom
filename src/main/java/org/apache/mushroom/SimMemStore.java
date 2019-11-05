package org.apache.mushroom;

import java.io.IOException;
import java.util.concurrent.ConcurrentSkipListMap;

public class SimMemStore implements IMemStore {
    private ConcurrentSkipListMap<KeyValue,KeyValue> kvMap;
    public SimMemStore(){
        this.kvMap = new ConcurrentSkipListMap<>();
    }
    @Override
    public void add(KeyValue kv) throws IOException {
        this.kvMap.put(kv, kv);
    }

    @Override
    public void close() throws IOException {

    }
}
