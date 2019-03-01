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

package io.hops.metadata.s3.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.List;

public interface S3PathMetaDataAccess<T> extends EntityDataAccess {
    public T getPath(String parent, String child, String bucket) throws StorageException;
    public void putPath(T path) throws StorageException;
    public void deletePath(String parent, String child, String bucket) throws StorageException;

    public void putPaths(List<T> paths) throws StorageException;
    public void deletePaths(List<T> paths) throws StorageException;

    public boolean isDirEmpty(String parent, String child, String bucket) throws StorageException;
    public void deleteBucket(String bucketName) throws StorageException ;

    public List<T> getExpiredFiles(long modTime, String bucket) throws StorageException;
    public List<T> getPathChildren(String parent, String bucket) throws StorageException;
}
