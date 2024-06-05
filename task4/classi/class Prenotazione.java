public class Prenotazione{
    private int codice;
    private Soldi caparra;
    private Soldi saldo;
    private Data datainizio;
    private Data dataFine;
    private int numeroPersone;

    private ArrayList<Prodotto> prodottiPrenotati;
    private ControllerPrenotazione controllerPrenotazione; 

    public Prenotazione(int codice, Soldi saldo, Soldi caparra, Data dataInizio, Data dataFine, int numeroPersone){
        this.codice = codice;
        this.saldo = saldo;
        this.caparra = caparra;
        this.dataInizio = datainizio;
        this.dataFine = dataFine;
        this.numeroPersone = numeroPersone;
        this.prodottiPrenotati = new ArrayList<Prodotto>();
        this.controllerPrenotazione = new ControllerPrenotazione();
    }

    public void inserisciDatiPrenotazione(int numeroPersone, Data dataInizio, Data dataFine){}

    public int setNumeroPersone(int numeropersone){}

    public Data setDataInizio(Data dataInizio){}

    public Data setDataFine(Data dataFine){}

    public void addProdotto(Prodotto prodotto){} //da aggiungere nel diagramma delle classi
}