Cryptograph

A Java-based cryptographer program that encrypts, decrypts, and breaks the Caesar cipher using two methods: frequency analysis and statistical analysis.

Launch Modes

The program can be launched in two ways:

Command Line: Pass arguments at startup using the following templates. This mode is ideal for automating tasks or integrating with other scripts.
Desktop Application: Launch the program without arguments to use the graphical interface. This mode is perfect for interactive use or when you need to visualize the encryption and decryption process.
Commands

The program supports three main commands:

e: Encrypt text with a specified key. This command is used to encrypt a file using the Caesar cipher.
d: Decrypt text with a specified key. This command is used to decrypt a file that was previously encrypted using the Caesar cipher.
bf: Break the cipher using frequency analysis or statistical analysis. This command is used to crack the Caesar cipher without knowing the key.
Templates and Examples

Here are the templates and examples for each command:

Encryption: java -jar jarFile -e filePath key
Example: java -jar c:/MyProject/target/myApp.jar -e folder/srcFile.txt 20
Result: An encrypted file marked [ENCRYPTED]
Decryption: java -jar jarFile -d filePath key
Example: java -jar c:/MyProject/target/myApp.jar -d folder/srcFile.txt 20
Result: A decrypted file marked [DECRYPTED]
Brute Force (Frequency Analysis): java -jar jarFile -bf filePath
Example: java -jar c:/MyProject/target/myApp.jar -bf folder/srcFile.txt
Result: An encrypted file with the key used to crack the cipher in its name
Brute Force (Statistical Analysis): java -jar jarFile -bf filePath additionalFile
Example: java -jar c:/MyProject/target/myApp.jar -bf folder/srcFile.txt folder/additionalFile.txt
Result: An encrypted file with the key used to crack the cipher in its name
Features and Notes

Here are some important features and notes to keep in mind:

The program supports English and Ukrainian languages, as well as specific symbols such as ., ,, «, », ", ', :, !, ?, and space.
If the text contains both languages, the hack will only work for one language, and the other language will not be encoded.
Frequency analysis uses a RegEx expression to compare the decoded string with the original text.
Statistical analysis uses the Map interface to determine the number of symbols and percentage ratio between the original and encrypted texts.
The program may not display correctly if the text does not match the text validation pattern.
If one method doesn't work, try another. The program provides two methods for breaking the cipher, and you may need to try both to achieve the desired result.
Desktop Application

The desktop application provides a graphical interface for interacting with the program. You can:

Choose the launch mode (encryption, decryption, or brute force)
Specify a key for encryption or decryption
Specify an additional file for statistical analysis
Visualize the encryption and decryption process
!!!
Для ментора Олександра

Для запуску проєкта перейдіть в директорію main-resources-копіюєте шлях SourceTextEN.txt і вставляєте в bash Input File Path: 

!!!
