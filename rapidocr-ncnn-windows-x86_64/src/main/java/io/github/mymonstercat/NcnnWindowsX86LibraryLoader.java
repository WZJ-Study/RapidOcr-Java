package io.github.mymonstercat;

import io.github.mymonstercat.loader.NcnnLibraryLoader;

import java.io.IOException;

/**
 * @author Monster
 */
public class NcnnWindowsX86LibraryLoader implements NcnnLibraryLoader {

    @Override
    public void loadLibrary() throws IOException {
        JarFileUtil.copyFileFromJar("lib/RapidOcr.dll", "/onnx", true, false);
    }

    @Override
    public boolean isSupportedPlatform(String osName, String osArch) {
        return osName.contains("win") && osArch.contains("amd64");
    }
}
