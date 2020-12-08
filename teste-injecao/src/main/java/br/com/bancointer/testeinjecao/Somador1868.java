package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1868")
public class Somador1868 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
