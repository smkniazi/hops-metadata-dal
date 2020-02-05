/*
 * Copyright (C) 2020 hops.io.
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

package io.hops.metadata.hdfs.entity;

import java.util.Objects;

public class CloudBucket implements Comparable<CloudBucket> {

  public static final String NON_EXISTENT_BUCKET_NAME = "";
  public static final short NON_EXISTENT_BUCKET_ID = -1;

  private short ID;
  private String name;

  public CloudBucket(short ID, String name) {
    this.ID = ID;
    this.name = name;
  }

  public short getID() {
    return ID;
  }

  public void setID(short ID) {
    this.ID = ID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CloudBucket that = (CloudBucket) o;
    return ID == that.ID &&
            Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name);
  }

  @Override
  public int compareTo(CloudBucket o) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
