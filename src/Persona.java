
    public class Persona {
        
        //Atributos:
        private float nombre;
        private float genero;
        private float materia;
        private float calificacion;
        private int cont_excelentes;
        //Constructor:
        public Persona(float nombre, float genero, float materia, float calificacion) {
            this.nombre = nombre;
            this.genero = genero;
            this.materia = materia;
            this.calificacion = calificacion;
        }
        
        //Metodos:
        public int contarExcelentes() {
            if (this.calificacion > 90 && this.calificacion <= 100) {
                this.cont_excelentes += 1;
            }
            return this.cont_excelentes;
        }
        
        //Definicion Get:
        public float getnombre() {
            return this.nombre;
        }
        public float getgenero() {
            return this.genero;
        }
        public float getmateria() {
            return this.materia;
        }
        public float getcalificacion() {
            return this.calificacion;
        }
        public int getcont_excelentes() {
            return this.cont_excelentes;
        }
        //Definicion Set:
        public void setnombre(float nombre) {
            this.nombre = nombre;
        }
        public void setgenero(float genero) {
            this.genero = genero;
        }
        public void setmateria(float materia) {
            this.materia = materia;
        }
        public void setcalificacion(float calificacion) {
            this.calificacion = calificacion;
        }
    }

