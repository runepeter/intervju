package eu.nets.intervju;

import eu.nets.intervju.file.FileSlurper;

import java.io.File;

/**
 * A service that is responsible for moving number files (CSV) from one directory to another. All files will be validated, and
 * only validated files will be moved. Invalid file will be put in a separate error directory.
 */
public class NumberService
{
    private final FileSlurper slurper;

    public NumberService(final FileSlurper slurper, final File outputDir, final File errorDir)
    {
        this.slurper = slurper;
    }

    public void start() {
        throw new UnsupportedOperationException("Må implementeres.");
    }

    public void stop() {
        throw new UnsupportedOperationException("Må implementeres.");
    }

}
