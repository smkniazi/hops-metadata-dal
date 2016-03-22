package io.hops.metadata.hdfs.entity;

/**
 * Created by salman on 3/10/16.
 */
public class FileInodeData {
    private int inodeId;
    private byte[] inodeData;

    public FileInodeData(int inodeId, byte[] inodeData) {
        this.inodeId = inodeId;
        this.inodeData = inodeData;
    }

    public int getInodeId() {
        return inodeId;
    }

    public byte[] getInodeData() {
        return inodeData;
    }
}
