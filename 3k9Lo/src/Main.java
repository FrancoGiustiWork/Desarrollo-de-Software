//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RegistroPropiedad registro1 = RegistroPropiedad.builder()
                .idRegistro(1)
                .nombreRegistro("Capital Mendoza")
                .build();

        Lote lote2 = Lote.builder()
                .idPadron(1)
                .domiciolio("suipacha 239")
                .superficie(100.0)
                .build();
        Lote lote1 = Lote.builder()
            .idPadron(2)
            .domiciolio("suipacha 239")
            .superficie(100.0)
            .build();

        Edificio edificio1 = Edificio.builder()
                .idEdificio(1)
                .nombre("Presidente")
                .superficieConstruida(75.0)
                .build();

    registro1.construirEdificio(lote1,edificio1);
    registro1.registrarLote(lote1,"12/25");
    registro1.registrarLote(lote2,"5/25");
        for (Escritura escritura : registro1.getEscrituras()){
            System.out.println(escritura.toString());
        }
    }
}