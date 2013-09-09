package m.zapata.icaro;

/**
 * Created by miguelo on 09-09-13.
 */
public class ResultadoAsyncTask<T> {

    private T resultado;
    private Exception error;


    public T obtenerResultado() {
        return resultado;
    }

    public Exception obtenerError() {
        return error;
    }

    public ResultadoAsyncTask(T resultado) {
        this.resultado = resultado;
    }

    public ResultadoAsyncTask(Exception error) {
        this.error = error;
    }
}
