Cryptograph

A Java-based cryptographer program that encrypts, decrypts, and breaks the Caesar cipher using two methods: frequency analysis and statistical analysis.

Launch Modes

Command Line: Pass arguments at startup using the following templates:
Desktop Application: Launch the program without arguments to use the graphical interface.
Commands

e: Encrypt text with a specified key.
d: Decrypt text with a specified key.
bf: Break the cipher using frequency analysis or statistical analysis.
Templates and Examples

Encryption: java -jar jarFile -e filePath key
Decryption: java -jar jarFile -d filePath key
Brute Force (Frequency Analysis): java -jar jarFile -bf filePath
Brute Force (Statistical Analysis): java -jar jarFile -bf filePath additionalFile
Features and Notes

Supports English and Ukrainian languages, as well as specific symbols.
If the text contains both languages, the hack will only work for one language.
Frequency analysis uses a RegEx expression to compare the decoded string.
Statistical analysis uses the Map interface to determine the number of symbols and percentage ratio.
May not display correctly if the text does not match the text validation pattern.
If one method doesn't work, try another.
Desktop Application

Choose the launch mode, specify a key for encryption or decryption, or specify an additional file for statistical analysis.

!!!
Для ментора Олександра

Для запуску проєкта перейдіть в директорію main-resources-копіюєте шлях SourceTextEN.txt і вставляєте в bash Input File Path: 

!!!
