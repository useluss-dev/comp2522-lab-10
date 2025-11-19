package ca.bcit.comp2522.lab10;


/**
 * Represents a Novel that stores book information.
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
class Novel
{
    private final String title;
    private final String author;
    private final int    yearPublished;


    /**
     * Constructor to initialize the novel's title, author, and publication year.
     *
     * @param title The title of the novel.
     * @param author The author of the novel.
     * @param yearPublished The year the novel was published.
     */
    public Novel(final String title,
                 final String author,
                 final int yearPublished)
    {
        this.title         = title;
        this.author        = author;
        this.yearPublished = yearPublished;
    }

    /**
     * Gets the title of the novel.
     *
     * @return The title of the novel.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Gets the year the novel was published.
     *
     * @return The publication year of the novel.
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * Gets the name of the author.
     *
     * @return The author's name.
     */
    public String getAuthorName()
    {
        return author;
    }

    /**
     * Returns a string representation of the novel.
     *
     * @return A string representation of the novel.
     */
    @Override
    public String toString()
    {
        return title + " by " + author + " (" + yearPublished + ")";
    }
}
