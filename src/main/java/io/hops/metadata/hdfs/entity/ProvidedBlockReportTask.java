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
package io.hops.metadata.hdfs.entity;

public class ProvidedBlockReportTask {

  private long id;
  private long startIndex;
  private long endIndex;

  public ProvidedBlockReportTask(long id, long startIndex, long endIndex) {
    this.id = id;
    this.startIndex = startIndex;
    this.endIndex = endIndex;
  }

  public ProvidedBlockReportTask(long startIndex, long endIndex, long pickupTime,
                                 long nnID) {
    this.startIndex = startIndex;
    this.endIndex = endIndex;
  }

  private ProvidedBlockReportTask() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(long startIndex) {
    this.startIndex = startIndex;
  }

  public long getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(long endIndex) {
    this.endIndex = endIndex;
  }

  @Override
  public String toString(){
    return "Start: "+startIndex+" End: "+endIndex;
  }
}
