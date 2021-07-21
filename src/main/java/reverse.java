import org.apache.commons.lang3.ArrayUtils;

import static org.apache.commons.lang3.StringUtils.join;
import static org.apache.commons.lang3.StringUtils.split;

public class reverse {
    public static String reverseDelimited(final String str, final char separatorChar) {
        if (str == null) {
            return null;
        }
        // could implement manually, but simple way is to reuse other,
        // probably slower, methods.
        final String[] strs = split(str, separatorChar);
        ArrayUtils.reverse(strs);
        return join();
    }
}
