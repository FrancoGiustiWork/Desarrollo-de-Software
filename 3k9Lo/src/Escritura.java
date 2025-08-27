import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Escritura {

    private int numeroEscritura;
    private String fechaEscritura;
    @ToString.Exclude
    private Lote lote;
    @ToString.Exclude
    private RegistroPropiedad registro;
}
