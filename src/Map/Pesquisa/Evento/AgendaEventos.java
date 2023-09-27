package Map.Pesquisa.Evento;

import jdk.jfr.Event;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;


    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data,evento);

    }

    public void exibirAgenda(){
        Map<LocalDate,Evento> agenda = new TreeMap<>(eventosMap);

        System.out.println(agenda);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate,Evento> agenda = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate,Evento> entry: eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: "+ proximoEvento + " acontecera na data "+proximaData);
                break;
            }
        }

    }





}

