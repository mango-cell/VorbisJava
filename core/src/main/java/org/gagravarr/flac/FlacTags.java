/*
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
package org.gagravarr.flac;

import org.gagravarr.ogg.IOUtils;
import org.gagravarr.vorbis.VorbisComments;


/**
 * This is a {@link VorbisComments} with a Flac metadata
 *  block header, rather than the usual vorbis one.
 */
public class FlacTags extends VorbisComments {
   /**
    * Type plus three byte length
    */
   @Override
   protected int getHeaderSize() {
      return 4;
   }

   /**
    * Type plus three byte length
    */
   @Override
   protected void populateMetadataHeader(byte[] b, int type, int dataLength) {
      b[0] = FlacMetadataBlock.VORBIS_COMMENT;
      IOUtils.putInt3(b, 1, dataLength);
   }
}
