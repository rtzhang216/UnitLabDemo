public interface CILabInterface {

    /**
     * Returns the current string. If the string is null, it should return null.
     *
     * @return Current string
     */
    String getString();

    /**
     * Sets the value of the current string.
     *
     * @param string The value to be set
     */
    void setString(String string);

    /**
     *  We define the usage of capitals in a word to be right when one of the following cases holds:
     *  All letters in this word are capitals, like "USA".
     *  All letters in this word are not capitals, like "leetcode".
     *  Only the first letter in this word is capital, like "Google".
     * @return  Given a string word, return true if the usage of capitals in it is right.
     */

    boolean detectCapitalUse();

}
