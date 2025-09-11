public class Array {
    public static void main(String[] args) {
        DVD[] dvdCollection = new DVD[15];
        dvdCollection[0] = new DVD("Inception", 2010, "Christopher Nolan");
        dvdCollection[1] = new DVD("The Matrix", 1999, "The Wachowskis");
        dvdCollection[2] = new DVD("Interstellar", 2014, "Christopher Nolan");

        for (int i = 0; i < dvdCollection.length; i++) {
            if (dvdCollection[i] != null) {
                System.out.println(dvdCollection[i]);
            }
        }
    }
}

class DVD {  // <- removed 'public' because Array is already public
    private String name;
    private int releaseYear;
    private String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }
}
