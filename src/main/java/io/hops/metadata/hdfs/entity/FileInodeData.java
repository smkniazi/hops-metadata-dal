package io.hops.metadata.hdfs.entity;

/**
 * Created by salman on 3/10/16.
 */
public class FileInodeData {
    enum Type{
        DiskDataFile,
        InmemoryFile
    }

    private final int inodeId;
    private final byte[] inodeData;
    private final Type type;

    public FileInodeData(int inodeId, byte[] inodeData, Type type) {
        this.inodeId = inodeId;
        this.inodeData = inodeData;
        this.type = type;
    }

    public Type databaseFileType(){
        return type;
    }

    public int getInodeId() {
        return inodeId;
    }

    public byte[] getInodeData() {
        return inodeData;
    }
}
