package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1809")
public class Somador1809 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
