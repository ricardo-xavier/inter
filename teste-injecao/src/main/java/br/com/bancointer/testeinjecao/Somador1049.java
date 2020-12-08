package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1049")
public class Somador1049 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
