package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

/**
 * Created by salman on 3/10/16.
 */
public interface FileInodeDataDataAccess<T> extends EntityDataAccess {
    void add(T fileInodeData) throws StorageException;

    void delete(T fileInodeData) throws StorageException;
}

