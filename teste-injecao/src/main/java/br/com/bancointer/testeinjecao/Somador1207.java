package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1207")
public class Somador1207 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
