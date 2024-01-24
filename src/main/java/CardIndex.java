public class CardIndex {
    public static void main(String[] args) {

        Movie[] films = {
                new Movie("Москва слезам не верит", 9.2, "Трагикомедия", "Россия", true),
                new Movie("Terminator", 9.7, "Action", "USA", false),
                new Movie("Split", 8.2, "Thriller", "USA", false),
        };

        for (Movie a : films) {
            System.out.println("Фильм");
            System.out.println(a.tittle + "|" + a.genre + "|" + a.rating + "|" + a.country);
            System.out.println(" ");
        }




        }



    }

