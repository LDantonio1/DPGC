public class PacchettoVacanza extends Prodotto {
    private Data dataInizio, dataFine;
    private Soldi costo;
    private String tipologia;
    private int numeroStelle;

    private ControllerPacchettoVacanze controllerPacchettoVacanze;

    public PacchettoVacanza(int codice, Soldi costo, Data dataInizio, Data dataFine, String Tipologia, int numeroStelle) {
        super(codice, costo);
        this(dataInizio, dataFine, tipologia, numeroStelle);
    };

    public void setCosto(Soldi costo) {};

    public void setDataInizio(Data dataInizio) {};

    public void setDataFine(Data dataFine) {};

    public void setNumeroStelle(int numeroStelle) {};

    public void setTipologia(String tipologia) {};
}