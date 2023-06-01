
package modeloVO;
import java.sql.Timestamp;
import java.sql.Date;

/**
 *
 * @author 57320
 */
public class Voto {
    Integer id;
    Timestamp fechacreacion;
    Timestamp fechavoto;
    Votante votante;
    Candidato candidato;
    public Voto() {
    }

    public Voto(Integer id, Timestamp fechacreacion, Timestamp fechavoto, Candidato candidato, Votante votante) {
        this.id = id;
        this.fechacreacion = fechacreacion;
        this.fechavoto = fechavoto;
        this.votante = votante;
        this.candidato = candidato;
    }

    public Integer getId() {
        return id;
    }

   public Timestamp getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Timestamp fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Timestamp getFechavoto() {
        return fechavoto;
    }

    public void setFechavoto(Timestamp fechavoto) {
        this.fechavoto = fechavoto;
    }

    public Votante getVotante() {
        return votante;
    }

    public void setVotante(Votante votante) {
        this.votante = votante;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
}
