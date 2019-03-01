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

package io.hops.metadata.s3;

public class TablesDef {
    public interface S3PathMetadataTableDef {
        String TABLE_NAME = "s3_metadata_store";

        String PARENT = "parent";
        String CHILD = "child";
        String BUCKET = "bucket";
        String IS_DELETED = "is_deleted";
        String BLOCK_SIZE = "block_size";
        String FILE_LENGTH = "file_length";
        String MOD_TIME = "mod_time";
        String IS_DIR = "is_dir";
        String TABLE_CREATED = "table_created";
        String TABLE_VERSION = "table_version";
    }
}
