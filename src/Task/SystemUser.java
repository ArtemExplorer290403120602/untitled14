package Task;

public class SystemUser {

    public static void register(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

            if (login.length() > 20 || login.contains(" ")) {
                throw new WrongLoginException("Логин содержит пробелы или ввели больше 20 символов");
            }
            if (password.length() > 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
                throw new WrongPasswordException("Ваш пароль содержит пробелы или не начинается с цифры или больше 20 символов");
            }
            if(!password.equals(confirmPassword)){
                System.out.println("Ваши пароли не сходятся!");
            }
            else{
            System.out.println("true");
        }
    }
}
