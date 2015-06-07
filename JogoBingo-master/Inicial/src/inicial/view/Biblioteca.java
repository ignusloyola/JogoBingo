package controls;

/**
 * Classe para referenciar os arquivos de áudio do projeto.
 * @author Aline Rigues
 */
public class Biblioteca {

	public enum Formatos {
		MP3, WAV, WMA, MID
	}
	
	public enum SonsCurtos {
		
		TORRETA("Turret - MP3", "arquivos/Portal2_music_turret_hello.mp3", Formatos.MP3),
		GLADOS_POTATO("GLaDOS potato - WAV", "arquivos/Portal2_music_glados_potato.wav", Formatos.WAV),
		BUTTON_POSITIVE("Button positive - MP3", "arquivos/Portal2_music_button_positive.mp3", Formatos.MP3);
		
		private String titulo; // title
		private String arquivo; // file
		private Formatos formato; // format
		
		SonsCurtos(String titulo, String arquivo, Formatos formato){
			this.titulo = titulo;
			this.arquivo = arquivo;
			this.formato = formato;
		}
		
		public String getTitulo(){
			return this.titulo;
		}
		
		public String getArquivo(){
			return this.arquivo;
		}
		
		public Formatos getFormato(){
			return this.formato;
		}
		
		public String toString()
		{
			return this.titulo;
		}
	}

	public enum SonsFundo {
	
		NENHUMA_MUSICA("- Nenhuma música -", null, null),
		SCIENCE_IS_FUN("Science Is Fun - MP3", "arquivos/Portal2_music_Science_is_Fun.mp3", Formatos.MP3),
		WANT_YOU_GONE("Want You Gone - WAV", "arquivos/Portal2_music_Want_You_Gone.wav", Formatos.WAV),
		BUTTON_POSITIVE("Button positive - MP3", "arquivos/Portal2_music_button_positive.mp3", Formatos.MP3);
		
		private String titulo; // title
		private String arquivo; // file
		private Formatos formato; // format
		
		SonsFundo(String titulo, String arquivo, Formatos formato){
			this.titulo = titulo;
			this.arquivo = arquivo;
			this.formato = formato;
		}
		
		public String getTitulo(){
			return this.titulo;
		}
		
		public String getArquivo(){
			return this.arquivo;
		}
		
		public Formatos getFormato(){
			return this.formato;
		}
		
		public String toString() {
			return this.titulo;
		}
	}
}
