/**
 * Implementa um buffer de caracteres usando thread
 * @author LED
 * @version 1.0
 */
class Buffer {
	/**
	 * vetor para armazenar Strings
	 */
	private String [] _texto;
	private int _count = 0, _in = 0, _out = 0;

	/**
	 * Construtor
	 * @param tam tamanho do buffer
	 */
	Buffer(int tam) { 
		_texto = new String[tam];
	}

	/**
	 * Coloca uma String no buffer (de maneira sincronizada)
	 * @param s  string a ser inserido no buffer
	 */
	public synchronized void put(String c) {
		while((_count == _texto.length) && _count > 0) {
			try { 
				System.out.println("Esperando em put ...");
				wait(); // espera enquanto nao ha espaco no buffer
			}catch (InterruptedException e) { } 
			finally { } 
		} 
		System.out.println("Inserindo " + c + " ...");
		_texto[_in] = c; 
		_in = (_in + 1) % _texto.length; 
		_count++; 
		notify();  // notifica a insercao
	}

	/**
	 * Coloca uma String no buffer (de maneira sincronizada)
	 * @return string retirado do buffer
	 */
	public synchronized String get() {
		while (_count == 0) {
			try {
				System.out.println("Esperando em get ...");
				wait(); // espera enquanto nao existir elementos
			} catch (InterruptedException e) { } 
			finally { } 
		} 
		String c = _texto[_out]; 
		_out = (_out + 1) % _texto.length;
		_count--;
		System.out.println("Retirando " + c + " ..."); 
		notify();  // notifica a retirada
		return c;
	}
}
