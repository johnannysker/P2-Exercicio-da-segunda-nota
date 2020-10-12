package br.edu.unifacisa.p2.facisaflix;

import java.util.ArrayList;
import java.util.List;

public class FacisaFlix {
  private List<Serie> series;
  private List<Usuario> usuarios;
  
  public FacisaFlix() {
    series = new ArrayList<>();
    usuarios = new ArrayList<>();
  }
  
  public void adicionaSerie(Serie serie) {
    series.add(serie);
  }
  
  public void adicionaUsuario(Usuario usuario) {
    usuarios.add(usuario);
  }
  
  public void registraVisualizacao(Usuario usuario, Episodio episodio, int nota) {
    Visualizacao v = new Visualizacao(episodio, nota);
    usuario.adicionaVisualizacao(v);
  }
  
  public List<Serie> getTodasAsSeries() {
    return series;
  }
  
  public List<Serie> getSeriesPorEstilo(int estilo) {
	  List<Serie> seriesPorEstilo = new ArrayList<>();
	  for (Serie s : series) {
		  if (s.getEstilo() == estilo) {
			  seriesPorEstilo.add(s);
		  }
		
	}
    return seriesPorEstilo;
  }
  
  public List<Serie> getSeriesPorClassificacao(int classificacao) {
	  List<Serie> seriePorClassificacao = new ArrayList<>();
	  for (Serie s : series) {
		  if(s.getClassificacao() == classificacao) {
			  seriePorClassificacao.add(s);
		  }
		
	}
    return seriePorClassificacao;
  }
  
	public List<Serie> getSeriesQueViu(Usuario usuario) {
		List<Serie> serieQueViu = new ArrayList<>();
		for (Usuario u : usuarios) {
			if (u.equals(usuario)) {
				for (Visualizacao v : u.getVisualizacoes()) {
					for (Temporada s : v.getEpisodio()) {
						serieQueViu.add(s.getSerie());
					}
				}
			}
		}
		return serieQueViu;
	}
  
  public List<Serie> getSeriesEmComum(Usuario u1, Usuario u2) {
    return null;
  }
  
  public int getQuantidadeDeSeries() {
    return series.size();
  }
  
  public int getQuantidadeTotalDeEpisodios() {
	  int numEpisodios = 0;
	  // para cada s�rie
	  for (Serie s : series) {
		  // percorrer cada temporada
		  for (Temporada t : s.getTemporadas()) {
			  numEpisodios += t.getEpisodios().size();
				
			}
			
		}
		
    return numEpisodios;
  }
  
  public int getQuantidadeTotalDeMinutos() {
	  int totalDeMinutos = 0;
	  for (Serie s : series) {
		  for (Temporada t : s.getTemporadas()) {
			  for (Episodio e : t.getEpisodios()) {
				  totalDeMinutos += e.getDuracao();
				
			}
			
		}
		
	}
    return totalDeMinutos;
  }
}
