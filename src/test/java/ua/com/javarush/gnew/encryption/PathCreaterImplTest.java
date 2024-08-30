package ua.com.javarush.gnew.encryption;

import org.junit.jupiter.api.Test;
import ua.com.javarush.gnew.domain.Command;
import ua.com.javarush.gnew.domain.EncryptingData;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathCreaterImplTest {

    PathCreater pathCreater = new PathCreaterImpl();

    @Test
    void createPath_shouldReturnCorrectPathWithEncrypted_whenCommandIsEncryptAndSourceFilePathContainsDecryptedOrBruteForced() {
        String sourcePath = "src\\main\\resources\\SourceTextEN[BRUTE_FORCED].txt";
        String command = Command.e.toString();
        EncryptingData encryptingData = EncryptingData.builder()
            .withSourceTextPath(sourcePath)
            .withCommand(command).build();

        assertEquals("src\\main\\resources\\SourceTextEN[ENCRYPTED].txt", pathCreater.createPath(encryptingData));
    }

    @Test
    void createPath_shouldReturnCorrectPathWithDecrypted_whenCommandIsDecryptAndSourceFilePathContainsEncrypted() {
        String sourcePath = "src\\main\\resources\\SourceTextEN[ENCRYPTED].txt";
        String command = Command.d.toString();
        EncryptingData encryptingData = EncryptingData.builder()
            .withSourceTextPath(sourcePath)
            .withCommand(command).build();

        assertEquals("src\\main\\resources\\SourceTextEN[DECRYPTED].txt", pathCreater.createPath(encryptingData));
    }

    @Test
    void createPath_shouldReturnCorrectPathWithBruteForced_whenCommandIsBruteForceAndSourceFilePathContainsDecryptedOrEncrypted() {
        String sourcePath = "src\\main\\resources\\SourceTextEN[ENCRYPTED].txt";
        String command = Command.bf.toString();
        EncryptingData encryptingData = EncryptingData.builder()
            .withSourceTextPath(sourcePath)
            .withCommand(command).build();

        assertEquals("src\\main\\resources\\SourceTextEN[BRUTE_FORCED].txt", pathCreater.createPath(encryptingData));
    }

    @Test
    void createPath_shouldReturnCorrectPathWithEncrypted_whenCommandIsEncryptAndSourceFilePathDoesNotContainDecryptedOrBruteForced() {
        String sourcePath = "src\\main\\resources\\SourceTextEN.txt";
        String command = Command.e.toString();
        EncryptingData encryptingData = EncryptingData.builder()
            .withSourceTextPath(sourcePath)
            .withCommand(command).build();

        assertEquals("src\\main\\resources\\SourceTextEN[ENCRYPTED].txt", pathCreater.createPath(encryptingData));
    }

    @Test
    void createPath_shouldReturnCorrectPathWithDecrypted_whenCommandIsDecryptAndSourceFilePathDoeNotContainEncrypted() {
        String sourcePath = "src\\main\\resources\\SourceTextEN.txt";
        String command = Command.d.toString();
        EncryptingData encryptingData = EncryptingData.builder()
            .withSourceTextPath(sourcePath)
            .withCommand(command).build();

        assertEquals("src\\main\\resources\\SourceTextEN[DECRYPTED].txt", pathCreater.createPath(encryptingData));
    }

    @Test
    void createPath_shouldReturnCorrectPathWithBruteForced_whenCommandIsBruteForceAndSourceFilePathDoesNotContainDecryptedOrEncrypted() {
        String sourcePath = "src\\main\\resources\\SourceTextEN.txt";
        String command = Command.bf.toString();
        EncryptingData encryptingData = EncryptingData.builder()
            .withSourceTextPath(sourcePath)
            .withCommand(command).build();

        assertEquals("src\\main\\resources\\SourceTextEN[BRUTE_FORCED].txt", pathCreater.createPath(encryptingData));
    }
}
