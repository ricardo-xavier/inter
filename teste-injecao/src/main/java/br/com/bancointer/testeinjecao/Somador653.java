package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador653")
public class Somador653 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
