import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Lote {
    private int idPadron;
    private String domiciolio;
    private double superficie;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Edificio edificioConstruido;

    public boolean isConstruible(){
        return this.edificioConstruido == null;
    }
}
