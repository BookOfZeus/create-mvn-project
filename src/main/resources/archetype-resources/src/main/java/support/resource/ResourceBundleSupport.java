package ${package}.support.resource;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Resource Bundle Support
 */
public class ResourceBundleSupport {

    /**
     * The default locale
     */
    private static final Locale locale = Locale.getDefault();

    /**
     * The default resource bundle
     */
    private static final ResourceBundle messages = ResourceBundle.getBundle("messages", locale);

    /**
     * Get the message setup in the messages.properties
     *
     * Will return an empty string if not found
     *
     * @param key The message key
     * @return String
     */
    public static String getFactoryMessage(String key) {
        try {
            return messages.getString(key);
        }
        catch (Exception e) {
            return "";
        }
    }

    /**
     * Merge messages
     *
     * @param locale The resource bundle message key
     * @param message The message(s)
     * @return String
     */
    public static String join(String locale, Object... message) {
        return String.format(
                getFactoryMessage(locale),
                message
        );
    }
}