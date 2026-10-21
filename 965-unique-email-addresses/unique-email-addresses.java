
import java.util.*;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            StringBuilder local = new StringBuilder();
            int i = 0;

            while (email.charAt(i) != '@' && email.charAt(i) != '+') {
                if (email.charAt(i) != '.') {
                    local.append(email.charAt(i));
                }
                i++;
            }

            while (email.charAt(i) != '@') {
                i++;
            }

            local.append(email.substring(i));
            set.add(local.toString());
        }

        return set.size();
    }
}
