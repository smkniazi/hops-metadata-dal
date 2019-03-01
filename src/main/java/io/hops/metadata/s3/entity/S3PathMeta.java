/*
 * Copyright (C) 2019 hops.io.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.hops.metadata.s3.entity;

// represents a row in NDB
public final class S3PathMeta {
    // required params
    public String bucket;
    public String parent;
    public String child;

    // optional params
    public boolean isDeleted;
    public boolean isDir = false;
    public long blockSize = 0;
    public long fileLength = 0;
    public long modTime = System.currentTimeMillis();

    // always null except 1 row named ../VERSION
    // Not used yet, since you can just delete the table and re-populate with bucket data easily.
    public long tableCreated;
    public long tableVersion;


    // used by PBHelper to retrieve data
    public S3PathMeta(String parent, String child, String bucket, boolean isDeleted, boolean isDir, long blockSize, long fileLength, long mod_time, long tableCreated, long tableVersion) {
        this.parent = parent;
        this.child = child;
        this.bucket = bucket;
        this.isDeleted = isDeleted;
        this.blockSize = blockSize;
        this.fileLength = fileLength;
        this.modTime = mod_time;
        this.isDir = isDir;
        this.tableCreated = tableCreated;
        this.tableVersion = tableVersion;
    }

    // used to create new objects
    public S3PathMeta(String parent, String child, String bucket, boolean isDeleted, boolean isDir, long blockSize, long fileLength, long mod_time) {
        this.parent = parent;
        this.child = child;
        this.bucket = bucket;
        this.isDeleted = isDeleted;
        this.blockSize = blockSize;
        this.fileLength = fileLength;
        this.modTime = mod_time;
        this.isDir = isDir;
    }

    public S3PathMeta(String parent, String child, String bucket, boolean isDeleted, boolean isDir, long blockSize, long fileLength ) {
        this.parent = parent;
        this.child = child;
        this.bucket = bucket;
        this.isDeleted = isDeleted;
        this.blockSize = blockSize;
        this.fileLength = fileLength;
        this.isDir = isDir;
    }

    public S3PathMeta(String parent, String child, String bucket, boolean isDeleted, boolean isDir) {
        this.parent = parent;
        this.child = child;
        this.bucket = bucket;
        this.isDeleted = isDeleted;
        this.isDir = isDir;
    }

    public S3PathMeta() {

    }

    @Override
    public String toString() {
        if (this.parent.endsWith("/")) {
            return this.bucket + ":" + this.parent + this.child;
        } else {
            return this.bucket + ":" + this.parent + "/" + this.child;
        }
    }


    public String getParent() {
        return parent;
    }

    public String getChild() {
        return child;
    }

    public String getBucket() {
        return bucket;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public long getBlockSize() {
        return blockSize;
    }

    public long getFileLength() {
        return fileLength;
    }

    public long getModTime() {
        return modTime;
    }

    public boolean isDir() {
        return isDir;
    }

    public long getTableCreated() {
        return tableCreated;
    }

    public long getTableVersion() {
        return tableVersion;
    }



}
