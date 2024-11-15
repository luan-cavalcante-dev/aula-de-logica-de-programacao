package sistemadenotificacao;

public class Principal {

	public static void main(String[] args) {
		
		// informando variaveis para classe main
		
		Email gmail = new Email ();
		gmail.enviarMensagem();
		
		Sms mensagem = new Sms ();
		mensagem.enviarMensagem();
		
		PushNotification  instagram = new PushNotification  ();
		instagram.enviarMensagem();
		
				
	

	}

}
