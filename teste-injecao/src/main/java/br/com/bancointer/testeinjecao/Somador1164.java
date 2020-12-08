package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1164")
public class Somador1164 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
