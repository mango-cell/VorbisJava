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
package org.gagravarr.ogg;

/**
 * A high level stream packet sat atop of an OggPacket.
 * Used for reading and writing new and existing OggPacket
 *  instances.
 */
public interface OggStreamPacket {
    public byte[] getData();
    public void setData(byte[] data);
    public int getOggOverheadSize();
    public OggPacket write();
}
