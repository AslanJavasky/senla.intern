package task3_password_generator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину пароля (от 8 до 12 символов): ");
        int passwordLength = scanner.nextInt();

        if (passwordLength < 8 || passwordLength > 12) {
            System.out.println("Недопустимая длина пароля. Длина должна быть от 8 до 12 символов.");
            return;
        }

        String password = generatePassword(passwordLength);
        System.out.println("Сгенерированный пароль: " + password);
    }

    public static String generatePassword(int length) {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()_+";

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        // Добавляем как минимум один символ из каждой категории
        password.append(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
        password.append(smallLetters.charAt(random.nextInt(smallLetters.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialChars.charAt(random.nextInt(specialChars.length())));

        // Добавляем оставшиеся символы
        for (int i = 4; i < length; i++) {
            String allChars = capitalLetters + smallLetters + digits + specialChars;
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        // Перемешиваем символы
        char[] passwordChars = password.toString().toCharArray();
        for (int i = 0; i < passwordChars.length; i++) {
            int randomIndex = random.nextInt(passwordChars.length);
            char temp = passwordChars[i];
            passwordChars[i] = passwordChars[randomIndex];
            passwordChars[randomIndex] = temp;
        }

        return new String(passwordChars);
    }
}

