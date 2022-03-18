import java.io.File;

public class FileDownloader extends DefaultTask {

        @Input
        String sourceUrl

        @OutputFile
        File target

        @TaskAction
        void download() {
            try {
                ant.get(src: sourceUrl, dest: target)
            } catch (Exception a) {
                println a
            }
        }

    }
    task downloadFile (type: FileDownloader) {
        sourceUrl = 'http: '
        target = new File ('')
    }
}
