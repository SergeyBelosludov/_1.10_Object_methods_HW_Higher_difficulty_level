public class Author {

    private final String firstNameAuthor;
    private final String lastNameAuthor;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }
//
//    public String getFirstNameAuthor() {
//        return firstNameAuthor;
//    }
//
//    public String getLastNameAuthor() {
//        return lastNameAuthor;
//    }
//    public String getFullNameAuthor() {
//        return firstNameAuthor + " " + lastNameAuthor;
//    }

    ////////////////////////////////////////////////////////
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstNameAuthor.equals(author.firstNameAuthor) && lastNameAuthor.equals(author.lastNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, lastNameAuthor);
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstNameAuthor='" + firstNameAuthor + '\'' +
                ", lastNameAuthor='" + lastNameAuthor + '\'' +
                '}';
    }
*/

    @Override
    public String toString() {
        return "Author: " + this.firstNameAuthor + " " + this.lastNameAuthor;
    }

    @Override
    public int hashCode() {
        return this.firstNameAuthor.hashCode() + this.lastNameAuthor.hashCode();
    }

    public boolean equals(Object obj) {
        Author ob = (Author) obj;
        if (this == obj) {
            return true;
        } else if (this.firstNameAuthor == ob.firstNameAuthor && this.lastNameAuthor == ob.lastNameAuthor && this.hashCode() == ob.hashCode()) {
            return true;
        } else {
            return false;
        }
    }
}
