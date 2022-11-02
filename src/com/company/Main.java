package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Book[] books = new Book[2];
        String[] authors1 = {"Stephen Chbosky"};
        String[] authors2 = {"Jennifer Chang Wathall", "Josip Harcet", "Rose Harrison", "Lorraine Heinrichs", "Marlene Torres-Skoumal"};
        books[0] = new Book("The Perks of Being a Wallflower", authors1, 1999);
        books[1] = new Book("Mathematics: Analysis and Approaches - Higher Level", authors2, 2019);

        for (Book b : books)
            System.out.println(b);
    }
}

class Book
{
    String title;
    String[] authors;
    int publicationYear;

    Book(String title, String[] authors, int publicationYear)
    {
        this.title = title;
        this.authors = authors;
        this.publicationYear = publicationYear;
    }

    public String toString()
    {
        StringBuffer strBuffer = new StringBuffer();
        int numAuth = authors.length;
        for (int i = 0; i < numAuth; i = i + 1)
        {
            strBuffer.append(authors[i]);
            if (i != numAuth - 1)
                strBuffer.append(" & ");
        }
        strBuffer.append(": " + title + " ");
        strBuffer.append("(" + publicationYear + ")");

        return strBuffer.toString();
    }

    public String getTitle()
    {
        return title;
    }

    public String[] getAuthors()
    {
        return authors;
    }

    public int getPublicationYear()
    {
        return publicationYear;
    }

    public int numAuthors()
    {
        return authors.length;
    }

    public boolean newerThan(Book book)
    {
        return publicationYear > book.getPublicationYear();
    }
}
