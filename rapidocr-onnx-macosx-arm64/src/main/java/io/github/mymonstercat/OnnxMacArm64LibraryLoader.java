package io.github.mymonstercat;

import io.github.mymonstercat.loader.OnnxLibraryLoader;

import java.io.IOException;

/**
 * @author Monster
 */
public class OnnxMacArm64LibraryLoader implements OnnxLibraryLoader {

    @Override
    public void loadLibrary() throws IOException {
        JarFileUtil.copyFileFromJar("lib/libRapidOcr.dylib", "/onnx", true, false);
    }

    @Override
    public boolean isSupportedPlatform(String osName, String osArch) {
        return osName.contains("mac") && osArch.contains("arch64");
    }
}
