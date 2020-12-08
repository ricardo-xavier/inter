package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1997")
public class Somador1997 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
