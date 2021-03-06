/*
The contents of this file are subject to the Mozilla Public License
Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at
http://www.mozilla.org/MPL/

Software distributed under the License is distributed on an "AS IS"
basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations
under the License.

The Original Code is collection of files collectively known as Open Camera.

The Initial Developer of the Original Code is Almalence Inc.
Portions created by Initial Developer are Copyright (C) 2013 
by Almalence Inc. All Rights Reserved.
*/

package com.almalence.plugins.processing.simple;

public final class AlmaShotDRO
{
	public static synchronized native String Initialize();
    public static synchronized native int Release();
    
    public static synchronized native String ConvertFromJpeg(
    		int frame[], int frame_len[], int nFrames, int sx, int sy);
    public static synchronized native int GetInputFrameNV21(int index, int sx, int sy);
    public static synchronized native int RotateResult(int result_yuv, int sx, int sy);

    public static synchronized native int DroProcess(int sx, int sy, float max_amplify,
    		boolean local_mapping, int filterStrength, int strongFilter, int pullUV);
    
    static 
    {
		System.loadLibrary("almalib");
        System.loadLibrary("almashot-dro");
    }
}
