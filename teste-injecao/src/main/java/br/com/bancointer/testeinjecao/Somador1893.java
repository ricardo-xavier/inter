package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1893")
public class Somador1893 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
