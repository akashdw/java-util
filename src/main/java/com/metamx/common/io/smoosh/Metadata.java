/*
 * Copyright 2011,2012 Metamarkets Group Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.metamx.common.io.smoosh;

/**
*/
class Metadata
{
  private final int fileNum;
  private final int startOffset;
  private final int endOffset;

  Metadata(
      int fileNum,
      int startOffset,
      int endOffset
  )
  {
    this.fileNum = fileNum;
    this.startOffset = startOffset;
    this.endOffset = endOffset;
  }

  public int getFileNum()
  {
    return fileNum;
  }

  public int getStartOffset()
  {
    return startOffset;
  }

  public int getEndOffset()
  {
    return endOffset;
  }
}