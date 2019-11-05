package org.apache.mushroom;

import java.io.Closeable;
import java.io.IOException;

public interface IMemStore extends Closeable {
    void add(KeyValue keyValue) throws IOException;
}
