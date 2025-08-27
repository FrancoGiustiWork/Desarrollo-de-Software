import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Edificio {

    private int idEdificio;
    private String nombre;
    private double superficieConstruida;

}
