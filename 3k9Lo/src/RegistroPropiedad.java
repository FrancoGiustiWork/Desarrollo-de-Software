import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class RegistroPropiedad {
    private int idRegistro;
    private String nombreRegistro;

    @Builder.Default
    private List<Escritura> escrituras = new ArrayList<>();
    private static int nextNumeroEscitura = 0;

    public void registrarLote(Lote lote, String fecheEscritura){
        nextNumeroEscitura ++;
        Escritura escritura = new Escritura(nextNumeroEscitura,fecheEscritura,lote,this);
        escrituras.add(escritura);
        System.out.println("Escritura N°"+nextNumeroEscitura+" en el lote "+ lote.getIdPadron() +" Registrada");
    }
    public void construirEdificio(Lote lote, Edificio edificio){
       if(lote.isConstruible()){
           lote.setEdificioConstruido(edificio);
           System.out.println("Edicio "+ edificio.getNombre() + " construido" );
       }else{
           System.out.println("Nose puede construir en el lote "+lote.getIdPadron()+" por que ya tiene un edificio");
       }
    }
   }
