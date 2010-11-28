package eu.nets.intervju.file;

import java.io.File;

public class FileSlurper
{
    public static interface Callback
    {
        void handle(File file);
    }

    private final File dir;

    public FileSlurper(final File dir)
    {
        this.dir = dir;
    }

    /**
     * Processes {@code dir} for any {@code *.csv} files and passes each file as an argument to the
     * {@link Callback#handle(java.io.File)} method of {@code callback}.
     *
     * @param dir      the directory to scan for *.csv files.
     * @param callback the callback to call for each found file.
     */
    public void slurp(final File dir, final Callback callback)
    {
        throw new UnsupportedOperationException("Denne metoden må implementeres.");
    }

}
