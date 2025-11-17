public class Libro {
    private String titulo;
    private String autor;
    private int Npaginas ;
    private String ISBN;
    private String editora;
    private String FechaPublicacion;
    private int edicion;

    //Constructor/ Constructores Atributos imprescindibles
    public Libro(String titulo, String autor, String ISBN, String FechaPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
        this.FechaPublicacion=FechaPublicacion;
        this.edicion=1;
        this.Npaginas=1;
        this.editora="Auto-Publicacion";

        //Constructor con todos los atributos
        public Libro (String titulo, String autor, String ISBN, String FechaPublicacion, String editora, int edicion, int NPaginas)

        public String getTitulo(){
            return this.titulo;
        }
         public String getTitulo(){
            return this.autor;
        }
        public String getTitulo(){
            return this.ISBN;

        }
        public String getTitulo(){
            return this.FechaPublicacion;
        }
            public String getTitulo(){
                return this.edicion = edicion;
            }
            public String getTitulo(){
                return this.Npaginas;
            }
            public String getTitulo(){
                if(nPaginas > 0);
                return this.Npaginas;
            }
    }
}