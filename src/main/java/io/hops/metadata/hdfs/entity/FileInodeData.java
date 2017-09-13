package io.hops.metadata.hdfs.entity;

/**
 * Created by salman on 3/10/16.
 */
public class FileInodeData {
    public enum Type{
        OnDiskFile,
        InmemoryFile
    }

    private final int inodeId;
    private final byte[] inodeData;
    private final Type type;
    private final int  size;

    public FileInodeData(int inodeId, byte[] inodeData, int size, Type type ) {
        this.inodeId = inodeId;
        this.inodeData = inodeData;
        this.type = type;
        this.size = size;
    }

    public Type getDBFileStorageType(){
        return type;
    }

    public int getInodeId() {
        return inodeId;
    }

    public byte[] getInodeData() {
        return inodeData;
    }

    public int getSize(){
        return size;
    }
}
