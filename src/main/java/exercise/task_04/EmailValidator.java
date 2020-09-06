package exercise.task_04;

/**
 * Wykorzystując podejście TDD napisz metodę sprawdzającą poprawność podanego w parametrze adresu e-mail.
 *
 */
public class EmailValidator {

    public boolean isMailValid(String mail) {
        if (mail == null) {
            return false;
        }

        String[] splitByAt = mail.split("@");
        if (splitByAt.length == 2) {
            String domainName = splitByAt[1];
            if (!domainName.contains(".")) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
