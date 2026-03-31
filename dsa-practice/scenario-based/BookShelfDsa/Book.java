
    public class Book {
        private String title;
        private String author;
        private String genre;
        private String isbn;

        public Book(String title, String author, String genre, String isbn) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.isbn = isbn;
        }

        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public String getGenre() { return genre; }

      
        @Override
        public boolean equals(Object obj){
            if (this == obj) return true ;
            if (!(obj instanceof Book)) return false;
            Book b = (Book) obj;
            return isbn.equalsIgnoreCase(b.isbn);
        }

        public String getIsbn(){
            return isbn;
        }

        @Override
        public int hashCode(){
            return isbn.toLowerCase().hashCode();
        }

        @Override
        public String toString(){
            return String.format("title: %s | author: %s | isbn: %s",
                    title, author, isbn);
        }
    }
