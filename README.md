#Cryptograph

A Java-based cryptographer program that encrypts, decrypts, and breaks the Caesar cipher using two methods: frequency analysis and statistical analysis.

#Launch Modes

#The program can be launched in two ways:

Command Line: Pass arguments at startup using the following templates. This mode is ideal for automating tasks or integrating with other scripts. You can use this mode to create batch scripts or automate tasks using the program.
Desktop Application: Launch the program without arguments to use the graphical interface. This mode is perfect for interactive use or when you need to visualize the encryption and decryption process. The desktop application provides a user-friendly interface for selecting the launch mode, specifying keys, and visualizing the encryption and decryption process.
Commands

#The program supports three main commands:

#e: Encrypt text with a specified key. This command is used to encrypt a file using the Caesar cipher. You can specify the key as an integer value, and the program will shift the characters in the file accordingly.
#d: Decrypt text with a specified key. This command is used to decrypt a file that was previously encrypted using the Caesar cipher. You can specify the key as an integer value, and the program will shift the characters in the file back to their original positions.
#bf: Break the cipher using frequency analysis or statistical analysis. This command is used to crack the Caesar cipher without knowing the key. The program uses two methods to break the cipher: frequency analysis and statistical analysis.
Templates and Examples

#Here are the templates and examples for each command:

Encryption: java -jar jarFile -e filePath key
Example: java -jar c:/MyProject/target/myApp.jar -e folder/srcFile.txt 20
Result: An encrypted file marked [ENCRYPTED] will be created in the same directory as the original file.
Decryption: java -jar jarFile -d filePath key
Example: java -jar c:/MyProject/target/myApp.jar -d folder/srcFile.txt 20
Result: A decrypted file marked [DECRYPTED] will be created in the same directory as the original file.
Brute Force (Frequency Analysis): java -jar jarFile -bf filePath
Example: java -jar c:/MyProject/target/myApp.jar -bf folder/srcFile.txt
Result: An encrypted file with the key used to crack the cipher in its name will be created in the same directory as the original file.
Brute Force (Statistical Analysis): java -jar jarFile -bf filePath additionalFile
Example: java -jar c:/MyProject/target/myApp.jar -bf folder/srcFile.txt folder/additionalFile.txt
Result: An encrypted file with the key used to crack the cipher in its name will be created in the same directory as the original file.
Features and Notes

#Here are some important features and notes to keep in mind:

The program supports English and Ukrainian languages, as well as specific symbols such as ., ,, «, », ", ', :, !, ?, and space. This means that the program can handle texts with mixed languages and symbols.
If the text contains both languages, the hack will only work for one language, and the other language will not be encoded. This is because the program uses language-specific frequency analysis and statistical analysis to break the cipher.
Frequency analysis uses a RegEx expression to compare the decoded string with the original text. This method is useful when the text contains common patterns or phrases.
Statistical analysis uses the Map interface to determine the number of symbols and percentage ratio between the original and encrypted texts. This method is useful when the text contains unique patterns or phrases.
The program may not display correctly if the text does not match the text validation pattern. This is because the program uses a specific pattern to validate the input text.
If one method doesn't work, try another. The program provides two methods for breaking the cipher, and you may need to try both to achieve the desired result.
Desktop Application

#The desktop application provides a graphical interface for interacting with the program. You can:

Choose the launch mode (encryption, decryption, or brute force)
Specify a key for encryption or decryption
Specify an additional file for statistical analysis
Visualize the encryption and decryption process using the graphical interface
View the encrypted and decrypted texts in real-time
Save the encrypted and decrypted texts to files
Technical Details

#The program uses the following technical details:

Java 8 as the programming language
Maven as the build tool
JavaFX for the desktop application
RegEx for frequency analysis
Map interface for statistical analysis
License

#The program is licensed under the MIT License, which means that you are free to use, modify, and distribute the program as per the terms of the license.

#Contributing

If you'd like to contribute to the program, please fork the repository and submit a pull request. You can also report issues or suggest new features using the issue tracker.

#Acknowledgments

The program uses the following open-source libraries and resources:

JavaFX for the desktop application
Maven for building and managing the project
RegEx for frequency analysis
Map interface for statistical analysis
Changelog

#Here is a list of changes made to the program:

Version 1.0: Initial release
Version 1.1: Added support for Ukrainian language
Version 1.2: Improved frequency analysis algorithm
Version 1.3: Added statistical analysis method
Version 1.4: Improved desktop application interface
#FAQ

Here are some frequently asked questions about the program:

Q: What is the Caesar cipher? A: The Caesar cipher is a type of substitution cipher where each letter in the plaintext is 'shifted' a certain number of places down the alphabet.
Q: How does the program break the Caesar cipher? A: The program uses two methods to break the Caesar cipher: frequency analysis and statistical analysis.
Q: What is frequency analysis? A: Frequency analysis is a method of breaking the Caesar cipher by analyzing the frequency of letters in the ciphertext.
Q: What is statistical analysis? A: Statistical analysis is a method of breaking the Caesar cipher by analyzing the statistical properties of the ciphertext.
!!!
Для ментора Олександра

Для запуску проєкта перейдіть в директорію main-resources-копіюєте шлях SourceTextEN.txt і вставляєте в bash Input File Path: 

!!!
