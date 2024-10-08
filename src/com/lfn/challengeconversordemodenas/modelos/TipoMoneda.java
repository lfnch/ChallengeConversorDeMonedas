package com.lfn.challengeconversordemodenas.modelos;

/*
 * TipoMonedas
 * Clase enum que es una clase no mutable, es estatica, tipo CONSTANTE
 */
public enum TipoMoneda {
	USD("USD", "Dólar Estadounidense"),
	ARS("ARS", "Peso Argentino"),
	COP("COP", "Peso Colombiano"),
	BOB("BOB", "Boliviano"),
	BRL("BRL", "Real Brasileño"),
	CLP("CLP", "Peso Chileno"),
	CNY("CNY", "Yuan Chino"),
	CAD("CAD", "Dólar Canadiense"),
	EUR("EUR", "Euro"),
	GBP("GBP", "Libra Esterlina"),
	INR("INR", "Rupia India"),
	MXN("MXN", "Peso Mexicano");
	
	/*
    AED("AED", "Dirham de los Emiratos Árabes Unidos"),
    AFN("AFN", "Afgani Afganí"),
    ALL("ALL", "Lek Albanés"),
    AMD("AMD", "Dram Armenio"),
    ANG("ANG", "Florín de las Antillas Neerlandesas"),
    AOA("AOA", "Kwanza Angoleño"),
    AUD("AUD", "Dólar Australiano"),
    AWG("AWG", "Florín Arubano"),
    AZN("AZN", "Manat Azerí"),
    BAM("BAM", "Marco Convertible de Bosnia y Herzegovina"),
    BBD("BBD", "Dólar Barbadense"),
    BDT("BDT", "Taka Bangladesí"),
    BGN("BGN", "Lev Búlgaro"),
    BHD("BHD", "Dinar Bahreiní"),
    BIF("BIF", "Franco Burundés"),
    BMD("BMD", "Dólar Bermudeño"),
    BND("BND", "Dólar de Brunei"),
    BSD("BSD", "Dólar Bahameño"),
    BTN("BTN", "Ngultrum Butanés"),
    BWP("BWP", "Pula Botswanés"),
    BYN("BYN", "Rublos Bielorruso"),
    BZD("BZD", "Dólar Beliceño"),
    CDF("CDF", "Franco Congoleño"),
    CHF("CHF", "Franco Suizo"),
    CRC("CRC", "Colón Costarricense"),
    CUP("CUP", "Peso Cubano"),
    CVE("CVE", "Escudo Caboverdiano"),
    CZK("CZK", "Corona Checa"),
    DJF("DJF", "Franco yibutiano"),
    DKK("DKK", "Corona Danesa"),
    DOP("DOP", "Peso Dominicano"),
    DZD("DZD", "Dinar Argelino"),
    EGP("EGP", "Libra Egipcia"),
    ERN("ERN", "Nakfa Eritreo"),
    ETB("ETB", "Birr Etíope"),
    FJD("FJD", "Dólar de Fiyi"),
    FKP("FKP", "Libra de las Malvinas"),
    FOK("FOK", "Corona de las Islas Feroe"),
    GEL("GEL", "Lari Georgiano"),
    GGP("GGP", "Libra de Guernsey"),
    GHS("GHS", "Cedi Ghanés"),
    GIP("GIP", "Libra de Gibraltar"),
    GMD("GMD", "Dalasi Gambiano"),
    GNF("GNF", "Franco Guineano"),
    GTQ("GTQ", "Quetzal Guatemalteco"),
    GYD("GYD", "Dólar Guyanes"),
    HKD("HKD", "Dólar de Hong Kong"),
    HNL("HNL", "Lempira Hondureño"),
    HRK("HRK", "Kuna Croata"),
    HTG("HTG", "Gourde Haitiano"),
    HUF("HUF", "Forint Húngaro"),
    IDR("IDR", "Rupia Indonesa"),
    ILS("ILS", "Nuevo Shekel Israelí"),
    IMP("IMP", "Libra de la Isla de Man"),
    IQD("IQD", "Dinar Iraquí"),
    IRR("IRR", "Rial Iraní"),
    ISK("ISK", "Corona Islandesa"),
    JEP("JEP", "Libra de Jersey"),
    JMD("JMD", "Dólar Jamaiquino"),
    JOD("JOD", "Dinar Jordano"),
    JPY("JPY", "Yen Japonés"),
    KES("KES", "Chelín Keniano"),
    KGS("KGS", "Som Kirguís"),
    KHR("KHR", "Riel Camboyano"),
    KID("KID", "Dólar de Kiribati"),
    KMF("KMF", "Franco Comorano"),
    KRW("KRW", "Won Surcoreano"),
    KWD("KWD", "Dinar Kuwaití"),
    KYD("KYD", "Dólar de las Islas Caimán"),
    KZT("KZT", "Tenge Kazajo"),
    LAK("LAK", "Kip Lao"),
    LBP("LBP", "Libra Libanesa"),
    LKR("LKR", "Rupia de Sri Lanka"),
    LRD("LRD", "Dólar Liberiano"),
    LSL("LSL", "Loti Lesothense"),
    LYD("LYD", "Dinar Libio"),
    MAD("MAD", "Dirham Marroquí"),
    MDL("MDL", "Leu Moldavo"),
    MGA("MGA", "Ariary Malgache"),
    MKD("MKD", "Denar Macedonio"),
    MMK("MMK", "Kyat Birmano"),
    MNT("MNT", "Tugrik Mongol"),
    MOP("MOP", "Pataca Macanesa"),
    MRU("MRU", "Ouguiya Mauritano"),
    MUR("MUR", "Rupia de Mauricio"),
    MVR("MVR", "Rufiyaa Maldivo"),
    MWK("MWK", "Kwacha Malauí"),
    MYR("MYR", "Ringgit Malasio"),
    MZN("MZN", "Metical Mozambicano"),
    NAD("NAD", "Dólar Namibio"),
    NGN("NGN", "Naira Nigeriana"),
    NIO("NIO", "Córdoba Nicaragüense"),
    NOK("NOK", "Corona Noruega"),
    NPR("NPR", "Rupia Nepalí"),
    NZD("NZD", "Dólar Neozelandés"),
    OMR("OMR", "Rial Omaní"),
    PAB("PAB", "Balboa Panameño"),
    PEN("PEN", "Nuevo Sol Peruano"),
    PGK("PGK", "Kina Papuano"),
    PHP("PHP", "Peso Filipino"),
    PKR("PKR", "Rupia Pakistaní"),
    PLN("PLN", "Zloty Polaco"),
    PYG("PYG", "Guaraní Paraguayo"),
    QAR("QAR", "Riyal Catarí"),
    RON("RON", "Leu Rumano"),
    RSD("RSD", "Dinar Serbio"),
    RUB("RUB", "Rublo Ruso"),
    RWF("RWF", "Franco Ruandés"),
    SAR("SAR", "Riyal Saudita"),
    SBD("SBD", "Dólar de las Islas Salomón"),
    SCR("SCR", "Rupia de Seychelles"),
    SDG("SDG", "Libra Sudanesa"),
    SEK("SEK", "Corona Sueca"),
    SGD("SGD", "Dólar de Singapur"),
    SHP("SHP", "Libra de Santa Elena"),
    SLE("SLE", "León de Sierra Leona"),
    SLL("SLL", "León de Sierra Leona"),
    SOS("SOS", "Chelín Somalí"),
    SRD("SRD", "Dólar de Surinam"),
    SSP("SSP", "Libra SurSudanesa"),
    STN("STN", "Dobra de Santo Tomé y Príncipe"),
    SYP("SYP", "Libra Siria"),
    SZL("SZL", "Lilangeni Suazi"),
    THB("THB", "Baht Tailandés"),
    TJS("TJS", "Somoni Tayiko"),
    TMT("TMT", "Manat Turcomano"),
    TND("TND", "Dinar Tunecino"),
    TOP("TOP", "Paʻanga Tongano"),
    TRY("TRY", "Lira Turca"),
    TTD("TTD", "Dólar de Trinidad y Tobago"),
    TVD("TVD", "Dólar Tuvaluano"),
    TWD("TWD", "Dólar de Taiwán"),
    TZS("TZS", "Chelín Tanzano"),
    UAH("UAH", "Grivna Ucraniana"),
    UGX("UGX", "Chelín Ugandés"),
    UYU("UYU", "Peso Uruguayo"),
    UZS("UZS", "Som Uzbeko"),
    VES("VES", "Bolívar Soberano Venezolano"),
    VND("VND", "Dong Vietnamita"),
    VUV("VUV", "Vatu Vanuatuense"),
    WST("WST", "Tala Samoano"),
    XAF("XAF", "Franco CFA de África Central"),
    XCD("XCD", "Dólar del Caribe Oriental"),
    XDR("XDR", "Derechos Especiales de Giro"),
    XOF("XOF", "Franco CFA de África Occidental"),
    XPF("XPF", "Franco CFP"),
    YER("YER", "Rial Yemení"),
    ZAR("ZAR", "Rand Sudafricano"),
    ZMW("ZMW", "Kwacha Zambiano"),
    ZWL("ZWL", "Dólar Zimbabuense")
    */
	
	private final String abreviatura;
    private final String nombre;

    // Constructor del enum
    TipoMoneda(String abreviatura, String nombreCompleto) {
        this.abreviatura = abreviatura;
        this.nombre = nombreCompleto;
    }

    // Métodos para obtener los valores
    public String getAbreviatura() {
        return abreviatura;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return abreviatura + " - " + nombre;
    }
    
    public static boolean existeAbreviatura(String abreviatura) {
        for (TipoMoneda moneda : TipoMoneda.values()) {
            if (moneda.getAbreviatura().equals(abreviatura)) {
                return true;
            }
        }
        return false;
    }
}
