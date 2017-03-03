package br.com.agenda.agenda.Helper;
import android.widget.EditText;
import android.widget.RatingBar;

import br.com.agenda.agenda.FormularioActivity;
import br.com.agenda.agenda.Modelo.Aluno;
import br.com.agenda.agenda.R;

/**
 * Created by duh on 01/03/17.
 */

public class FormularioHelper {

    private EditText campoNome;
    private EditText campoEndereco;
    private EditText campoTelefone;
    private EditText campoSite;
    private RatingBar campoNota;

    private Aluno aluno;


    public FormularioHelper(FormularioActivity activity){

        campoNome = (EditText)activity.findViewById(R.id.formulario_nome);
        campoEndereco = (EditText)activity.findViewById(R.id.formulario_endereco);
        campoTelefone = (EditText)activity.findViewById(R.id.formulario_telefone);
        campoSite = (EditText)activity.findViewById(R.id.formulario_site);
        campoNota = (RatingBar)activity.findViewById(R.id.formulario_nota);
        aluno = new Aluno();
    }

    public Aluno pegaAluno() {

        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(campoNota.getRating());

        return aluno;
    }

    public void preencheFormulario(Aluno aluno) {

        campoNome.setText(aluno.getNome());
        campoEndereco.setText(aluno.getEndereco());
        campoTelefone.setText(aluno.getTelefone());
        campoSite.setText(aluno.getSite());
        campoNota.setRating(aluno.getNota());

        this.aluno = aluno;
    }
}
