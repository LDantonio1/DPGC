public class Richiesta {
    private String tipo;

    private Prenotazione prenotazione;
    private Ticket ticket;
    private ControllerRichieste controllerRichieste;

    public Richiesta (String tipo) {
        setTipo(tipo)
		this.ticket = new Ticket();
		this.controllerRichieste = new ControllerRichieste();
		this.prenotazione = new Prenotazione();
    }

    public void setTipo (String tipo);
}