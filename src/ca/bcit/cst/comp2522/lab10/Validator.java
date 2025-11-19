package ca.bcit.cst.comp2522.lab10;

import java.util.List;

public final class Validator
{
    private Validator()
    {
        // Prevent instantiation
    }

    /**
     * Validates the provided string.
     *
     * @param str     The string to validate
     * @param varName Name of the variable being validated
     */
    public static void validateString(final String str,
                                      final String varName)
    {
        if (str == null || str.isBlank())
        {
            throw new IllegalArgumentException(varName + " cannot be null or blank");
        }
    }

    /**
     * Validates the provided value is greater than the minimum threshold.
     *
     * @param value   The value to validate
     * @param min     The mininum value allowed
     * @param varName Then name of the variable being validated
     */
    public static void validateIntGreaterThan(final int value,
                                              final int min,
                                              final String varName)
    {
        if (value < min)
        {
            throw new IllegalArgumentException(varName + " must be greater than or equal to " + min);
        }
    }

    /**
     * Validates the provided value is less than the maximum threshold.
     *
     * @param value   The value to validate
     * @param max     The maximum value allowed
     * @param varName Then name of the variable being validated
     */
    public static void validateIntLessThan(final int value,
                                           final int max,
                                           final String varName)
    {
        if (value > max)
        {
            throw new IllegalArgumentException(varName + " must be less than or equal to " + max);
        }
    }

    /**
     * Validates the provided value is between minimum and maximum threshold.
     *
     * @param value   The value to validate
     * @param min     The minimum value allowed
     * @param max     The maximum value allowed
     * @param varName The name of the variable being validated
     */
    public static void validateIntInRange(final int value,
                                          final int min,
                                          final int max,
                                          final String varName)
    {
        if (value < min || value > max)
        {
            throw new IllegalArgumentException(varName + " must be between " + min + " and " + max);
        }
    }

    /**
     * Validates the provided list is not null and is the given size.
     *
     * @param array   The array to validate
     * @param size    Size the array must be
     * @param varName The name of the variable to validate
     * @param <T>     The type of the array elements
     */
    public static <T> void validateNumArrayElements(final T[] array,
                                                    final int size,
                                                    final String varName)
    {
        if (array == null)
        {
            throw new IllegalArgumentException(varName + " cannot be null");
        }

        if (array.length != size)
        {
            throw new IllegalArgumentException(varName + " array length must be equal to " + size);
        }
    }

    /**
     * Validates the provided list is not null or empty.
     *
     * @param list    The list to validate
     * @param varName The name of the variable being validated
     * @param <T>     The type of elements in the list
     */
    public static <T> void validateList(final List<T> list,
                                        final String varName)
    {
        if (list == null || list.isEmpty())
        {
            throw new IllegalArgumentException(varName + " cannot be null or empty");
        }

        if (list.contains(null))
        {
            throw new IllegalArgumentException(varName + " cannot contain null elements");
        }
    }
}
