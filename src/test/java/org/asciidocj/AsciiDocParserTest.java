package org.asciidocj;

import org.asciidocj.ast.DocumentNode;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AsciiDocParserTest {

    @Test
    public void loadAsciiDoc() throws IOException {
        String asciiDocAsString = Files.readString(Paths.get("src").resolve("test").resolve("resources").resolve("index.adoc"));
        AsciiDocProcessor processor = new AsciiDocProcessor();
        DocumentNode documentNode = processor.parseAsciidoc(asciiDocAsString);
        documentNode.getChildren();
    }
}
