package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
@Builder //Quando a gente for criar um objeto USDBRL, a gente não vai precisar instanciar um valor para cada variável e ter um contrutor diferente pra cada conjunto
//de variáveis passadas
@AllArgsConstructor // Cria um construtor padrão com todas as variáveis disponíveis
@Jacksonized //Ele permite que essa classe seja lida como um json
@Data //Evita da gente precisar criar os getters e setters
public class USDBRL {

    public String code;
    public String codein;
    public String name;
    public String high;
    public String low;
    public String varBid;
    public String pctChange;
    public String bid;
    public String ask;
    public String timestamp;
    public String create_date;

}
