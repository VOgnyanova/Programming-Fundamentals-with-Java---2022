package objectsAndClassesExercise;


public class advertisementMessage {
    static class Message {
        private String phrases;
        private String events;
        private String authors;
        private String cities;


        public void advertisementMessage(String phrases, String events, String authors, String cities) {
            this.phrases = phrases;
            this.events = events;
            this.authors = authors;
            this.cities = cities;

        }

        @Override
        public String toString() {
            return phrases + " " + events + " " + authors + " " + cities;
        }
    }
}